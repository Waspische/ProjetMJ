package com.rizomm.carpooling.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rizomm.carpooling.form.UtilisateurForm;
import com.rizomm.carpooling.model.Utilisateur;
import com.rizomm.carpooling.service.UtilisateurService;

@Controller
public class UtilisateurController {
 
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
	  
	  if (!result.hasErrors()) {
		  Utilisateur uti = new Utilisateur();
		  uti.setLogin(utilisateurForm.getLogin());
		  uti.setPassword(utilisateurForm.getPassword());
		  uti.setRolId(2);
	      if(creerUtilisateur(uti, result)!=null)
	      {
	    	  model.addObject("create", "Votre compte a été créé avec succès !");
	    	  model.setViewName("/login");
	      }
	      else
	      {
	    	  model.addObject("error", "Erreur lors de la création du compte !");
	    	  model.setViewName("/nouveau_compte");
	      }
	  }
	  else
	  {
		  StringBuffer str = new StringBuffer();
		  str.append("Erreur(s) dans le formulaire :"); 
		  for(FieldError err : result.getFieldErrors())
		  {
			  str.append("\n");
			  str.append(" - le champ "+err.getField()+" ");
			  if(err.getDefaultMessage()==null)
				  str.append(err.getCodes()[3]);
			  else
				  str.append(": "+err.getDefaultMessage());
		  }
		  result.rejectValue("error", str.toString());
	  }
	  
	  
	  model.setViewName("/nouveau_compte");
 
	  return model;
	  
	}
	
	private Utilisateur creerUtilisateur(Utilisateur utilisateur, BindingResult result) {
	    Utilisateur uti;
		try {
	    	uti = utilisateurService.saveUtilisateur(utilisateur);
	    } catch (Exception e) {
	        return null;
	    }    
	    return uti;
	}
}
