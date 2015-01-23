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
package com.rizomm.carpooling.model.impl;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;
import com.rizomm.carpooling.model.*;

public class ReservationDAOImpl implements com.rizomm.carpooling.model.dao.ReservationDAO {
	public Reservation loadReservationByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return loadReservationByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Reservation getReservationByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return getReservationByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Reservation loadReservationByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return loadReservationByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Reservation getReservationByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return getReservationByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Reservation loadReservationByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Reservation) session.load(com.rizomm.carpooling.model.Reservation.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Reservation getReservationByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Reservation) session.get(com.rizomm.carpooling.model.Reservation.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Reservation loadReservationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Reservation) session.load(com.rizomm.carpooling.model.Reservation.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Reservation getReservationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Reservation) session.get(com.rizomm.carpooling.model.Reservation.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryReservation(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return queryReservation(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryReservation(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return queryReservation(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Reservation[] listReservationByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return listReservationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Reservation[] listReservationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return listReservationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryReservation(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.rizomm.carpooling.model.Reservation as Reservation");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryReservation(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.rizomm.carpooling.model.Reservation as Reservation");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Reservation", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Reservation[] listReservationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryReservation(session, condition, orderBy);
			return (Reservation[]) list.toArray(new Reservation[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Reservation[] listReservationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryReservation(session, condition, orderBy, lockMode);
			return (Reservation[]) list.toArray(new Reservation[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Reservation loadReservationByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return loadReservationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Reservation loadReservationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return loadReservationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Reservation loadReservationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Reservation[] reservations = listReservationByQuery(session, condition, orderBy);
		if (reservations != null && reservations.length > 0)
			return reservations[0];
		else
			return null;
	}
	
	public Reservation loadReservationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Reservation[] reservations = listReservationByQuery(session, condition, orderBy, lockMode);
		if (reservations != null && reservations.length > 0)
			return reservations[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateReservationByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return iterateReservationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateReservationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return iterateReservationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateReservationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.rizomm.carpooling.model.Reservation as Reservation");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateReservationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.rizomm.carpooling.model.Reservation as Reservation");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Reservation", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Reservation createReservation() {
		return new com.rizomm.carpooling.model.Reservation();
	}
	
	public boolean save(com.rizomm.carpooling.model.Reservation reservation) throws PersistentException {
		try {
			com.rizomm.carpooling.model.MjPersistentManager.instance().saveObject(reservation);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(com.rizomm.carpooling.model.Reservation reservation) throws PersistentException {
		try {
			com.rizomm.carpooling.model.MjPersistentManager.instance().deleteObject(reservation);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(com.rizomm.carpooling.model.Reservation reservation) throws PersistentException {
		try {
			com.rizomm.carpooling.model.MjPersistentManager.instance().getSession().refresh(reservation);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(com.rizomm.carpooling.model.Reservation reservation) throws PersistentException {
		try {
			com.rizomm.carpooling.model.MjPersistentManager.instance().getSession().evict(reservation);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
