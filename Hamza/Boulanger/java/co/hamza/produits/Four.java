package co.hamza.produits;

public class Four extends Produits{
	
	private int puissance;
	
	public Four() {
	}
	
	public Four(String nom, String description, int puissance, double prix) {
		super(nom, description, prix);
		this.puissance = puissance;
		this.quantite ++ ;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	
	
}
