package appFour;

public class Four {
	        int capacite;
			int puissance;
			
	public void cuire() {
		System.out.println("je cuis un aliment");
		System.out.println("avec une capacité de " + capacite + "litres");
		System.out.println("et ma puissance de " + puissance + "degrés");
	}
	
public static class Main {
	public static void main(String[] args) {
	
	Four petitFour = new Four();
	petitFour.capacite = 30;
	petitFour.puissance = 180;
	
	Four grandFour = new Four();
	grandFour.capacite = 55;
	grandFour.puissance = 260;
	
	petitFour.cuire();
	System.out.println("");
	grandFour.cuire();
	
}
}

	}


