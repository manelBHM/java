package co.hamza.clients;

public class Client {
	
	private String nom;
	private String adresse;
	
	public Client() {
	}
	
	public Client(String nom, String adresse){
		this.nom = nom;
		this.adresse = adresse;
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
	
	

}
