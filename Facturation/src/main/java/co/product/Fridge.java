package co.product;

public class Fridge extends Product {
	private int liter;
	private boolean freezer;

	public Fridge(String nom, String description, double price, int liter, boolean freezer) {
		super(nom, description, price);
		this.liter = liter;
		this.freezer = freezer;

	}

	public int getLiter() {
		return liter;
	}

	public void setLiter(int liter) {
		this.liter = liter;
	}

	public boolean isFreezer() {
		return freezer;
	}

	public void setFreezer(boolean freezer) {
		this.freezer = freezer;
	}

}
