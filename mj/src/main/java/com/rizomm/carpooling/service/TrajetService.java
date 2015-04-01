package com.rizomm.carpooling.service;

import com.rizomm.carpooling.model.Trajet;

public interface TrajetService {
	Trajet saveTrajet(Trajet trajet);
	int getMaxId();
}
