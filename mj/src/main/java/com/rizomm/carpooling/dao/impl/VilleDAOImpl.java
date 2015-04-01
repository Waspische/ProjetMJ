package com.rizomm.carpooling.dao.impl;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rizomm.carpooling.dao.VilleDAO;
import com.rizomm.carpooling.model.Utilisateur;
import com.rizomm.carpooling.model.Ville;

@Repository("villeDAO")
public class VilleDAOImpl implements VilleDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public VilleDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public VilleDAOImpl() {
	}
	
	@Override
	public Ville getVilleByLibelle(String libelle) {
		Query query = sessionFactory.getCurrentSession().getNamedQuery("VilleByLibelle");
		query.setString("libelle", libelle);
		if(query.list().size()>0)
			return (Ville) query.list().get(0);
		else
			return null;
	}
}
