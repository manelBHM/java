package co.hamza.produits;

public class Frigo extends Produits{
	
	private char classeEnergetique;
	
	public Frigo() {
	}
	
	public Frigo(String nom, String description, char classeEnergetique, double prix) {
		super(nom, description, prix);
		this.classeEnergetique = classeEnergetique;
		this.quantite ++ ;
	}

	public char getClasseEnergetique() {
		return classeEnergetique;
	}

	public void setClasseEnergetique(char classeEnergetique) {
		this.classeEnergetique = classeEnergetique;
	}
	
	
}
