package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Drugs {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private Long quantity;
	private double price;

	
	public Drugs() {
		
	}
	
	
	public Drugs(int id, String name, Long quantity, double price) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	
		
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

 
 

	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Long getQuantity() {
		return quantity;
	}


	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	
	
	
	
	
	
	

}
