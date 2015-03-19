package com.rizomm.carpooling.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rizomm.carpooling.form.UtilisateurForm;
import com.rizomm.carpooling.model.Utilisateur;
import com.rizomm.carpooling.service.UtilisateurService;
import com.rizomm.carpooling.validator.UtilisateurValidator;

@Controller
public class UtilisateurController {
 
	@Autowired
	private UtilisateurService utilisateurService;
	
	@RequestMapping(value = {"/nouveau_compte"}, method = RequestMethod.GET)
	public ModelAndView nouveau_compte(@RequestParam(value = "error", required = false) String error) {
 
	  ModelAndView model = new ModelAndView();
	  UtilisateurForm utilisateurForm = new UtilisateurForm();
	  
	  if (error != null) {
		model.addObject("error", error);
	  }
	  
	  model.addObject("utilisateurForm", utilisateurForm);
	  model.setViewName("/nouveau_compte");
 
	  return model;
	}
	
	@RequestMapping(value = {"/nouveau_compte"}, method = RequestMethod.POST)
	public ModelAndView creer_compte(@ModelAttribute @Valid UtilisateurForm utilisateurForm, BindingResult result) {
 
	  ModelAndView model = new ModelAndView();
	  model.setViewName("/nouveau_compte");
	  
	  UtilisateurValidator utilisateurValidator = new UtilisateurValidator();
	  utilisateurValidator.validate(utilisateurForm, result);
	  
	  if (!result.hasErrors()) {
		  Utilisateur uti = new Utilisateur(utilisateurForm.getLogin(), utilisateurForm.getPassword(), 2,
				  							utilisateurForm.getNom(), utilisateurForm.getPrenom(), 
				  							utilisateurForm.getEmail(), utilisateurForm.getTelephone());
		  if(utilisateurService.getUtilisateurByLogin(uti)==null)
		  {
			  uti = utilisateurService.saveUtilisateur(uti);
			  
			  if(uti!=null)
			  {
				  model.addObject("create", "Votre compte a été créé avec succès !");
				  model.setViewName("/login");
			  }
			  else
			  {
				  model.addObject("error", "L'utilisateur n'a pas été inséré correctement ...");
				  model.setViewName("/nouveau_compte");
			  }
		  }
		  else
		  {
			  model.addObject("error", "L'utilisateur existe déjà en base de données.");
			  model.setViewName("/nouveau_compte"); 
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
