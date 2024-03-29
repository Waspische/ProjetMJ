package com.rizomm.carpooling.form;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class UtilisateurForm {

	@Length(max=80)
	private String nom;
	
	@Length(max=80)
	private String prenom;
	
	@NotEmpty
	@Length(max=30)
	private String login;
	
	@NotEmpty
	@Length(max=30)
	private String password;
	
	@NotEmpty
	@Length(max=30)
	private String confirmation;
	
	@Length(max=80)
	private String email;
	
	@Length(max=10)
	private String telephone;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
}
