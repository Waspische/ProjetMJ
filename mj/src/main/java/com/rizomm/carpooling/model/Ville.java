package com.rizomm.carpooling.model;

// Generated 19 mars 2015 00:27:03 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@NamedQueries({
	@NamedQuery(name = "VilleByLibelle", query = "from Ville v where upper(v.libelle) = upper(:libelle)"),
	@NamedQuery(name = "VilleById", query = "from Ville v where v.id = :id")
})
@Entity
@Table(name = "ville")
public class Ville implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private int idPays;
	private String codePostal;
	private String libelle;
	
	
	public Ville() {
	}

	public Ville(int id, int idPays, String codePostal, String libelle) {
		this.id = id;
		this.idPays = idPays;
		this.codePostal = codePostal;
		this.libelle = libelle;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "id_pays", nullable = false)
	public int getIdPays() {
		return this.idPays;
	}

	public void setIdPays(int idPays) {
		this.idPays = idPays;
	}

	@Column(name = "code_postal", nullable = false, length = 100)
	public String getCodePostal() {
		return this.codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	@Column(name = "libelle", nullable = false, length = 100)
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
