package co.livraison;

public class Relais implements Delivery {

	public double getPrix() {
		return 2.99;
	}

	public String getInfo() {
		return "Coli a chercher dans un de nos points relais, ce mode de livraison coute 2.99 Euros.";
	}
	
	
	
}
