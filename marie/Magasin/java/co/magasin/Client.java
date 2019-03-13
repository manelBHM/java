package co.magasin;

import java.util.HashMap;
import java.util.Map.Entry;

public class Client {
	
	String prenomNom;
	String adresse;
	HashMap<Client, Integer> listeClients = new HashMap<Client, Integer>();
	
	public Client(String prenomNom, String adresse) {
		this.prenomNom = prenomNom;
		this.adresse = adresse;
	}

	public String getPrenomNom() {
		return prenomNom;
	}

	public void setPrenomNom(String prenomNom) {
		this.prenomNom = prenomNom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String toString() {
		return "Nom : " + this.prenomNom + "\nAdresse : " + this.adresse;
	}
	
}
