package co.product;

public class DirectDeliver implements Deliver {

	@Override
	public double getPrice() {
		return 4.99;
	}

	@Override
	public String getInfo() {
		return "Livraison domicile 4.99€";
	}

}
