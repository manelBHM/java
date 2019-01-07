package cusin2;

public class Four2 {
	int puissance;
	int capacite;

	public void cuire() {
	System.out.println("je cuis un aliment"+"\n"+"avec ma capacité de "+capacite+"litres"+"\n"+"et ma puissance de "+puissance+"litres"+"\n");
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
