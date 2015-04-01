package com.rizomm.carpooling.dao;

import com.rizomm.carpooling.model.Trajet;


public interface TrajetDAO {
	public Trajet save(Trajet trajet);
	public int getMaxId();
}
