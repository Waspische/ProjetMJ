package com.rizomm.carpooling.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value = { "/views/hello" }, method = RequestMethod.GET)
	public ModelAndView mainPage() {
		
	  ModelAndView model = new ModelAndView();
	  
	  //check if user is login
	  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	  if (!(auth instanceof AnonymousAuthenticationToken)) {
		UserDetails userDetail = (UserDetails) auth.getPrincipal();	
		model.addObject("username", userDetail.getUsername());
	  }
	  model.setViewName("/views/hello");
	  
	  return model;
	  
	}
 
	@RequestMapping(value = {"/","/login"}, method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout,
		@RequestParam(value = "create", required = false) String create) {
 
	  ModelAndView model = new ModelAndView();
	  
	  if (error != null) {
		model.addObject("error", "Mauvais login et mot de passe !");
	  }
	  if (logout != null) {
		//check if user is login
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (!(auth instanceof AnonymousAuthenticationToken)) {
	    	
	    }
		model.addObject("msg", "Vous êtes maintenant déconnecté.");
	  }
	  if (create != null) {
		model.addObject("create", create);
	  }
	  
	  model.setViewName("/login");
 
	  return model;
	  
	}
 
	//for 403 access denied page
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView accesssDenied() {
 
	  ModelAndView model = new ModelAndView();
 
	  //check if user is login
	  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	  if (!(auth instanceof AnonymousAuthenticationToken)) {
		UserDetails userDetail = (UserDetails) auth.getPrincipal();	
		model.addObject("username", userDetail.getUsername());
	  }
 
	  model.setViewName("/403");
	  return model;
	  
	}
}
