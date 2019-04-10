package com.Spring.Boot.gestionPersonnes.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Personne implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	private String dateNaissance;
	@Column
	private String marie;
	@Column
	private int nbEnfants;
	@Column
	private int version;
	
	public Personne(String nom, String prenom, String dateNaissance, String marie, int nbEnfants, int version) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.marie = marie;
		this.nbEnfants = nbEnfants;
		this.version = version;
	}
	
	public Personne(String nom, String prenom, String dateNaissance, String marie, int nbEnfants) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.marie = marie;
		this.nbEnfants = nbEnfants;
	
	}

	public Personne(Long id, String nom, String prenom, String dateNaissance, String marie, int nbEnfants, int version) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.marie = marie;
		this.nbEnfants = nbEnfants;
		this.version = version;
	}

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getMarie() {
		return marie;
	}

	public void setMarie(String marie) {
		this.marie = marie;
	}

	public int getNbEnfants() {
		return nbEnfants;
	}

	public void setNbEnfants(int nbEnfants) {
		this.nbEnfants = nbEnfants;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

		
	
	

}
