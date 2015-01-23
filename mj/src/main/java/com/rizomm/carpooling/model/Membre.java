/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package com.rizomm.carpooling.model;

import java.io.Serializable;
public class Membre implements Serializable {
	public Membre() {
	}
	
	private int ID;
	
	private String nomMembre;
	
	private String prenomMembre;
	
	private java.util.Set reservations = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNomMembre(String value) {
		this.nomMembre = value;
	}
	
	public String getNomMembre() {
		return nomMembre;
	}
	
	public void setPrenomMembre(String value) {
		this.prenomMembre = value;
	}
	
	public String getPrenomMembre() {
		return prenomMembre;
	}
	
	public void setReservations(java.util.Set value) {
		this.reservations = value;
	}
	
	public java.util.Set getReservations() {
		return reservations;
	}
	
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
