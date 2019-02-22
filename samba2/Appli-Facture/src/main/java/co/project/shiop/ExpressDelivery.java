package co.project.shiop;

public class ExpressDelivery implements Delivery {
	private String city;

	public ExpressDelivery() {
	}

	public double getPrice() {
		return 9.99;
	}

	// public double getPrice() {
	// if (city == "paris") {
	// return 6.99;
	// } else {
	// return 9.99;
	// }
	// }

	public String getInfo() {
		String info = "- Livraison express: " + getPrice() + " euros";
		return info;
	}

}
