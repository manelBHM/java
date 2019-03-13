package maven_projet1.client_maven;

public class Product {
	
	protected String name;
	protected String description;
	protected double price;
	
	
	public Product(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
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
	
	
	//display a full description 
	public void look() {
		System.out.println(String.format(name + ": "+description+ " : " + price));
	}

}
