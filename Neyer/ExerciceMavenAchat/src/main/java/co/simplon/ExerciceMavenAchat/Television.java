package co.simplon.ExerciceMavenAchat;

public class Television extends Produit{

	String technologie;
	String taille;

	static String nomProduit = "Télévision";

	public Television( double prix,String technologie, String taille) {
		super(nomProduit, prix);
		// TODO Auto-generated constructor stub
		this.technologie=technologie;
		this.taille=taille;
	}

	public void afficheProduit() {

		System.out.println("Le produit : "+ nomProduit + ", coûte : " + prix+"€");
		System.out.println("Propiétés : Technologie : "+technologie+" ; "+"taille écrant : " +taille);
		System.out.println("");
	}

}
