package co.apiMagasin;

public class TakeAwayDelivery implements Delivery {

	public double getPrice() {
		return 0;
	}

	@Override
	public String getInfo() {
		return "Livraison 0.00€";
	}
}
