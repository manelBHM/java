package co.project.shiop;

public class Four extends Product {
	private int puissance;
	private int capacite;

	public Four(String marque, String name, String description, double price, int puissance, int capacite) {
		super(marque, name, description, price);
		this.capacite = capacite;
		this.puissance = puissance;
	}

	@Override
	public String toString() {
		return getMarque() + "-" + getName() + "-" + getDescription() + "-" + "Prix " + getPrice() + "Capacité de "
				+ capacite + "litre \n " + "Puissance de " + puissance + "degrée";
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

}
