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
package com.rizomm.carpooling.model.dao;

import org.orm.*;
import org.hibernate.LockMode;
import com.rizomm.carpooling.model.*;

public interface ReservationDAO {
	public Reservation loadReservationByORMID(int ID) throws PersistentException;
	public Reservation getReservationByORMID(int ID) throws PersistentException;
	public Reservation loadReservationByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Reservation getReservationByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Reservation loadReservationByORMID(PersistentSession session, int ID) throws PersistentException;
	public Reservation getReservationByORMID(PersistentSession session, int ID) throws PersistentException;
	public Reservation loadReservationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Reservation getReservationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Reservation[] listReservationByQuery(String condition, String orderBy) throws PersistentException;
	public Reservation[] listReservationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryReservation(String condition, String orderBy) throws PersistentException;
	public java.util.List queryReservation(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateReservationByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateReservationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Reservation[] listReservationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Reservation[] listReservationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryReservation(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryReservation(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateReservationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateReservationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Reservation loadReservationByQuery(String condition, String orderBy) throws PersistentException;
	public Reservation loadReservationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Reservation loadReservationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Reservation loadReservationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Reservation createReservation();
	public boolean save(com.rizomm.carpooling.model.Reservation reservation) throws PersistentException;
	public boolean delete(com.rizomm.carpooling.model.Reservation reservation) throws PersistentException;
	public boolean refresh(com.rizomm.carpooling.model.Reservation reservation) throws PersistentException;
	public boolean evict(com.rizomm.carpooling.model.Reservation reservation) throws PersistentException;
}
