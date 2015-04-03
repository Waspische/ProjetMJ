package com.rizomm.carpooling.form;


public class ReservationForm {

	private RechercheForm rechercheForm;
	private ReservationRowForm reservationRowForm;
	
	public ReservationForm() {
		rechercheForm = new RechercheForm();
		reservationRowForm = new ReservationRowForm();
	}
	
	public RechercheForm getRechercheForm() {
		return rechercheForm;
	}
	public void setRechercheForm(RechercheForm rechercheForm) {
		this.rechercheForm = rechercheForm;
	}
	public ReservationRowForm getReservationRowForm() {
		return reservationRowForm;
	}
	public void setReservationRowForm(ReservationRowForm reservationRowForm) {
		this.reservationRowForm = reservationRowForm;
	}
	
}
