package com.rizomm.carpooling.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@NamedQueries({
	@NamedQuery(name = "PassagerByUtilisateur", query = "from Passager p where p.idUtilisateur = :uti"),
	@NamedQuery(name = "PassagerByTrajet", query = "from Passager p where p.idTrajet = :tra")
})
@Entity
@Table(name = "passager")
public class Passager {

	private int id;
	private int idUtilisateur;
	private int status;
	private int idTrajet;

	public Passager() {
	}

	public Passager(int id, int idUtilisateur, int status, int idTrajet) {
		this.id = id;
		this.idUtilisateur = idUtilisateur;
		this.status = status;
		this.idTrajet = idTrajet;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "id_utilisateur", nullable = false)
	public int getIdUtilisateur() {
		return this.idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	@Column(name = "status", nullable = false)
	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Column(name = "id_trajet", nullable = false)
	public int getIdTrajet() {
		return this.idTrajet;
	}

	public void setIdTrajet(int idTrajet) {
		this.idTrajet = idTrajet;
	}
}
