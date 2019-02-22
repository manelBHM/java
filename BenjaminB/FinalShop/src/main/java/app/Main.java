

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int quantitey = 0;
		Scanner sc = new Scanner(System.in);
		Takeway take = new Takeway();
		Express expres = new Express();
		Relay relay = new Relay();
		Domicile dom = new Domicile();
		Produit tele1 = new Television("Samsung UE56612 ", 399, "super TV bro", "Samsung", 100, "LCD");
		Produit tele2 = new Television("Philips HD34567", 499, "Supet TV too", "Philips", 130, "LED");
		Produit frigo1 = new Frigo("BEKOWsssSsUUPER FReeZ", 599, "Froid comme ta mere", "BEKO", 40, true);
		Client client = new Client("Arthur", "123 fake street", 666);
		Facture facture = new Facture(client, take);
		boolean rester = true;
		do {
			System.out.println("Choisissez un produit : ");
			System.out.println("1 : Tele samsumng// 2 : Tele Philips// 3 : Le frigo BEKO");
			int x = sc.nextInt();
			switch (x) {
			case 1:
				System.out.println("En quelle quantité ? :");
				int y = sc.nextInt();
				facture.addProduct(tele1, y);
				break;
			case 2:
				System.out.println("En quelle quantité ? :");
				int z = sc.nextInt();
				facture.addProduct(tele2, z);
				break;

			case 3:
				System.out.println("En quelle quantité ? :");
				int zz = sc.nextInt();
				facture.addProduct(frigo1, zz);
			}

			System.out.println("Voulez vous continuer d'ajouter des produits ? // 1 : oui // 2 : non");
			int stay = sc.nextInt();
			if (stay == 2) {
				rester = false;
			}

		} while (rester);

		System.out.println(
				"Choisir methode de livraison : 1-Domicile// 2-relay // 3-express // Par défault : a venir chercher");
		int choix = sc.nextInt();

		switch (choix) {
		case 1:
			facture.setLivraison(dom);
			break;
		case 2:
			facture.setLivraison(relay);
			break;
		case 3:
			facture.setLivraison(expres);
			break;
		}

		facture.generateConsole();

	}

}
