package com.rizomm.carpooling.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rizomm.carpooling.dao.PassagerDAO;
import com.rizomm.carpooling.model.Passager;
import com.rizomm.carpooling.model.Trajet;
import com.rizomm.carpooling.model.Utilisateur;

@Repository("passagerDAO")
public class PassagerDAOImpl implements PassagerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public PassagerDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public PassagerDAOImpl() {
	}

	@Override
	public List<Passager> getPassagerByUtilisateur(Utilisateur uti) {
		Query query = sessionFactory.getCurrentSession().getNamedQuery("PassagerByUtilisateur");
		query.setInteger("uti", uti.getId());
		return query.list();
	}

	@Override
	public List<Passager> getPassagerByTrajet(Trajet tra) {
		Query query = sessionFactory.getCurrentSession().getNamedQuery("PassagerByTrajet");
		query.setInteger("tra", tra.getId());
		return query.list();
	}

	@Override
	public Passager savePassager(Passager pas) {
		sessionFactory.getCurrentSession().save(pas);
		return pas; 
	}

	@Override
	public int getMaxId() {
		Criteria criteria = sessionFactory.getCurrentSession()
			    .createCriteria(Passager.class)
			    .setProjection(Projections.max("id"));
		if(criteria.uniqueResult()!=null)
			return (Integer)criteria.uniqueResult();
		else
			return 0;
	}

}
