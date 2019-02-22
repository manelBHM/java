package co.project.shiop;

public class DirectDelivery implements Delivery {

	public double getPrice() {
		return 4.99;
	}

	public String getInfo() {
		String info = "- Livraison a domicile: " + getPrice() + " euros";
		return info;
	}

}
