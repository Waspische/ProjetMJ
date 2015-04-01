package com.rizomm.carpooling.model;

// Generated 19 mars 2015 00:27:03 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@NamedQueries({
	@NamedQuery(name = "TypeVoitureByLibelle", query = "from TypeVoiture tv where upper(tv.libelle) = upper(:libelle)")
})
@Entity
@Table(name = "type_voiture")
public class TypeVoiture implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String libelle;

	public TypeVoiture() {
	}

	public TypeVoiture(String libelle) {
		this.libelle = libelle;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "libelle", nullable = false, length = 100)
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
