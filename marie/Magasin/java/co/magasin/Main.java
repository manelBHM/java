package co.magasin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import co.livraison.AEmporter;
import co.livraison.Delivery;
import co.livraison.Domicile;
import co.livraison.Express;
import co.livraison.Relais;

import java.util.Map.Entry;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Domicile dom = new Domicile();
		Relais rel = new Relais();
		Express exp = new Express();
		AEmporter emp = new AEmporter();
		boolean rester = true;
		Delivery delivery = null;
		
		Produit Televiseur = new Produit("Panasonic - UTHDWOW", "Avec ce televiseur vous pourrez regarder les plus belles emissions tel que 'TPMP' ou 'Les Anges de la Teleralite' ...", 499.90);
		Produit Aspirateur = new Produit("Dyson - Typhon", "Ce model aspire comme jaja ! Il parait mÃªme qu'il aspire les Ã¢mes.", 299.90);
		Produit Micro_onde = new Produit("LG - TheAtomicOne", "Parfait pour votre cuisine, ce micro onde cuit de tout a la perfection, il suffit de choisir le bon mode !", 149.90);
		Produit Ordinateur = new Produit("MacBook Pro", "WOW ! C'est l'ultime ordinateur par Apple ! (Jusqu'a ce qu'ils en sortent un nouveau dans 6 mois ...)", 2999.90);
		Produit Telephone = new Produit("iPhone", "WOW ! C'est l'ultime telephone par Apple ! (Jusqu'a ce qu'ils en sortent un nouveau dans 6 mois ...)", 1999.90);
		Produit Lave_linge = new Produit("Whirlpool", "Ce lave linge, lave plus blanc que blanc !", 390.90);
		Produit Refregirateur  = new Produit("LG - Groenland", "Economique et efficace, le frigo qu'il vous faut.", 149.90);

		Client client1 = new Client("Jean Bon", "1 rue de la charcuterie, 75011 PARIS");
		Client client2 = new Client("Jean Quette", "42 rue du Mystere, 75012 PARIS");
		Client client3 = new Client("Jean Phille", "69 rue de Pigale, 75018 PARIS");
		
		Facture kevbill = new Facture(client3, delivery);
		Map<Produit, Integer> listeProduits = kevbill.getProducts();
		
		System.out.println("Bienvenue au magasin, de quoi avez vous besoin ?");
		do {
			System.out.println("1) Televiseur\n"
					+ "2) Aspirateur\n"
					+ "3) Micro Ondes\n"
					+ "4) Ordinateur\n"
					+ "5) Telephone\n"
					+ "6) Lave Linge\n"
					+ "7) Refrigirateur\n");
			int choix = sc.nextInt();
			
			switch (choix) {
			case 1 :
				System.out.println("En quelle quantite ?");
				int a = sc.nextInt();
				kevbill.addProduit(Televiseur, a);
				break;
			case 2 :
				System.out.println("En quelle quantite ?");
				int b = sc.nextInt();
				kevbill.addProduit(Aspirateur, b);
				break;

			case 3 :
				System.out.println("En quelle quantite ?");
				int c = sc.nextInt();
				kevbill.addProduit(Micro_onde, c);
				break;
			case 4 :
				System.out.println("En quelle quantite ?");
				int d = sc.nextInt();
				kevbill.addProduit(Televiseur, d);
				break;
			case 5 :
				System.out.println("En quelle quantite ?");
				int e = sc.nextInt();
				kevbill.addProduit(Aspirateur, e);
				break;

			case 6 :
				System.out.println("En quelle quantite ?");
				int f = sc.nextInt();
				kevbill.addProduit(Micro_onde, f);
				break;
			case 7 :
				System.out.println("En quelle quantite ?");
				int g = sc.nextInt();
				kevbill.addProduit(Micro_onde, g);
				break;
			}

			System.out.println("Avez vous besoin d'autre chose ?\n"
					+ "1) Oui\n"
					+ "2) Non");
			int stay = sc.nextInt();
			
			if (stay == 2) {
				rester = false;
			}
			
		} while (rester);
		
		System.out.println("De quelle façon voulez vous être livrer ?\n"
				+ "1) Pas besoin de livraison, vous venez chercher vos articles.\n"
				+ "2) Livraison a domicile.\n"
				+ "3) Livraison express !\n"
				+ "4) Livraison en point relais.\n");
		int choix = sc.nextInt();

		switch (choix) {
		case 1 :
			kevbill.setDelivery(emp);
			break;
		case 2 :
			kevbill.setDelivery(dom);
			break;
		case 3 :
			kevbill.setDelivery(exp);
			break;
		case 4 :
			kevbill.setDelivery(rel);
			break;
		}
		
		//kevbill.resumePanier(listeProduits);
		
		kevbill.generateConsole();
		
		//FileWriter Fw = new FileWriter("C:\\Users\\kevin\\OneDrive\\Bureau\\Facture papier");
		
		//kevbill.generate(Fw);
		
		
	}
}
