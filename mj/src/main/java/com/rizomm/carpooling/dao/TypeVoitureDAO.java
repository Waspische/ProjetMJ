package com.rizomm.carpooling.dao;

import com.rizomm.carpooling.model.TypeVoiture;


public interface TypeVoitureDAO {
	public TypeVoiture getTypeVoitureByLibelle(String libelle);
}
