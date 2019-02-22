package com.projet.inter;



import java.util.Date;



public class Personne implements IPersonne {

	Profil profil;

	static int id=0;

	String nom, prenom;

	Date dateNais;

	double salaire;

	

	/*public Personne() {

		// TODO Auto-generated constructor stub

	}*/

	

	public Personne(String nom, String prenom, Date dateNais, double salaire, Profil profil) {

		id++;

		this.nom = nom;

		this.prenom = prenom;

		this.dateNais = dateNais;

		this.salaire =  salaire;

		this.profil = profil;

	}



	public void afficheId() {

		System.out.println(id);



	}



	



	public double calculerSalaire() {

		if(profil.libelle.equals("DG")) {

			

			salaire = salaire + (salaire*0.20);

			

		}else if(profil.libelle.equals("EM")) {

			this.salaire =salaire + (salaire*0.10);	

		}

		return salaire;

	}

	@Override

	public void affiche() {

      //  salaire = calculerSalaire()

		System.out.println("Je suis le "+profil.libelle+" "+ nom+ " "+ prenom+ " né le "+ dateNais+ " mon salaire mensuel est "+ salaire+" euros");

	}

	

}