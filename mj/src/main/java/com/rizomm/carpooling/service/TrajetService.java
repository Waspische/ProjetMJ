package com.rizomm.carpooling.service;

import java.util.List;

import com.rizomm.carpooling.form.ReservationForm;
import com.rizomm.carpooling.model.Trajet;

public interface TrajetService {
	Trajet saveTrajet(Trajet trajet);
	int getMaxId();
	Trajet getTrajetById(int id);
	List<Trajet> getTousLesTrajets();
	List<Trajet> getTrajetsAvecParametres(ReservationForm reservationForm);
}
