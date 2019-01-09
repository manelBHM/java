package com.projet.inter;

import java.util.Date;

public class Personne {
	
	private int id;
	private String nom;
	private String prenom;
	private Date dateNais;
	private double salaire;
	private Profil profil;
	
	public Personne(int id,String nom, String prenom, Date dateNais, double salaire, Profil profil) {
        this.setId(id);
		this.nom = nom;
        this.prenom = prenom;
        this.dateNais = dateNais;
        this.salaire = salaire;
        this.profil = profil;
        
}
	
	public void afficher() {
	 System.out.println(" Je suis "+ profil.libelle +""+ nom+ " " +prenom+" je suis né le " + dateNais+ " mon salaire mensuel est de : "+ salaire + " Euros ");
	}
	
	
public double calculerSalaire() {
		if(profil.libelle.equals("DG")) {
			salaire += salaire*0.20;
			}
		else if (profil.libelle.equals("EM")){
			salaire=salaire*0.10;
		}
		return salaire;
	
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}}
