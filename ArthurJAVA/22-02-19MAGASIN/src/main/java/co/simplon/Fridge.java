package co.simplon;

public class Fridge extends Produit {

	int litter;
	boolean freezer;

	public int getLitter() {
		return litter;
	}

	public void setLitter(int litter) {
		this.litter = litter;
	}

	public boolean isFreezer() {
		return freezer;
	}

	public void setFreezer(boolean freezer) {
		this.freezer = freezer;
	}

	public Fridge(String name, String description, int price, int litter, boolean freezer) {
		super(name, description, price);
		this.litter = litter;
		this.freezer = freezer;
	}

}
