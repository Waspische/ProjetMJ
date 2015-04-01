package com.rizomm.carpooling.form;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class TrajetForm {

	@NotEmpty
	@NotNull
	@Length(max=100)
	private String typeVoiture;
	
	@NotEmpty
	@NotNull
	@Length(max=100)
	private String pointDepart;
	
	@NotEmpty
	@NotNull
	@Length(max=100)
	private String pointArrivee;
	
	@NotEmpty
	@NotNull
	@Length(max=10)
	private String dateDepart;
	
	@NotEmpty
	@NotNull
	@Length(max=11)
	private String nbPassager;

	public String getTypeVoiture() {
		return typeVoiture;
	}

	public void setTypeVoiture(String typeVoiture) {
		this.typeVoiture = typeVoiture;
	}

	public String getPointDepart() {
		return pointDepart;
	}

	public void setPointDepart(String pointDepart) {
		this.pointDepart = pointDepart;
	}

	public String getPointArrivee() {
		return pointArrivee;
	}

	public void setPointArrivee(String pointArrivee) {
		this.pointArrivee = pointArrivee;
	}

	public String getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(String dateDepart) {
		this.dateDepart = dateDepart;
	}

	public String getNbPassager() {
		return nbPassager;
	}

	public void setNbPassager(String nbPassager) {
		this.nbPassager = nbPassager;
	}
	
	
	
	
}
