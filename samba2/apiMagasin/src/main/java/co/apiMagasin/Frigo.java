package co.apiMagasin;

public class Frigo extends Produit {
	private int litre;
	private boolean freezer;

	public Frigo(String nom, String descriptive, int litre, boolean freezer, double prix) {
		super(nom, descriptive, prix);
		this.litre = litre;
		this.freezer = freezer;
	}

	public int getLitre() {
		return litre;
	}

	public void setLitre(int litre) {
		this.litre = litre;
	}

	public boolean getFreezer() {
		return freezer;
	}

	public void setFreezer(boolean freezer) {
		this.freezer = freezer;
	}

	public void look() {
		System.out.println("Marque : " + nom + " - " + descriptive + " - " + " Litre du Frigo" + litre + "-"
				+ "Congelateur inclu " + freezer + "-" + "Prix : " + prix + " euros");
	}

}
