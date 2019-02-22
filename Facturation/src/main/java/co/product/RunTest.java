package co.product;

import java.util.Map;

public class RunTest {

	public static void main(String[] args) {

		Product tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
		Product frigo = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);
		Product four = new Four("Sony Tsl 568", "Four Cuisson intence new generation", 499.0, 3000);

		Customer custom = new Customer("Dupont Francois", "14 Rue de la Republic 75001 Paris");
		RelayDeliver relay = new RelayDeliver(48);

		Bill bill = new Bill(custom, relay);

		bill.addProduct(tv, 2);
		bill.addProduct(frigo, 3);
		bill.addProduct(four, 1);

		Map<Product, Integer> facture = bill.getProduits();

		bill.resumeBill(facture);
		System.out.println("Total de la commande hors livrason : " + bill.totalBill(facture));

		FileWriter fw = new FileWriter("facture.txt");
		bill.generate(fw);

	}
}
