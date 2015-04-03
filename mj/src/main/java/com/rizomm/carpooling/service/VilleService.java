package com.rizomm.carpooling.service;

import com.rizomm.carpooling.model.Ville;

public interface VilleService {
	Ville getVilleByLibelle(String libelle);
	Ville getVilleById(int id);
}
