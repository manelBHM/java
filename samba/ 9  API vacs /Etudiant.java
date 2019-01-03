package com.etudiant.project;

public class Etudiant {
	private String nom;

	public Etudiant(String nom) {
		this.nom = nom;
	}

	public void travailler() {
		if (this.nom == "toto") {
			System.out.println(this.nom + " Se met au travail ");
		}
	}

	public void seRepose() {
		if (this.nom == "toto")
			System.out.println(this.nom + " Se repose");
	}
}
