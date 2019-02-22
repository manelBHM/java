package co.epharma.client;

import java.util.ArrayList;

import co.epharma.produit.Produit;

public class Client {
	private String nom, adresse;
	private int id;
	ArrayList<Produit> historique = new ArrayList<Produit>();
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(String nom, String adresse) {
		this.nom = nom;
		this.adresse = adresse;
	}
	
	public Client(int id,String nom, String adresse) {
		this.nom = nom;
		this.adresse = adresse;
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	

}
