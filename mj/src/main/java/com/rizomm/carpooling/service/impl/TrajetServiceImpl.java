package com.rizomm.carpooling.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rizomm.carpooling.dao.TrajetDAO;
import com.rizomm.carpooling.model.Trajet;
import com.rizomm.carpooling.service.TrajetService;

@Service("trajetService")
public class TrajetServiceImpl implements TrajetService {

	@Autowired
	TrajetDAO trajetDAO;

	@Override
	@Transactional
	public Trajet saveTrajet(Trajet trajet) {
		return trajetDAO.save(trajet);
	}

	@Override
	@Transactional
	public int getMaxId() {
		return trajetDAO.getMaxId();
	}	
}