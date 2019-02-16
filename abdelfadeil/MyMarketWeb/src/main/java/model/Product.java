package model;

import services.Bill;

public class Product {
   private String name;
   private String desc;
   private double price;
   static int nobPro;
   private Bill bill;
   private int quantite;
  
private int id;
   
public Product(String name, String desc, double price) {
	this.name = name;
	this.desc = desc;
	this.price = price;
	this.id = ++nobPro;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}

public static int getNobPro() {
	return nobPro;
}
public int getId() {
	return id;
}
public int getQuantite() {
	return id;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

public void look() {
	System.out.println("Name: "+ this.getName() + " Desc: " + this.getDesc() + 
			" Price: "+this.getPrice() );
}
@Override
public String toString() {
	
	return " "+this.getName()+ " Desc: "+this.getDesc()+ " Price: "+this.getPrice()+ " quantité " + this.getQuantite();
}
   
}
