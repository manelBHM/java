package co.project.shiop;

public class TakeAwayDelivery implements Delivery {

	public double getPrice() {
		return 0.00;
	}

	public String getInfo() {
		String info = "- Livraison Gratuit: " + getPrice() + " euros";
		return info;
	}

}
