package co.project.shiop;

public class Frigo extends Product {
	private int liter;
	private boolean freezer;
	private String frigo;

	public String getFrigo() {
		return frigo;
	}

	public void setFrigo(String frigo) {
		this.frigo = frigo;
	}

	public Frigo(String marque, String name, String description, double price, int liter, boolean freezer) {
		super(marque, name, description, price);
		this.freezer = freezer;
		this.liter = liter;
	}

	public String toString() {
		return getMarque() + " - " + getName() + " - " + getDescription() + " - " + " litres " + liter + " - "
				+ " Freezer : " + freezer + "-" + " Prix " + getPrice() + "";
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
