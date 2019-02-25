package co.simplon;

import java.util.Scanner;

public class TestPharmacie {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Client c1 = new Client("Bart", " Simpson");
		
		Produit p1 = new Produit("Doliprane", 5.0);
		
		Produit p2 = new Produit("Spasfon", 3.0);
		
		Produit p3 = new Produit("Dafalgan", 6.0);
		
		
		Facture f1 = new Facture(c1);
		
		
		System.out.println("----------------------------------------");
		System.out.println("             Commande                   ");
		System.out.println("----------------------------------------");
		System.out.println("\n");
		System.out.println("Liste des articles disponibles");
		System.out.println("\n");
		
		System.out.println("1- Doliprane");
		System.out.println("2- Spasfon");
		System.out.println("3- Dafalgan");
		System.out.println("\n");
		
		
		int choix = sc.nextInt();
		switch(choix) {
		 
		case 1:
			System.out.println(p1);
			break;
		case 2:
			System.out.println(p2.toString());
			break;
		case 3:
			System.out.println(p3.toString());
			break;
		default:
			System.out.println("Vous avez mal saisi votre commande");
			break;
		}
		
	}
}
