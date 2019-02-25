package co.project.shiop;

public class Product {
	private String name;
	private double price;
	private String description;
	private String marque;

	public Product(String name, String marque, String description, double price) {
		this.marque = marque;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public String toString() {
		return marque + " - " + name + " - " + description + " - " + " Prix " + price + "€";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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
