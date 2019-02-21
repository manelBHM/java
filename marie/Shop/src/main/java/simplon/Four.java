package simplon;

public class Four extends Produit{

	double temperMax;
	int puissance;
	static String nom = "four";

	public Four(String marque, String description, double prix, double temperMax, int puissance) {
		super(nom, description, prix);
		this.temperMax = temperMax;
		this.puissance = puissance;
	}

	@Override
	public String toString() {
		return "Four: Description: " + description + ", Temperature: " + temperMax + ", Puissance: " +
	puissance + ", Prix: " + prix;
				
				
	}

	public double getTemperMax() {
		return temperMax;
	}

	public void setTemperMax(double temperMax) {
		this.temperMax = temperMax;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		Four.nom = nom;
	}
	
	

}
