package com.rizomm.carpooling.model;

public class ReservationRow {
	
	private int trajetId;
	private String villeDepart;
	private String villeArrivee;
	private String dateDepart;	
	private int nbPassager;
	private int placesDisponibles;
	
	public ReservationRow(int trajetId, String villeDepart, String villeArrivee, String dateDepart, int nbPassager, int placesDisponibles){
		this.trajetId = trajetId;
		this.villeArrivee = villeArrivee;
		this.villeDepart = villeDepart;
		this.dateDepart = dateDepart;
		this.nbPassager = nbPassager;
		this.placesDisponibles = placesDisponibles;
	}
	
	public int getTrajetId() {
		return trajetId;
	}
	public void setTrajetId(int trajetId) {
		this.trajetId = trajetId;
	}
	public String getVilleDepart() {
		return villeDepart;
	}
	public void setVilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;
	}
	public String getVilleArrivee() {
		return villeArrivee;
	}
	public void setVilleArrivee(String villeArrivee) {
		this.villeArrivee = villeArrivee;
	}
	public String getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(String dateDepart) {
		this.dateDepart = dateDepart;
	}
	public int getNbPassager() {
		return nbPassager;
	}
	public void setNbPassager(int nbPassager) {
		this.nbPassager = nbPassager;
	}
	public int getPlacesDisponibles() {
		return placesDisponibles;
	}
	public void setPlacesDisponibles(int placesDisponibles) {
		this.placesDisponibles = placesDisponibles;
	}
	
}
