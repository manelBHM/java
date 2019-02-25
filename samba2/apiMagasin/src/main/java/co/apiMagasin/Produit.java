package co.apiMagasin;

public class Produit {
	protected String nom;
	protected double prix;
	protected String descriptive;

	public Produit(String nom, String marque, String descriptive, double prix) {
		this.nom = nom;
		this.prix = prix;
		this.descriptive = descriptive;
	}

	public String toString() {
		return "Marque " + nom + "-" + " Description produits : " + descriptive + " - " + " Prix :" + prix;
	}

	// public void buy(Bill bill, Integer quantité) {
	//
	// }

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

	public String getDescriptive() {
		return descriptive;
	}

	public void setDescriptive(String descriptive) {
		this.descriptive = descriptive;
	}
}
