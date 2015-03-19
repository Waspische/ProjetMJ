package com.rizomm.carpooling.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rizomm.carpooling.dao.UtilisateurDAO;
import com.rizomm.carpooling.model.Utilisateur;

@Repository("utilisateurDAO")
public class UtilisateurDAOImpl implements UtilisateurDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public UtilisateurDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public UtilisateurDAOImpl() {
	}

	@Override
	public Utilisateur save(Utilisateur utilisateur) {
		return (Utilisateur) sessionFactory.getCurrentSession().save(utilisateur);
	}
}
