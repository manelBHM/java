package co.apiMagasin;

public class RelayDelivery implements Delivery {
	private int pointRelay;

	public RelayDelivery(int pointRelay) {
		this.pointRelay = pointRelay;
	}

	@Override
	public double getPrice() {
		if (pointRelay >= 1 && pointRelay <= 22) {
			return 0.00;
		} else if (pointRelay >= 23 && pointRelay <= 48) {
			return 2.99;
		} else {
			return 4.99;
		}
	}

	@Override
	public String getInfo() {
		return " Rekay de livrasion " + getInfo();
	}

	// public double getPrice() {
	// if(this.number <= 22){
	// return
	// }
	// }

}
