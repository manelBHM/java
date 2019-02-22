package co.product;

public class ExpressDeliver implements Deliver {
	private String city;

	public ExpressDeliver(String city) {
		this.city = city;
	}

	public double getPrice() {
		if (city == "Paris") {
			return 6.99;
		} else {
			return 9.99;
		}
	}

	@Override
	public String getInfo() {
		return "Livraison express " + getPrice();
	}

}
