package apply.product;

public class ExpressDelivery extends Client implements Delivery{

	public ExpressDelivery(String address, int codePostal)
	{
		super(address, codePostal);
	}

	public double getPrice() {
		// TODO Auto-generated method stub

		double ePrice=0;

		if(this.getCodePostal()>=75020)
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
		return "Vous avez choisis ** Express Delivery ** comme mode de livraison\n" + this.getPrice();
	}


}
