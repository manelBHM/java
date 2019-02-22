package com.stage.stagiaire;

public class Stagiare {
	private String nom;
	private String prenom;
	private int matricule;

	public Stagiare(String nom, String prenom, int matricule) {
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
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

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public String toString() {
		return getNom().toUpperCase();
	}
}
