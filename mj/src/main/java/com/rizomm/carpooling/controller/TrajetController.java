package com.rizomm.carpooling.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rizomm.carpooling.form.TrajetForm;
import com.rizomm.carpooling.model.Trajet;
import com.rizomm.carpooling.service.TrajetService;
import com.rizomm.carpooling.service.TypeVoitureService;
import com.rizomm.carpooling.service.VilleService;
import com.rizomm.carpooling.validator.TrajetValidator;

@Controller
public class TrajetController {
 
	@Autowired
	private TrajetService trajetService;
	@Autowired
	private VilleService villeService;
	@Autowired
	private TypeVoitureService typeVoitureService;
	@Autowired
	private TrajetValidator trajetValidator;
	
	@RequestMapping(value = {"/views/nouveau_trajet"}, method = RequestMethod.GET)
	public ModelAndView nouveau_trajet(@RequestParam(value = "error", required = false) String error) {
 
	  ModelAndView model = new ModelAndView();
	  TrajetForm trajetForm = new TrajetForm();
	  
	  //check if user is login
	  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	  if (!(auth instanceof AnonymousAuthenticationToken)) {
		UserDetails userDetail = (UserDetails) auth.getPrincipal();	
		model.addObject("username", userDetail.getUsername());
	  }
	  
	  if (error != null) {
		model.addObject("error", error);
	  }
	  
	  model.addObject("trajetForm", trajetForm);
	  model.setViewName("/views/nouveau_trajet");
 
	  return model;
	}
	
	@RequestMapping(value = {"/views/nouveau_trajet"}, method = RequestMethod.POST)
	public ModelAndView creer_trajet(@ModelAttribute @Valid TrajetForm trajetForm, BindingResult result) {
 
	  ModelAndView model = new ModelAndView();
	  model.setViewName("/views/nouveau_trajet");
	  
	  trajetValidator.validate(trajetForm, result);
	  
	  if (!result.hasErrors()) {
		  Trajet tra = new Trajet();
		  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		  try {
			  tra.setDateCreation(formatter.parse(trajetForm.getDateDepart()));
		  } catch (ParseException e) {
			  model.addObject("error", "Erreur dans la date lors de l'insertion ...");
			  model.setViewName("/views/nouveau_trajet");
			  return model;
		  }
		  tra.setId(trajetService.getMaxId()+1);
		  tra.setIdTypeVoiture(typeVoitureService.getTypeVoitureByLibelle(trajetForm.getTypeVoiture()).getId());
		  tra.setIdVilleArrivee(villeService.getVilleByLibelle(trajetForm.getPointArrivee()).getId());
		  tra.setIdVilleDepart(villeService.getVilleByLibelle(trajetForm.getPointDepart()).getId());
		  tra.setNbPassager(Integer.valueOf(trajetForm.getNbPassager()));
		  
		  tra = trajetService.saveTrajet(tra);
			  
		  if(tra!=null)
		  {
			  model.addObject("create", "Votre trajet a été créé avec succès !");
			  model.setViewName("/views/hello");
		  }
		  else
		  {
			  model.addObject("error", "Le trajet n'a pas été inséré correctement ...");
			  model.setViewName("/views/nouveau_trajet");
		  }

	  }
	  else
	  {
		  StringBuffer str = new StringBuffer();
		  str.append("Erreur(s) dans le formulaire :"); 
		  for(FieldError err : result.getFieldErrors())
		  {
			  str.append("<br/>");
			  str.append(" - le champ "+err.getField()+" ");
			  if(err.getDefaultMessage()==null)
				  str.append(err.getCodes()[3]);
			  else
				  str.append(": "+err.getDefaultMessage());
		  }
		  model.addObject("error", str.toString());
	  }
 
	  return model;
	}
	
}
