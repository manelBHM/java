package co.hamza.produits;

public class Produits {
	
	protected String nom;
	protected String description;
	protected double prix;
	protected int quantite = 0;
	
	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Produits() {
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Produits(String nom, String description, double prix) {
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

	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	

}
