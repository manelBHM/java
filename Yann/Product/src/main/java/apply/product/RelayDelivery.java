package apply.product;

public class RelayDelivery implements Delivery {

	private int pointRelais;
	public RelayDelivery(int pointRelais)
	{
		this.pointRelais=pointRelais;
	}
	


	public int getPointRelais() {
		return pointRelais;
	}


	public void setPointRelais(int pointRelais) {
		this.pointRelais = pointRelais;
	}




	public double getPrice() {
		// TODO Auto-generated method stub
		double rPrice=0;

		if(this.pointRelais<=22)
		{
			rPrice = 0;
		}
		else if(this.pointRelais > 22 && this.pointRelais <= 47) {
			rPrice = 2.99;
		}
		
		else
		{
			rPrice = 4.99;
		}

		return rPrice;

	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Vous avez choisis ** Relay Delivery ** comme livraison: " + this.getPrice();
	}

	


}
