package eshop.store;

public class Product {

	private String name, description;
	private double price;
	private static double id;
	
	public Product(String name, String description, double price)
	{
		super();
		
		this.name=name;
		this.description=description;
		this.price=price;
		id++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public static double getId() {
		return id;
	}

	public static void setId(double id) {
		Product.id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + this.name + " | Description: "+ this.description + " | Price: "+ this.price;
	}

}
