
public class Four {
	
	int puissance;
	int capacite;
	
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

	public Four(int capacite, int puissance) {
		this.puissance = puissance;
		this.capacite = capacite;
	}
	
	public void Cuire() {
		System.out.println("Je cuis un aliment" + "\n" + "avec ma capacite de " + capacite + " Litres" + "\n"
	+ "et ma puissance de " + puissance + " degres");
	}
	
	

}
