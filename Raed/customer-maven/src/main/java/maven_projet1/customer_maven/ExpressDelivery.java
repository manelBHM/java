package maven_projet1.customer_maven;

public class ExpressDelivery implements Delivery {
	
	  private String city;
	  
	  

	public ExpressDelivery(String city) {
		super();
		this.city = city;
	}

	public double getPrice() {
		 if (city.equals("Paris")) 
	            return 6.99;
	        else
	        
	        	 return 9.99;
	    }
		   
	

	public void getInfo() {
		// TODO Auto-generated method stub

	}

}
