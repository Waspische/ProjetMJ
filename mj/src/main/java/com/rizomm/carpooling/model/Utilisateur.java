/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package com.rizomm.carpooling.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@NamedQueries({
	@NamedQuery(name = "UtilisateurByLogin", query = "from Utilisateur u where u.login = :login")
})
@Entity
@Table(name = "utilisateur")
public class Utilisateur {

 private Integer id;
 private String login;
 private String password;
 private int rolId;
 private String nom;
 private String prenom;
 private String email;
 private String telephone;

 public Utilisateur() {
 }

 public Utilisateur(String login, String password, int rolId) {
  this.login = login;
  this.password = password;
  this.rolId = rolId;
 }
 
 public Utilisateur(String login, String password, int rolId, String nom, String prenom, String email, String telephone) {
	  this.login = login;
	  this.password = password;
	  this.rolId = rolId;
	  this.nom = nom;
	  this.prenom = prenom;
	  this.email = email;
	  this.telephone = telephone;
	 }

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id", unique = true, nullable = false)
 public Integer getId() {
  return this.id;
 }

 public void setId(Integer id) {
  this.id = id;
 }

 @Column(name = "login", nullable = false, length = 30)
 public String getLogin() {
  return this.login;
 }

 public void setLogin(String login) {
  this.login = login;
 }

 @Column(name = "password", nullable = false, length = 30)
 public String getPassword() {
  return this.password;
 }

 public void setPassword(String password) {
  this.password = password;
 }

 @Column(name = "rol_id", nullable = false)
 public int getRolId() {
  return this.rolId;
 }

 public void setRolId(int rolId) {
  this.rolId = rolId;
 }

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getTelephone() {
	return telephone;
}

public void setTelephone(String telephone) {
	this.telephone = telephone;
}
 
 

}