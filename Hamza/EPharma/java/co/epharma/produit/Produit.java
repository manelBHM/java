package co.epharma.produit;

public class Produit {
	
	protected String nom, description;
	protected int prix;
	
	public Produit() {
		// TODO Auto-generated constructor stub
	}

	public Produit(String nom, String description, int prix) {
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

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Produit [nom=" + nom + ", description=" + description + ", prix=" + prix + "]";
	}
	
	
}
