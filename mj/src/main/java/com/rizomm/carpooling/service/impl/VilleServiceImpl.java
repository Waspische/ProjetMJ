package com.rizomm.carpooling.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rizomm.carpooling.dao.VilleDAO;
import com.rizomm.carpooling.model.Ville;
import com.rizomm.carpooling.service.VilleService;

@Service("villeService")
public class VilleServiceImpl implements VilleService {

	@Autowired
	VilleDAO villeDAO;

	@Override
	@Transactional
	public Ville getVilleByLibelle(String libelle) {
		return villeDAO.getVilleByLibelle(libelle);
	}

	@Override
	@Transactional
	public Ville getVilleById(int id) {
		return villeDAO.getVilleById(id);
	}	
}
