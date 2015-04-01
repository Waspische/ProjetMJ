package com.rizomm.carpooling.dao.impl;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rizomm.carpooling.dao.TypeVoitureDAO;
import com.rizomm.carpooling.model.TypeVoiture;

@Repository("typeVoitureDAO")
public class TypeVoitureDAOImpl implements TypeVoitureDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public TypeVoitureDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public TypeVoitureDAOImpl() {
	}
	
	@Override
	public TypeVoiture getTypeVoitureByLibelle(String libelle) {
		Query query = sessionFactory.getCurrentSession().getNamedQuery("TypeVoitureByLibelle");
		query.setString("libelle", libelle);
		if(query.list().size()>0)
			return (TypeVoiture) query.list().get(0);
		else
			return null;
	}
}
