package eshop.store;

public class ExpressDelivery extends Customer implements Delivery{

	private double exPrice;

	public ExpressDelivery(String fullName, String address, int postalCode)
	{
		super(fullName, address, postalCode);
	}

	
	public double getPrice() {
		// TODO Auto-generated method stub

		if(this.getPostalCode()>75020)
		{
			exPrice = 9.99;
		}
		else
		{
			exPrice = 6.99;
		}

		return exPrice;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Vous avez choisis ** Express Delivery ** comme mode de livraison\nPrix de la livraison: " + this.getPrice();
	}

	
}
