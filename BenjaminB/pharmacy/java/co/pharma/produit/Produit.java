package co.pharma.produit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Produit {
	
	String nom;
	String description;
	int quantite;
	double prix;
	HashMap<Produit, Integer> listProd = new HashMap<Produit, Integer>();
	
	public Produit(String nom, String description, int quantite, double prix) {
		this.nom = nom;
		this.description = description;
		this.quantite = quantite;
		this.prix = prix;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public HashMap<Produit, Integer> getListProd() {
		return listProd;
	}

	public void setListProd(HashMap<Produit, Integer> listProd) {
		this.listProd = listProd;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public String toString() {
		return "C'est une boite de " + this.nom + ". Il nous en reste "
				+ this.quantite + " en stock. Le prix est de " + this.prix + " Euros unité.";
	}
	
}
