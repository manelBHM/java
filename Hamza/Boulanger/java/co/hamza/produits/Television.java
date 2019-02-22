package co.hamza.produits;

public class Television extends Produits{
	
	private int taille;
	
	
	public Television() {
	}
	
	public Television(String nom, String description, int taille, double prix) {
		super(nom, description, prix);
		this.taille = taille;
		this.quantite ++ ;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	
	
	
}
