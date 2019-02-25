package classes.demo;

public class Express implements Delivery {

	private String city;
	
	
	
	
	public Express(String city) {
		this.city = city;
	}
	
	


	public double getPrice() {
		if(city.equals("Paris")) {
			return 5.99;
		}
		return 11.99;
	}


	public String getInfo() {
		return "your delivery is Express  ";

	}

}
