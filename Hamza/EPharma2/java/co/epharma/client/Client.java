package co.epharma.client;

public class Client {
	private String nom, adresse;

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(String nom, String adresse) {
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
