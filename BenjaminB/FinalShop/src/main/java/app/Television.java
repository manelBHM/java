package co.simplon;

public class Television extends Produit {

      int largeurEcran;
      String dalle;
	public Television(String nom, int prix, String description, String marque, int largeurEcran, String dalle) {
		super(nom, prix, description, marque);
		this.largeurEcran = largeurEcran;
		this.dalle = dalle;
	}
      
      
	
	

}
