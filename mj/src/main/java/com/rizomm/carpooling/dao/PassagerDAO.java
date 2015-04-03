package com.rizomm.carpooling.dao;

import java.util.List;

import com.rizomm.carpooling.model.Passager;
import com.rizomm.carpooling.model.Trajet;
import com.rizomm.carpooling.model.Utilisateur;

public interface PassagerDAO {
	List<Passager> getPassagerByUtilisateur(Utilisateur uti);
	List<Passager> getPassagerByTrajet(Trajet tra);
	Passager savePassager(Passager pas);
	int getMaxId();
}
