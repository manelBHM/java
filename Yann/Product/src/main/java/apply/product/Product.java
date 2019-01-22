package apply.product;

public class Product<name, description, price>{

	protected name name;
	protected description description;
	protected price price;



	public Product(name name, description description, price price) {
		// TODO Auto-generated constructor stub
		super();
		this.name=name;
		this.description=description;
		this.price=price;
	}


	public name getName() {
		return name;
	}




	public void setName(name name) {
		this.name = name;
	}




	public description getDescription() {
		return description;
	}




	public void setDescription(description description) {
		this.description = description;
	}


	public price getPrice() {
		return price;
	}


	public void setPrice(price price) {
		this.price = price;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product: " + this.name + " | Description: "+ this.description + " | Price: "+ this.price;
	}

}
