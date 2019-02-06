package eshop.store;

public class HomeDelivery implements Delivery{
	
	private double homeDeliveryPrice;
	
	public HomeDelivery()
	{
		
	}

	public double getPrice() {
		// TODO Auto-generated method stub
		homeDeliveryPrice = 4.99;
		
		return homeDeliveryPrice;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Vous avez choisis ** Home Delivery ** comme mode de livraison\nPrix de la livraison: " + this.getPrice();
	}
	
}
