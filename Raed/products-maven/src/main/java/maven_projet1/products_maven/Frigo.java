package maven_projet1.products_maven;

public class Frigo extends Product{
	
	private char classeEnergetique;
	
	public Frigo() {
		// TODO Auto-generated constructor stub
	}
	
	public Frigo(String nom, String description, double price, char classeEnergetique) {
		
		super (nom, description, price);
		this.classeEnergetique = classeEnergetique;
		
	}

	public char getClasseEnergetique() {
		return classeEnergetique;
	}
	
	public void look() {
		System.out.println("Marque : " + nom + " - " + description + " - " + "Prix : " + price+ " euros" + " - " + "Classe énergétique : " + classeEnergetique);
	
}
	
	

}
