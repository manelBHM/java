package co.simplon;

public class Produit {
	
	@Override
	public String toString() {
		return "Produit " + nom + " prix " + prix + " - " + description;
	}
	String nom;
	int prix;
	String description;
	String marque;
	public Produit(String nom, String description, int prix) {
		this.nom = nom;
		this.prix = prix;
		this.description = description;
		
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
