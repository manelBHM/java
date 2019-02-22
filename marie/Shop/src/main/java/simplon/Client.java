package simplon;

import java.util.HashMap;

public class Client {
	
	String nom;
	String prenom;
	String adress;
	HashMap<Client, Integer> listeClient = new HashMap<Client, Integer>();
	
	public Client(String nom, String prenom, String adress) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
	
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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}


	@Override
	public String toString() {
		return "nom: " + this.nom + ", prenom: " + this.prenom + ", \nadress: " + this.adress;
	}

	
}	
	
