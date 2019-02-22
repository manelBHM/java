package co.simplon.ExerciceMavenAchat;

public class Microonde extends Produit{

	double puissanceMax;
	boolean lumiere;
	static String nomProduit = "Micro-onde";

	public Microonde(double prix, double puissanceMax, boolean lumiere ) {
		super(nomProduit, prix);
		// TODO Auto-generated constructor stub
		this.puissanceMax=puissanceMax;
		this.lumiere=lumiere;
	}

	public void afficheProduit() {

		System.out.println("Le produit : "+ nomProduit + ", coûte : " + prix+"€");
		System.out.println("Propiétés : Puissance Maximum : "+puissanceMax+"Watt ; "+"lumière : "+lumiere);
		System.out.println("");
		
	}
}
