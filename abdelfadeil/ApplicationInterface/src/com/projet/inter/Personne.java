package com.projet.inter;

import java.util.Date;

public class Personne implements Ipersonne {
	static int id = 0;
	String nom, prenom;
	String dateNaissance;
	double salaire;
	Profil profil;

	public Personne(String nom, String prenom, String dateNaissance, double salaire, Profil profil) {
		id++;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.salaire = salaire;
		this.profil = profil;
	}

	@Override
	public void affiche() {

		System.out.println("Je suis le " + profil.code + " " + nom + " " + prenom + " " + " né le " + dateNaissance
				+ " , mon salaire mensuel est " + calculerSalaire() + " Euro"); 
		;
	}

	@Override
	public double calculerSalaire() {
		if (profil.libelle.equals("DG")) {
			salaire +=salaire*0.20;
		} else if (profil.libelle.equals("EM")) {
			this.salaire+=salaire*0.10;
		}
		return salaire;
	}

}