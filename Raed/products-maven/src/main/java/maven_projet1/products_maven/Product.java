package maven_projet1.products_maven;

public class Product {
	
	protected String nom;
	protected String description;
	protected double price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String nom, String description, double price) {
		this.nom = nom;
		this.description = description;
		this.price = price;
		
	}
	
	//description of the product that the client look for !!
	public void look() {
		System.out.println("Marque : " + nom + " - " + description + " - " + "Prix : " + price+ " euros.");
	}
	
	public void buy() {
		
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getNom() {
		return nom;
	}

	public String getDescription() {
		return description;
	}
	

}
	
