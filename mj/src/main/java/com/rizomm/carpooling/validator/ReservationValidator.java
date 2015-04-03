package com.rizomm.carpooling.validator;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.rizomm.carpooling.form.ReservationForm;
import com.rizomm.carpooling.service.VilleService;

@Component
public class ReservationValidator implements Validator {

	@Autowired
	private VilleService villeService;
	
	@Override
	public boolean supports(Class clazz) {
		return ReservationForm.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors e) {
		ReservationForm reservationForm = (ReservationForm) obj;
		
		//Point Depart
		if(reservationForm.getRechercheForm().getPointDepart()!="" && villeService.getVilleByLibelle(reservationForm.getRechercheForm().getPointDepart())==null)
		{
			e.rejectValue("pointDepart", "erreur.pointDepart", new String[]{"pointDepart"}, "La ville de départ n'existe pas en base.");
		}
		
		//Point Arrivee
		if(reservationForm.getRechercheForm().getPointArrivee()!="" && villeService.getVilleByLibelle(reservationForm.getRechercheForm().getPointArrivee())==null)
		{
			e.rejectValue("pointArrivee", "erreur.pointArrivee", new String[]{"pointArrivee"}, "La ville d'arrivée n'existe pas en base.");
		}
		
		//Points Depart et Arrivee
		if(reservationForm.getRechercheForm().getPointDepart()!="" && reservationForm.getRechercheForm().getPointArrivee()!=null && reservationForm.getRechercheForm().getPointDepart().equals((reservationForm.getRechercheForm().getPointArrivee())))
		{
			e.rejectValue("pointArrivee", "erreur.pointArrivee", new String[]{"pointArrivee"}, "La ville d'arrivée est identique à la ville de départ");
		}
		
		//Format date
		if(reservationForm.getRechercheForm().getDateDepart()!="")
		{
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			try {
				formatter.parse(reservationForm.getRechercheForm().getDateDepart());
			} catch(Exception ex) {
				e.rejectValue("dateDepart", "erreur.dateDepart", new String[]{"dateDepart"}, "La date de départ n'est pas correct.");
			}
		}
		
	}

}
