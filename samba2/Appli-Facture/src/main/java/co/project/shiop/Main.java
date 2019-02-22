package co.project.shiop;

import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Delivery deliver = null;

		System.out.println("Quel Mode de livraison souhaitez vous : ?");
		System.out.println("1 - Livraison à domicile");
		System.out.println("2 - Retait point-relay");
		System.out.println("3 - Livraison express à domcile");
		System.out.print("4 - Prendre a importer : ");
		int modeLivraison = sc.nextInt();

		int city;
		switch (modeLivraison) {
		case 1:
			deliver = new DirectDelivery();
			break;
		case 2:
			deliver = new RelayDelivery(23);
			break;
		case 3:

			do {
				System.out.print("Dans quel ville habitez-vous : ? 1 - Paris - 2 Autre : ");
				city = sc.nextInt();
			} while (city != 1 && city != 2);
			if (city == 1) {
				deliver = new ExpressDelivery("paris");
			} else {
				deliver = new ExpressDelivery("Autre");
			}

			break;
		case 4:
			deliver = new TakeAwayDelivery();
			break;
		}

		Television tv = new Television("Samsung", "TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49,
				"LED");
		Frigo frigo = new Frigo("BEKO", "BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130,
				false);
		Cafetiere cafe = new Cafetiere("Phillps", "Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses",
				79.99);

		Product televistion = (Product) tv;
		Product fridge = (Product) frigo;

		Customer client = new Customer("Dupont Nicolas", "17 Rue de la Nouvel-France 75001 Paris");
		// Delivery deliver = new RelayDelivery(23);
		Bill bill = new Bill(client, deliver);

		Map<Product, Integer> facture = bill.getProducts();

		bill.addProduct(televistion, 2);
		bill.addProduct(fridge, 1);
		bill.addProduct(cafe, 3);

		bill.resume();
		// System.out.println("Liste des resume du total de la comment : " +
		// bill.calculTotal(facture) + "€");

		System.out.println("***********************************************");
		System.out
				.println("Total Facture  : " + bill.calculTotal(facture) + "€" + "\nMode de" + deliver.getInfo() + "€");

		System.out.println("\n******************************************************************************");

	}

}
