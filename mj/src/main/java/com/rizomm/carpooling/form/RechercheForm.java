package com.rizomm.carpooling.form;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.rizomm.carpooling.model.ReservationRow;
import com.rizomm.carpooling.model.Trajet;

public class RechercheForm {

	@Length(max=100)
	private String pointDepart;
	
	@Length(max=100)
	private String pointArrivee;
	
	@Length(max=16)
	private String dateDepart;
	
	private List<ReservationRow> reservationRow;
	
	private Boolean placesDispo;

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

	public Boolean getPlacesDispo() {
		return placesDispo;
	}

	public void setPlacesDispo(Boolean placesDispo) {
		this.placesDispo = placesDispo;
	}

	public List<ReservationRow> getReservationRow() {
		return reservationRow;
	}

	public void setReservationRow(List<ReservationRow> reservationRow) {
		this.reservationRow = reservationRow;
	}

	
}
