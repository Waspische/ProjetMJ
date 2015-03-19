package com.rizomm.carpooling.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.rizomm.carpooling.form.UtilisateurForm;

public class UtilisateurValidator implements Validator {

	@Override
	public boolean supports(Class clazz) {
		return UtilisateurForm.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors e) {
		UtilisateurForm utilisateurForm = (UtilisateurForm) obj;
		if(!utilisateurForm.getPassword().equals(utilisateurForm.getConfirmation()))
		{
			e.rejectValue("confirmation", "erreur.confirmation", new String[]{"confirmation"}, "La confirmation n'est pas validée");
		}
	}

}
