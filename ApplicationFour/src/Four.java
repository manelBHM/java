
public class Four {
	private int puissance;
	private int capacite;

	public Four(int capacite, int puissance) {
		this.puissance = puissance;
		this.capacite = capacite;
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

	public void cuire() {
		System.out.println("Je cuit un aliment avec une capacité de " + capacite + " litres et une Puissance de "
				+ puissance + " dégres");
	}

}
