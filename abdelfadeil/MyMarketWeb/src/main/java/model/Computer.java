package model;

public class Computer extends Product {
 private int size;
 private String model;
 private int quantite;
public Computer(String name, String desc, double price, int size, int quantite) {
	super(name, desc, price);
	this.size = size;
   this.quantite= quantite;
}
public Computer() {
	super();
	// TODO Auto-generated constructor stub
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public void buy() {
	System.out.println("Info Product - Name: "+this.getName()+ " Desc: "+this.getDesc()+ " Price: "+this.getPrice()+ " Size: "+this.getSize()+ " Model: "+this.getModel());
}

public int getQuantite() {
	return this.quantite;
}

	




}