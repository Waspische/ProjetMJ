package com.rizomm.carpooling.dao;

import com.rizomm.carpooling.model.Utilisateur;


public interface UtilisateurDAO {
	public Utilisateur save(Utilisateur utilisateur);
	public Utilisateur getUtilisateurByLogin(String utilisateur);
}
