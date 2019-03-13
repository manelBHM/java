package co.apiMagasin;

public class ExpressDelivery implements Delivery {
	private String city;

	public ExpressDelivery(String city) {
		this.city = city;
	}

	@Override
	public double getPrice() {
		if (city == "Paris") {
			return 6.99;
		} else {
			return 9.99;
		}

	}

	@Override
	public String getInfo() {
		return "Livrasion express " + getPrice();
	}

	// public double getPrice() {
	// if (this.number <= 22) {
	// System.out.print("Prix Parisien : " + 6.99);
	// } else if(){
	//
	// }
	//
	// }

}
