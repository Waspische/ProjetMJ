package com.rizomm.carpooling.dao;

import java.util.List;

import com.rizomm.carpooling.form.ReservationForm;
import com.rizomm.carpooling.model.Trajet;


public interface TrajetDAO {
	public Trajet save(Trajet trajet);
	public int getMaxId();
	public List<Trajet> getTousLesTrajets();
	public List<Trajet> getTrajetsAvecParametres(ReservationForm reservationForm);
}
