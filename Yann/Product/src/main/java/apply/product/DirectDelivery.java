package apply.product;

public class DirectDelivery implements Delivery{

	
	public DirectDelivery()
	{
		
	}
	
	public double getPrice() {
		// TODO Auto-generated method stub
		double dPrice = 4.99;
		return dPrice;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Vous avez choisis ** Direct Delivery ** comme livraison: " + getPrice();
	}



}
