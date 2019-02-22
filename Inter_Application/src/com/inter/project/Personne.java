package com.inter.project;

import java.text.DateFormat;
import java.util.Date;

public class Personne implements Ipersonne {

	private String nom;
	private String prenom;
	private Date dateNais;
	private double salaire;
	private Profil profil;

	public Personne(String nom, String prenom, Date dateNais, double salaire, Profil profil) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNais = dateNais;
		this.salaire = salaire;
		this.profil = profil;
	}

	public double calcul() {
		if (profil.libelle.equals("DG")) {
			return this.salaire = salaire + (salaire * 0.20);
		} else if (profil.libelle.equals("EM")) {
			return this.salaire = salaire + (salaire * 0.10);
		}
		return salaire;
	}

	public void affiche() {
		DateFormat dt = DateFormat.getInstance();
		String date = dt.format(dateNais);
		System.out.println("Je suis le " + profil.libelle + " " + this.nom + " " + this.prenom + " Né le " + date
				+ " Mon salaire mensuel est " + calcul());
	}
}
