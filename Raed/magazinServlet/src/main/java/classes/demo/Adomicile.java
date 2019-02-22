package classes.demo;
 
public class Adomicile implements Delivery {

	private String address;
	
	
	
	public Adomicile(String address) {
		this.address = address;
	}
	

	
	public double getPrice() {
	  if(address.contains("Paris")) {
		  return 1.50;
	  }else if(address.contains("ild de France")) {
		  return 3;
	  }
		return 7;
	}


	public String getInfo() {
		return "your delivery is Adomicile";

	}

}
