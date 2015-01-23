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

public class MembreDAOImpl implements com.rizomm.carpooling.model.dao.MembreDAO {
	public Membre loadMembreByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return loadMembreByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Membre getMembreByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return getMembreByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Membre loadMembreByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return loadMembreByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Membre getMembreByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return getMembreByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Membre loadMembreByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Membre) session.load(com.rizomm.carpooling.model.Membre.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Membre getMembreByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Membre) session.get(com.rizomm.carpooling.model.Membre.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Membre loadMembreByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Membre) session.load(com.rizomm.carpooling.model.Membre.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Membre getMembreByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Membre) session.get(com.rizomm.carpooling.model.Membre.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryMembre(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return queryMembre(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryMembre(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return queryMembre(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Membre[] listMembreByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return listMembreByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Membre[] listMembreByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return listMembreByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryMembre(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.rizomm.carpooling.model.Membre as Membre");
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
	
	public List queryMembre(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.rizomm.carpooling.model.Membre as Membre");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Membre", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Membre[] listMembreByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMembre(session, condition, orderBy);
			return (Membre[]) list.toArray(new Membre[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Membre[] listMembreByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMembre(session, condition, orderBy, lockMode);
			return (Membre[]) list.toArray(new Membre[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Membre loadMembreByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return loadMembreByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Membre loadMembreByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return loadMembreByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Membre loadMembreByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Membre[] membres = listMembreByQuery(session, condition, orderBy);
		if (membres != null && membres.length > 0)
			return membres[0];
		else
			return null;
	}
	
	public Membre loadMembreByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Membre[] membres = listMembreByQuery(session, condition, orderBy, lockMode);
		if (membres != null && membres.length > 0)
			return membres[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateMembreByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return iterateMembreByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateMembreByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.rizomm.carpooling.model.MjPersistentManager.instance().getSession();
			return iterateMembreByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateMembreByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.rizomm.carpooling.model.Membre as Membre");
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
	
	public java.util.Iterator iterateMembreByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.rizomm.carpooling.model.Membre as Membre");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Membre", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Membre createMembre() {
		return new com.rizomm.carpooling.model.Membre();
	}
	
	public boolean save(com.rizomm.carpooling.model.Membre membre) throws PersistentException {
		try {
			com.rizomm.carpooling.model.MjPersistentManager.instance().saveObject(membre);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(com.rizomm.carpooling.model.Membre membre) throws PersistentException {
		try {
			com.rizomm.carpooling.model.MjPersistentManager.instance().deleteObject(membre);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(com.rizomm.carpooling.model.Membre membre) throws PersistentException {
		try {
			com.rizomm.carpooling.model.MjPersistentManager.instance().getSession().refresh(membre);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(com.rizomm.carpooling.model.Membre membre) throws PersistentException {
		try {
			com.rizomm.carpooling.model.MjPersistentManager.instance().getSession().evict(membre);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
