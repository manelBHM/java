package com.Pokemon;

public class Attaque {
	String nom;
	int degat;

	public Attaque(String nom, int degat) {
		this.nom = nom;
		this.degat = degat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDegat() {
		return degat;
	}

	public void setDegat(int degat) {
		this.degat = degat;
	}

	public String toString() {
		return "Attaque [" + nom + "]";
	}
}
