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

public interface MembreDAO {
	public Membre loadMembreByORMID(int ID) throws PersistentException;
	public Membre getMembreByORMID(int ID) throws PersistentException;
	public Membre loadMembreByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Membre getMembreByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Membre loadMembreByORMID(PersistentSession session, int ID) throws PersistentException;
	public Membre getMembreByORMID(PersistentSession session, int ID) throws PersistentException;
	public Membre loadMembreByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Membre getMembreByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Membre[] listMembreByQuery(String condition, String orderBy) throws PersistentException;
	public Membre[] listMembreByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryMembre(String condition, String orderBy) throws PersistentException;
	public java.util.List queryMembre(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateMembreByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateMembreByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Membre[] listMembreByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Membre[] listMembreByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryMembre(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryMembre(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateMembreByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateMembreByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Membre loadMembreByQuery(String condition, String orderBy) throws PersistentException;
	public Membre loadMembreByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Membre loadMembreByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Membre loadMembreByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Membre createMembre();
	public boolean save(com.rizomm.carpooling.model.Membre membre) throws PersistentException;
	public boolean delete(com.rizomm.carpooling.model.Membre membre) throws PersistentException;
	public boolean refresh(com.rizomm.carpooling.model.Membre membre) throws PersistentException;
	public boolean evict(com.rizomm.carpooling.model.Membre membre) throws PersistentException;
}
