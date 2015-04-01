package com.rizomm.carpooling.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rizomm.carpooling.dao.TypeVoitureDAO;
import com.rizomm.carpooling.model.TypeVoiture;
import com.rizomm.carpooling.service.TypeVoitureService;

@Service("typeVoitureService")
public class TypeVoitureServiceImpl implements TypeVoitureService {

	@Autowired
	TypeVoitureDAO typeVoitureDAO;

	@Override
	@Transactional
	public TypeVoiture getTypeVoitureByLibelle(String libelle) {
		return typeVoitureDAO.getTypeVoitureByLibelle(libelle);
	}	
}
