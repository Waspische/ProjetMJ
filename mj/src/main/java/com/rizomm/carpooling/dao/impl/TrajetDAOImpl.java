package com.rizomm.carpooling.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rizomm.carpooling.dao.TrajetDAO;
import com.rizomm.carpooling.model.Trajet;

@Repository("trajetDAO")
public class TrajetDAOImpl implements TrajetDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public TrajetDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public TrajetDAOImpl() {
	}

	@Override
	public Trajet save(Trajet trajet) {
		sessionFactory.getCurrentSession().save(trajet);
		return trajet; 
	}

	@Override
	public int getMaxId() {
		Criteria criteria = sessionFactory.getCurrentSession()
			    .createCriteria(Trajet.class)
			    .setProjection(Projections.max("id"));
		if(criteria.uniqueResult()!=null)
			return (Integer)criteria.uniqueResult();
		else
			return 0;
	}
}
