package co.magasin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Produit {
	
	Scanner sc = new Scanner(System.in);
	
	public String nom;
	String description;
	double prix;
	HashMap<Produit, Integer> prodList = new HashMap<Produit, Integer>();
	
	public Produit(String name, String description, double price) {
		this.nom = name;
		this.description = description;
		this.prix = price;
	}

	public String getNom() {
		return nom;
	}

	public void setnom(String nom) {
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
		return "C'est un(e) " + this.nom + ".\n" + this.description + "\nCe produit coute : " + this.prix +" Euros";
	}
}


