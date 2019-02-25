package com.projet.inter;

import java.util.Date;

public class Personne implements Ipersonne {
	

	static int id;
	String nom;
	String prenom;
	Date dateNais;
	double salaire;
	Profil profil;
	
	Profil directeur = new Profil("Directeur");
	Profil employe = new Profil("EMP");
	
	
	public Personne(String nom, String prenom, Date dateNais, double salaire, Profil profil ) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.dateNais = dateNais;
		this.salaire = salaire;
		this.profil = profil;
		
	}

	
	public void affiche() {
		
		System.out.println("Je suis le " + profil.libelle + " " + nom + " " + prenom + " " + "né le " + dateNais + " " + "Mon salaire mensuel est " + salaire   );
		
	}
	
	  public double calculerSalaire() {
		
		if(profil.libelle==directeur.libelle) {
			salaire = salaire*1.2;
		}
		if(profil.libelle==employe.libelle) {
			salaire=salaire*1.1;
		}
		return salaire;
	}
	
	
	
	
	
	

}
