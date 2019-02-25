package com.projet.inter;

import java.util.Date;

public class Personne2 implements Ipersonne2{
	
	Profil profil;
	static int id=0;
	String nom, prenom;
	Date dateNais;
	double salaire;
	public Profil2 profil2;
	
	public Personne2(String nom, String prenom, Date dateNais, double salaire, Profil2 profil2) {
		id++;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNais = dateNais;
		this.salaire = salaire;
		this.profil2 = profil2;
		
	}
	
	public void afficherId() {
		// TODO Auto-generated method stub
		System.out.println(id);
	}

	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		if(profil2.libelle.equals("DG")) {
			this.salaire = salaire + (salaire*0.20);
		}
		else if(profil2.libelle.equals("EM")) {
				this.salaire = salaire + (salaire*0.10);
			}
		return salaire;
	}
	
	public void afficher() {
		System.out.println("Je suis le" + profil2.libelle +" " + nom + prenom + "née le" + dateNais + "mon salaire est" + salaire +"euro");
	}
}
