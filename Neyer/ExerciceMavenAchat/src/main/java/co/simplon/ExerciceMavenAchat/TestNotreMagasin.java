package co.simplon.ExerciceMavenAchat;

import java.util.HashMap;

public class TestNotreMagasin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client c1 = new Client("Neyer","30 rue Champs Elysées");
		c1.afficheClient();
		
		//creation de produit 
		Produit p1 = new Four(230.99,20.2,70);
		Produit p2 = new Television(120.99, "LCD","4/3");
		Produit p3 = new Microonde(29.99,900,true);
		
		//affichage des produits
		p1.afficheProduit();
		p2.afficheProduit();
		p3.afficheProduit();
		
		
		Facture f1 = new Facture(c1);//on crée une facture du client c1
		f1.ajouterProduit(p1, 1);
		f1.ajouterProduit(p3, 2);
		f1.ajouterProduit(p2, 1);
		
		System.out.println(f1.total());//affichage somme total
		
		f1.afficheFacture();
		
		Writer fiche1 = new FileWriter("laFacture.txt");//création d'un objet fichier dont le fichier se nommera laFacture
		
		try {//verifi l'exeception
		f1.generate(fiche1);//génére le fichier remplie
		}catch(NoProductInFactureExeception e) {}
	}
}
