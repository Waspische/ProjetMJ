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
public class Reservation implements Serializable {
	public Reservation() {
	}
	
	private int ID;
	
	private String dateReservation;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setDateReservation(String value) {
		this.dateReservation = value;
	}
	
	public String getDateReservation() {
		return dateReservation;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
