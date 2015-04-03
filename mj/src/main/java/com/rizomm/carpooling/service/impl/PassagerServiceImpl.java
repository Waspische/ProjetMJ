package com.rizomm.carpooling.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rizomm.carpooling.dao.PassagerDAO;
import com.rizomm.carpooling.model.Passager;
import com.rizomm.carpooling.model.Trajet;
import com.rizomm.carpooling.model.Utilisateur;
import com.rizomm.carpooling.service.PassagerService;

@Service("passagerService")
public class PassagerServiceImpl implements PassagerService {

	@Autowired
	PassagerDAO passagerDAO;

	@Override
	@Transactional
	public List<Passager> getPassagerByUtilisateur(Utilisateur uti) {
		return passagerDAO.getPassagerByUtilisateur(uti);
	}

	@Override
	@Transactional
	public List<Passager> getPassagerByTrajet(Trajet tra) {
		return passagerDAO.getPassagerByTrajet(tra);
	}

	@Override
	@Transactional
	public Passager savePassager(Passager pas) {
		return passagerDAO.savePassager(pas);
	}

	@Override
	@Transactional
	public int getMaxId() {
		return passagerDAO.getMaxId();
	}
}
