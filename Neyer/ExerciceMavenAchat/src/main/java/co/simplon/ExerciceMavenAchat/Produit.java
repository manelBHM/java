package co.simplon.ExerciceMavenAchat;

public class Produit {
	
	String nomProduit;
	double prix;
	int idProduit;
	
	public Produit(String nomProduit, double prix) {
		
		this.nomProduit=nomProduit;
		this.prix=prix;
		
	}
	
	public void afficheProduit() {
		
		
		
		System.out.println("Le produit : "+ nomProduit + ", coûte : " + prix+"€");
	}
	
	
	 /*public Produit acheterProduit() {
		 
		 Produit produitChoisi ;
		 
		 return produitChoisi;
	 }*/

}
