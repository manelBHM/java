package co.apiMagasin;

public class DirectDelivey implements Delivery {

	public double getPrice() {
		return 4.99;
	}

	@Override
	public String getInfo() {
		return " Livraison a domicile 4.99";
	}

}
