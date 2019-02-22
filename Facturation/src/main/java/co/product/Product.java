package co.product;

public class Product {
	private String nom;
	private String description;
	private double price;

	public Product(String nom, String description, double price) {
		this.nom = nom;
		this.description = description;
		this.price = price;
	}

	public String toString() {
		return "Marque " + nom + "-" + " Description produits : " + description + " - " + " Prix :" + price;
	}

	public void buy(Bill bill, Integer quantity) {

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
