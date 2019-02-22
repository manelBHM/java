package maven_projet1.products_maven;

public class Four extends Product{
	
	private int puissance;
	
	public Four() {
		// TODO Auto-generated constructor stub
	}
	
	public Four(String nom, String description, double price, int puissance) {
		super(nom, description, price);
		this.puissance = puissance;
	}

	public int getPuissance() {
		return puissance;
	}
	
	public void look() {
		System.out.println("Marque : " + nom + " - " + description + " - " + "Prix : " + price + " euros" + " - " + "Puissance : " + puissance + " watts");
	
}
	
	

}
