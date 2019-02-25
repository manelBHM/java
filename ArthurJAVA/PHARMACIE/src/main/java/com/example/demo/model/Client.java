package com.example.demo.model;

public class Client {

	String nom;
	int id;
	public Client(String nom, int id) {
		this.nom = nom;
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
