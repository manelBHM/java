package com.project.inter;

import java.util.Date;

class Personne implements Ipersonne {
	private String nom;
	private String prenom;
	private double salaire;
	private Date date;
	public Profil profil;

	public Personne(String nom, String prenom, double salaire, Date date, Profil profil) {
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
		this.date = date;
		this.profil = profil;
	}

	public Double addPercent() {
		if (profil.libelle.equals(" DG ")) {
			return salaire = salaire + (salaire * 0.20);
		} else if (profil.libelle.equals(" EM ")) {
			return salaire = salaire + (salaire * 0.10);
		}
		return salaire;
	}

	public void showCase() {
		System.out.println(" Je suis le " + this.profil.libelle + " je m'appel " + this.nom + " " + this.prenom
				+ " Née le " + this.date + " salaire " + this.salaire + "€");
	}
}
