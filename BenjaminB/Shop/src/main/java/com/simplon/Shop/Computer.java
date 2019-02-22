package com.simplon.Shop;

public class Computer extends Product{
String perf;

	public Computer(String name, String description, double price, String perf) {
		super(name, description, price);
		this.name=name;
		this.description=description;
		this.price=price;
		this.perf=perf;
	}

}
