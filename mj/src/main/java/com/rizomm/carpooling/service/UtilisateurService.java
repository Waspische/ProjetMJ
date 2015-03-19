package com.rizomm.carpooling.service;

import com.rizomm.carpooling.model.Utilisateur;

public interface UtilisateurService {
	Utilisateur saveUtilisateur(Utilisateur utilisateur);
	Utilisateur getUtilisateurByLogin(Utilisateur uti);
}
