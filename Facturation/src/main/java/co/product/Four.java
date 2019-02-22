package co.product;

public class Four extends Product {

	private int puissance;

	public Four(String nom, String description, double price, int puissance) {
		super(nom, description, price);
		this.puissance = puissance;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

}
