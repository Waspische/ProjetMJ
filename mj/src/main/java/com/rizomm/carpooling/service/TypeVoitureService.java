package com.rizomm.carpooling.service;

import com.rizomm.carpooling.model.TypeVoiture;


public interface TypeVoitureService {
	TypeVoiture getTypeVoitureByLibelle(String libelle);
}
