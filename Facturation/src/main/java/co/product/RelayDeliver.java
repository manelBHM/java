package co.product;

public class RelayDeliver implements Deliver {
	private int numberRelay;

	public RelayDeliver(int numberRelay) {
		this.numberRelay = numberRelay;
	}

	@Override
	public double getPrice() {
		if (numberRelay >= 1 && numberRelay <= 22) {
			return 0.0;
		} else if (numberRelay >= 23 && numberRelay <= 47) {
			return 2.99;
		} else {
			return 4.99;
		}
	}

	@Override
	public String getInfo() {
		return "Point de relay " + getPrice();
	}
}
