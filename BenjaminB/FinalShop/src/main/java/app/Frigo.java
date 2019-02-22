package co.simplon;

public class Frigo extends Produit{
	
	int capacite;
	boolean congelo;
	public Frigo(String nom, int prix, String description, String marque, int capacite, boolean congelo) {
		super(nom, prix, description, marque);
		this.capacite = capacite;
		this.congelo = congelo;
	}

}
