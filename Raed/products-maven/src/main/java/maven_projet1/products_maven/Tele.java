package maven_projet1.products_maven;

public class Tele extends Product{
	
	private int taille;
	
	public Tele() {
		// TODO Auto-generated constructor stub
	}
	
	public Tele(String nom, String description, double price, int taille) {
		
		super(nom, description, price);
		this.taille = taille;
	}

	public int getTaille() {
		return taille;
	}
	
	
		public void look() {
			System.out.println("Marque : " + nom + " - " + description + " - " + "Prix : " + price + " euros" + " - " + "taille : " + taille + " pouces.");
		
	}
	

	
	

}
