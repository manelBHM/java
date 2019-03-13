package com.simplon.Shop;

public class Product {
String name;
String description;
double price;

public Product(String name, String description, double price) {
	look();
	buy();
	getName();
	getDescription();
	getPrice();
	setprice(price);
}

private void setprice(double price) {
	// TODO Auto-generated method stub
	this.price=price;
}

double getPrice() {
	// TODO Auto-generated method stub
	return price;
}

private String getDescription() {
	// TODO Auto-generated method stub
	return description;
}

 String getName() {
	// TODO Auto-generated method stub
	return name;
}

private void buy() {
	// TODO Auto-generated method stub
	
}

private void look() {
	// TODO Auto-generated method stub
	System.out.println(" . ");
}

}
