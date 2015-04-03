package com.rizomm.carpooling.service;

import java.util.List;

import com.rizomm.carpooling.model.Passager;
import com.rizomm.carpooling.model.Trajet;
import com.rizomm.carpooling.model.Utilisateur;

public interface PassagerService {
	Passager savePassager(Passager pas);
	List<Passager> getPassagerByUtilisateur(Utilisateur uti);
	List<Passager> getPassagerByTrajet(Trajet tra);
	int getMaxId();
}
