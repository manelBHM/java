package co.apiMagasin;

public class Four extends Produit {
	private int puissance;

	public Four(String nom, String descriptive, int puissance, double prix) {
		super(nom, descriptive, prix);
		this.puissance = puissance;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

}
