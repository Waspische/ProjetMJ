package com.rizomm.carpooling.dao.impl;

import org.hibernate.Query;
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
		sessionFactory.getCurrentSession().save(utilisateur);
		return utilisateur; 
	}

	@Override
	public Utilisateur getUtilisateurByLogin(Utilisateur utilisateur) {
		Query query = sessionFactory.getCurrentSession().getNamedQuery("UtilisateurByLogin");
		query.setString("login", utilisateur.getLogin());
		if(query.list().size()>0)
			return (Utilisateur) query.list().get(0);
		else
			return null;
	}
}
