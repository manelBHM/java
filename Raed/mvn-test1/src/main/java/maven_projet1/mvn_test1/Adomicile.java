package maven_projet1.mvn_test1;

public class Adomicile implements Delivery {

	private String address;
	
	
	
	public Adomicile(String address) {
		this.address = address;
	}
	

	@Override
	public double getPrice() {
	  if(address.contains("Paris")) {
		  return 1.50;
	  }else if(address.contains("ild de France")) {
		  return 3;
	  }
		return 7;
	}

	@Override
	public void getInfo() {
	 System.out.println("le type de votre choix est  : Adomicile");

	}

}