package com.rizomm.carpooling.model;

// Generated 19 mars 2015 00:27:03 by Hibernate Tools 4.3.1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@Entity
@Table(name = "trajet")
public class Trajet implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private int conducteur;
	private int nbPassager;
	private int nbEtape;
	private Date dateCreation;
	private int idVilleDepart;
	private int idVilleArrivee;
	private int idTypeVoiture;

	public Trajet() {
	}

	public Trajet(int id, int conducteur, int nbPassager, int nbEtape,
			Date dateCreation, int idVilleDepart, int idVilleArrivee,
			int idTypeVehicule) {
		this.id = id;
		this.conducteur = conducteur;
		this.nbPassager = nbPassager;
		this.nbEtape = nbEtape;
		this.dateCreation = dateCreation;
		this.idVilleDepart = idVilleDepart;
		this.idVilleArrivee = idVilleArrivee;
		this.idTypeVoiture = idTypeVoiture;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "conducteur", nullable = false)
	public int getConducteur() {
		return this.conducteur;
	}

	public void setConducteur(int conducteur) {
		this.conducteur = conducteur;
	}

	@Column(name = "nb_passager", nullable = false)
	public int getNbPassager() {
		return this.nbPassager;
	}

	public void setNbPassager(int nbPassager) {
		this.nbPassager = nbPassager;
	}

	@Column(name = "nb_etape", nullable = false)
	public int getNbEtape() {
		return this.nbEtape;
	}

	public void setNbEtape(int nbEtape) {
		this.nbEtape = nbEtape;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_creation", nullable = false, length = 10)
	public Date getDateCreation() {
		return this.dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Column(name = "id_ville_depart", nullable = false)
	public int getIdVilleDepart() {
		return this.idVilleDepart;
	}

	public void setIdVilleDepart(int idVilleDepart) {
		this.idVilleDepart = idVilleDepart;
	}

	@Column(name = "id_ville_arrivee", nullable = false)
	public int getIdVilleArrivee() {
		return this.idVilleArrivee;
	}

	public void setIdVilleArrivee(int idVilleArrivee) {
		this.idVilleArrivee = idVilleArrivee;
	}
	
	@Column(name = "id_type_voiture", nullable = false)
	public int getIdTypeVoiture() {
		return this.idTypeVoiture;
	}

	public void setIdTypeVoiture(int idTypeVoiture) {
		this.idTypeVoiture = idTypeVoiture;
	}

}
