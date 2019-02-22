package co.product;

public class TakeAwayDeliver implements Deliver {

	@Override
	public double getPrice() {
		return 0;
	}

	@Override
	public String getInfo() {
		return "Retrait 0.00€";
	}

}
