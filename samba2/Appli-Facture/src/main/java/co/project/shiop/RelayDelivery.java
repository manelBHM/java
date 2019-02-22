package co.project.shiop;

public class RelayDelivery implements Delivery {
	private int pointRelay;

	public RelayDelivery() {
	}

	// public double getPrice() {
	// if (pointRelay >= 1 && pointRelay <= 22) {
	// return 0.00;
	// } else if (pointRelay >= 23 && pointRelay <= 47) {
	// return 2.99;
	// } else {
	// return 4.99;
	// }
	// }

	public double getPrice() {
		return 2.99;
	}

	public String getInfo() {
		String info = "- Livraison Point Relay: " + getPrice() + " euros";
		return info;
	}

	public int getPointRelay() {
		return pointRelay;
	}

	public void setPointRelay(int pointRelay) {
		this.pointRelay = pointRelay;
	}

}
