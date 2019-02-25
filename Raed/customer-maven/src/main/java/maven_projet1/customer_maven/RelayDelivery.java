package maven_projet1.customer_maven;

public class RelayDelivery implements Delivery {

	private int number;
	
	
	
	
	public RelayDelivery(int number) {
		super();
		this.number = number;
	}

	public double getPrice() {
		if (number >= 1 && number <= 22)
            return 0;
        else if (number >= 23 && number <= 47)
            return 2.99;
        else
            return 4.99;
    
	}

	public void getInfo() {
		 System.out.println("le choix de votre delivery est : RelayDelivery");

	}

}
