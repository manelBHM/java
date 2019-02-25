package simplon;

import java.util.Scanner;

public class TestShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Client c1 = new Client("Bart", " Simpson", "220 Evergreen Terasse");
		
		Produit p1 = new Tele("Apple", "Full HD", 500.0, "32p", "TV 4K");
		
		Produit p2 = new Cafetiere("Nespresso", "cafee", 50.0, 1, 1);
		
		Produit p3 = new Four("Samsung", "plaque onde", 700.0, 220.0, 360);
		
		System.out.println("\n");
		System.out.println("Quel est votre mode de livraison?");
		System.out.println("\n");
		System.out.println("1- Express");
		System.out.println("2- Relay");
		System.out.println("3- Domicile");
		System.out.println("\n");
		int livraison = sc.nextInt();
		
		
		Livraison l1 = null;

		switch(livraison) {
		
		case 1:
			l1 = new Express();
		break;
		
		case 2:
			l1 = new Relay();
		break;
		
		case 3:
			l1 = new Domicile();
		break;
		
		default:
		System.out.println("Vous n'avez pas valider le choix de livraison");
		break;
}
		
		Facture f1 = new Facture(c1, l1);
		
		
		System.out.println("----------------------------------------");
		System.out.println("             Commande                   ");
		System.out.println("----------------------------------------");
		System.out.println("\n");
		System.out.println("Liste des articles disponibles");
		System.out.println("\n");
		
		System.out.println("1- Tele");
		System.out.println("2- Cafetiaire");
		System.out.println("3- Four");
		System.out.println("\n");
		
		
		int choix = sc.nextInt();
		switch(choix) {
		 
		case 1:
			System.out.println(p1);
			//f1.ajoutPanier(p1, 1);
			break;
		case 2:
			System.out.println(p2.toString());
			//f1.ajoutPanier(p2, 2);
			break;
		case 3:
			System.out.println(p3.toString());

			//f1.ajoutPanier(p3, 1);
			break;
		default:
			System.out.println("Vous avez mal saisi votre commande");
			break;
		}
		
		/*Facture f1 = new Facture(c1, l1);
		f1.ajoutPanier(p1, 1);
		f1.ajoutPanier(p2, 2);
		f1.ajoutPanier(p3, 1);*/
		
		//f1.afficheFacture();
		
}

}





















