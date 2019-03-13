package co.epharma.livraison;

public class Domicile implements Livraison {
	
	public Domicile() {
		// TODO Auto-generated constructor stub
	}

	public double getPrix() {
		return 5;
	}

	public String getInfo() {
		String info = "- Livraison à domicile : " + getPrix() + " euros";
		return info;
	}

}
