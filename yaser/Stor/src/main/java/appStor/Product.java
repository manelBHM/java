package appStor;

public class Product {
	int id;
	protected String name;
	protected String mark;
	protected String descripation;
	protected double price;
	
	public Product(int id,String name,String descripation,double price) {
		super();
		this.id=id;
		this.name=name;
		this.descripation=descripation;
		this.price=price;
	}
	
	public Product(String name, String mark, String descripation, double price) {
		super();
		this.name = name;
		this.mark = mark;
		this.descripation = descripation;
		this.price = price;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getDescripation() {
		return descripation;
	}

	public void setDescripation(String descripation) {
		this.descripation = descripation;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", mark=" + mark + ", descripation=" + descripation + ", price=" + price + "]";
	}


	public Product get(int parseInt) {
		// TODO Auto-generated method stub
		return null;
	}


	

	
}
