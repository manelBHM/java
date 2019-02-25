package com.example.demo;

public class Personne {
	
	private String nom;
	private String prenom;
	
	public Personne() {
		// TODO Auto-generated constructor stub
	}
	
	public Personne(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
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
	
	

}
