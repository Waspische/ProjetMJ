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

import com.rizomm.carpooling.model.dao.*;
import com.rizomm.carpooling.model.impl.*;

public class DAOFactoryImpl extends DAOFactory {
	private MembreDAO _membreDAO = new MembreDAOImpl();
	public MembreDAO getMembreDAO() {
		return _membreDAO;
	}
	
	private ReservationDAO _reservationDAO = new ReservationDAOImpl();
	public ReservationDAO getReservationDAO() {
		return _reservationDAO;
	}
	
}

