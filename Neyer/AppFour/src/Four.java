
public class Four {
	
	int puissance;
	int capacite;
	
	public Four(int puissance, int capacite) {
		
		this.puissance=puissance;
		this.capacite = capacite;
		
	}
	
	
	
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}



	public void cuire() {
		
		System.out.println("Je suis un aliment");
		System.out.println("avec ma capacité de "+capacite+" Litres");
		System.out.println("et ma puissance de "+puissance+" degrés");
		System.out.println("");
		
	}

}
