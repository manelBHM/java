package co.apiMagasin;

import java.util.Map;

public class TestMagasin {

	public static void main(String[] args) {

		Produit tv = new Television("Sony ", " TV xp-340 LED", 49, "Pouce", 799.90);
		Produit fg = new Frigo("Samsung 1042 F", "Réfrigérateur samsung 130L - Classe A+ - blanc", 189, false, 699.00);
		Produit four = new Four("Phillips Four", "Phillips-457M Puissance : ", 3000, 268.99);
		Client client = new Client(" Fane samba ", "145 Boulvard Bonne nouvel Paris");

		Delivery delivery = new DirectDelivey();
		Bill bill = new Bill(client, delivery);

		bill.addProduct(tv, 1);
		bill.addProduct(fg, 1);
		bill.addProduct(four, 1);

		Map<Produit, Integer> facture = bill.getProduits();

		bill.resumProduit(facture);
		System.out.println("Le total des commandes hors livraison est de " + bill.totalProduit(facture));

		FileWriter Fw = new FileWriter("Bill.txt");
		bill.generate(Fw);

	}

}
