package co.simplon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Produit {

	Scanner sc = new Scanner(System.in);
	
	String nom;
	double prix;
	
	HashMap<Produit, Integer> listProd = new HashMap<Produit, Integer>();
	

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(String nom, double prix) {
		this.nom = nom;
		this.prix = prix;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "medecament "+" : " + this.nom + " " + this.prix+" "+"€";
	}
	
	
}
