package model;

public class Product {
   public int id;
   public String name;
   public String description;
   public double price;
   public int quantity;
   
public Product(int id, String name, String description, double price, int quantity) {
	super();
	this.id =id;
	this.name = name;
	this.description = description;
	this.price = price;
	this.quantity = quantity;
}
public Product(String name, String description, double price) {
	super();
	this.name = name;
	this.description = description;
	this.price = price;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public void setDescription(String desc) {
	this.description = desc;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String lookName() {
	return "Name: "+ this.getName() + ", Price: "+this.getPrice()+"$";
}
 public String lookDesc() {
	 return "Desc: " + this.getDescription();
 }
}
