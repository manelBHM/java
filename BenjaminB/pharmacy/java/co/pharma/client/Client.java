package co.pharma.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import co.pharma.produit.Produit;

public class Client {
	
	String nom;
	String prenom;
	HashMap<Client, Integer> client = new HashMap<Client, Integer>();
	
	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public HashMap<Client, Integer> getClient() {
		return client;
	}

	public void setClient(HashMap<Client, Integer> client) {
		this.client = client;
	}
	
	
	
}
