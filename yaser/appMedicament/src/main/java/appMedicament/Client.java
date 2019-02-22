package appMedicament;

import java.util.HashMap;

public class Client {

	String nom;
	String prenom;
	
	HashMap<Client, Integer> listeClient = new HashMap<Client, Integer>();
	
	public Client(String nom, String prenom) {
		super();
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
	
	@Override
	public String toString() {
		return "Client: " + this.nom + " " + this.prenom;
	}
	
	
}
