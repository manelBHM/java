package com.lesson.interface2;

import java.util.Date;

public class Personne implements Ipersonne {
	
	protected String nom;
	protected String prenmo;
	protected Date birthday;
	protected double salaire;
	Profile profile;
	

	
	
	public Personne(String nom, String prenmo, Date birthday, double salaire, Profile profile) {
		super();
		this.nom = nom;
		this.prenmo = prenmo;
		this.birthday = birthday;
		this.salaire = salaire;
		this.profile = profile;
	}

	public Personne() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public  double calculerSalaire() {
		if(profile.code.equals("DM")) {
			salaire = salaire  + 0.20 * salaire;
			
		 
		}else if(profile.code.equals("EM")) {
			salaire = salaire + 0.10 * (salaire);
		 
		}
	 
		return 	salaire;
	}
	
	@Override
	public void affiche() {
		 System.out.println("Je suis  "+nom+" PRENOM "+prenmo+" né le " +birthday+" , mon salaire mensuel est " +calculerSalaire()+" Euro");

	}


}
