package simplon;

import java.util.HashMap;
import java.util.Scanner;

public class Produit {
	
	Scanner sc = new Scanner(System.in);
	
	public String nom;
	String description;
	double prix;
	HashMap<Produit, Integer> prodList = new HashMap<Produit, Integer>();
	
	public Produit(String nom, String description, double prix) {
		this.nom = nom;
		this.description = description;
		this.prix = prix;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}



	public String toString() {
		return "nom: " + this.nom + "\n" + "description: " + this.description + "\nprix: " + this.prix + " Euros";
	}
	}