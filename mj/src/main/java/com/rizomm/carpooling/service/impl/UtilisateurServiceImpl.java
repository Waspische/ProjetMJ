package com.rizomm.carpooling.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rizomm.carpooling.dao.UtilisateurDAO;
import com.rizomm.carpooling.model.Utilisateur;
import com.rizomm.carpooling.service.UtilisateurService;

@Service("utilisateurService")
public class UtilisateurServiceImpl implements UtilisateurService {

	@Autowired
	UtilisateurDAO utilisateurDAO;
	
	@Override
	@Transactional
	public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
		return utilisateurDAO.save(utilisateur);
	}

	@Override
	@Transactional
	public Utilisateur getUtilisateurByLogin(Utilisateur utilisateur) {
		return utilisateurDAO.getUtilisateurByLogin(utilisateur);
	}
}
