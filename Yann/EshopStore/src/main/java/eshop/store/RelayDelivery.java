package eshop.store;

public class RelayDelivery implements Delivery{

	private double relayPrice;
	private int relayPoint;
	
	public RelayDelivery(int relayPoint)
	{
		this.relayPoint=relayPoint;
	}
	
	public double getPrice() {
		// TODO Auto-generated method stub
		
		if(this.relayPoint<=22)
		{
			relayPrice = 0;
		}
		
		else if(this.relayPoint > 22 && this.relayPoint <= 47)
		{
			relayPrice = 2.99;
		}
		else
		{
			relayPrice = 4.99;
		}
		
		return relayPrice;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Vous avez choisis ** Relay Delivery ** comme mode de livraison\nPrix de la livraison: " + this.getPrice();
	}
	
	
	

	
}
