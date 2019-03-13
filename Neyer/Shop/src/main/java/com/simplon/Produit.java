package com.simplon;

public class Produit {
	
	
	String nom;
	Double prix;
	String description;
	String marque;
	public Produit(String nom, Double prix, String description, String marque) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.description = description;
		this.marque = marque;
	}
	@Override
	public String toString() {
		return "Produit [nom=" + nom + ", prix=" + prix + ", description=" + description + ", marque=" + marque + "]";
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	
}
