package simplon;

public class Cafetiere extends Produit{

	int capacite;
	int nbTasse;
	static String nom = "cafetiere";
	
	public Cafetiere(String marque, String description, double prix, int capacite, int nbTasse) {
		super(nom, description, prix);
		this.capacite = capacite;
		this.nbTasse = nbTasse;
	}


	@Override
	public String toString() {
		return "Cafetiere: Description: " + description + ", Capacite: " + capacite + ", Nombre de tasses: "
				+ nbTasse + ", Prix: " + prix;
	
	}


	public int getCapacite() {
		return capacite;
	}


	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}


	public int getNbTasse() {
		return nbTasse;
	}


	public void setNbTasse(int nbTasse) {
		this.nbTasse = nbTasse;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		Cafetiere.nom = nom;
	}


	
}
