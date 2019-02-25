package classes.demo;

public class PointRelais implements Delivery {

	private String address;

	public PointRelais(String address) {
		this.address = address;
	}

	public double getPrice() {
		if (address.contains("Paris")) {
			return 1.50;
		} else if (address.contains("ild de France")) {
			return 3;
		}
		return 7;
	}

	/*
	 * private int number ;
	 * 
	 * 
	 * 
	 * public PointRelais(int number) { this.number = number; }
	 * 
	 * 
	 * 
	 * public double getPrice() { if(number > 1 && number < 20) { return 0; }else if
	 * (number > 20 && number < 30) { return 1.99; } return 3.99; }
	 */

	public String getInfo() {
		return "your delivery is PointRelais ";

	}

}
