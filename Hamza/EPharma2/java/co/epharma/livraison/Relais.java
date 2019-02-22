package co.epharma.livraison;

public class Relais implements Livraison{
	
	public Relais() {
		// TODO Auto-generated constructor stub
	}

	public double getPrix() {
		return 3;
	}

	public String getInfo() {
		String info = "- Livraison en point Relais : " + getPrix() + " euros";
		return info;
	}

}
