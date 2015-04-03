package com.rizomm.carpooling.dao;

import com.rizomm.carpooling.model.Ville;


public interface VilleDAO {
	public Ville getVilleByLibelle(String libelle);
	public Ville getVilleById(int id);
}
