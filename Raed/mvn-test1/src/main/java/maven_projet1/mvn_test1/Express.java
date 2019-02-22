package maven_projet1.mvn_test1;

public class Express implements Delivery {

	private String city;
	
	
	
	
	public Express(String city) {
		this.city = city;
	}
	
	

	@Override
	public double getPrice() {
		if(city.equals("Paris")) {
			return 5.99;
		}
		return 11.99;
	}

	@Override
	public void getInfo() {
		 System.out.println("le choix de votre de delivery est : Express ");

	}

}
