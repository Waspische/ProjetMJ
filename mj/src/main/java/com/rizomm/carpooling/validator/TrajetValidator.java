package com.rizomm.carpooling.validator;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.rizomm.carpooling.form.TrajetForm;
import com.rizomm.carpooling.service.TypeVoitureService;
import com.rizomm.carpooling.service.VilleService;

@Component
public class TrajetValidator implements Validator {

	@Autowired
	private VilleService villeService;
	
	@Autowired
	private TypeVoitureService typeVoitureService;
	
	@Override
	public boolean supports(Class clazz) {
		return TrajetForm.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors e) {
		TrajetForm trajetForm = (TrajetForm) obj;
		
		//Point Depart
		if(villeService.getVilleByLibelle(trajetForm.getPointDepart())==null)
		{
			e.rejectValue("pointDepart", "erreur.pointDepart", new String[]{"pointDepart"}, "La ville de départ n'existe pas en base.");
		}
		
		//Point Arrivee
		if(villeService.getVilleByLibelle(trajetForm.getPointArrivee())==null)
		{
			e.rejectValue("pointArrivee", "erreur.pointArrivee", new String[]{"pointArrivee"}, "La ville d'arrivée n'existe pas en base.");
		}
		
		//Points Depart et Arrivee
		if(trajetForm.getPointDepart().equals((trajetForm.getPointArrivee())))
		{
			e.rejectValue("pointArrivee", "erreur.pointArrivee", new String[]{"pointArrivee"}, "La ville d'arrivée est identique à la ville de départ");
		}
		
		//Type Voiture
		if(typeVoitureService.getTypeVoitureByLibelle(trajetForm.getTypeVoiture())==null)
		{
			e.rejectValue("typeVoiture", "erreur.typeVoiture", new String[]{"typeVoiture"}, "Le type de voiture n'existe pas en base.");
		}
		
		//NB passager
		try { 
	        Integer.parseInt(trajetForm.getNbPassager()); 
		} catch(Exception ex) {
	    	e.rejectValue("nbPassager", "erreur.nbPassager", new String[]{"nbPassager"}, "Le nombre de passager n'est pas correct.");
	    }
		
		//Format date
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			formatter.parse(trajetForm.getDateDepart());
		} catch(Exception ex) {
			e.rejectValue("dateDepart", "erreur.dateDepart", new String[]{"dateDepart"}, "La date de départ n'est pas correct.");
		}
		
	}

}
