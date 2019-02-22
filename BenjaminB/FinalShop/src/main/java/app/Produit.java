package co.simplon;

public class Produit {
	
	@Override
	public String toString() {
		return "Produit " + nom + " prix " + prix;
	}
	String nom;
	int prix;
	String description;
	String marque;
	public Produit(String nom, int prix, String description, String marque) {
		this.nom = nom;
		this.prix = prix;
		this.description = description;
		this.marque = marque;
		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	

}
