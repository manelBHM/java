package co.livraison;

public class Express implements Delivery {

	public double getPrix() {
		return 14.99;
	}

	public String getInfo() {
		return "Nous vous livrons imm�diatement � domicile, ce mode de livraison coute 14.99 Euros.";
	}

}
