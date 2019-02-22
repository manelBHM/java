package com.lesson10Tow;

import java.util.Date;

public class Personne implements Iperson {
	Profil profil;
	static int id;
	String nom;
	String prenom;
	Date dateNai;
	double salaire;
 

	
 
		
	  public Personne() {
		  super();
	  }
	  


	public Personne(String nom, String prenom, Date dateNai, double salaire, Profil profil) {
		super();
		id++;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNai = dateNai;
		this.salaire = salaire;
		this.profil = profil;
	}
	
	@Override
	public double calculSalaire() {
		if(	Profil.libelle.equals("DG")) {
			salaire = salaire + 0.20*(salaire);
		}else if(Profil.libelle.equals("EM")) {
			salaire = salaire + 0.10 * (salaire);
		}
		return salaire;
	}
 
	
	
	
	public void afficher() {
		System.out.println("je suis le " + 	Profil.libelle + " mon nom est  " + nom + "et mon prenom est  " + prenom + " " + "je suis ne le " + dateNai+
			 "est  mon salaire " + salaire+"Euro");

	}
	
	  public static void affichNombrePersonne() {
	  System.out.println("le nombre de persone "+id); }
	  
	 

}
