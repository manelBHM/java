package co.livraison;

public class Domicile implements Delivery  {

	public double getPrix() {
		return 4.99;
	}

	public String getInfo() {
		return "Nous vous livrons a domicile, ce mode de livraison coute 4.99 Euros.";
	}
	
	
	
}
