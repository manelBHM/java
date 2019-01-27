package apply.product;

public class ExpressDelivery extends Client implements Delivery{

	private double ePrice;
	
	public ExpressDelivery(String address, int codePostal)
	{
		super(address, codePostal);
	}

	public double getPrice() {
		// TODO Auto-generated method stub

		if(this.getCodePostal()>75020)
		{
			ePrice = 9.99;
		}
		else {
			ePrice = 6.99;
		}

		return ePrice;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Vous avez choisis ** Express Delivery ** comme mode de livraison\nPrix de la livraison: " + this.getPrice();
	}

}
