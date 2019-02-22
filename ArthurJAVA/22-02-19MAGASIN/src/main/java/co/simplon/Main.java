package co.simplon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws InterruptedException  {

		Television télé1 = new Television("Samsung", "Good TV bro", 100, 55, "LCD");
		Television télé2 = new Television("Philips", "Not so good TV", 80, 40, "LED");
		Fridge fridge1 = new Fridge("LG", "nice fridge", 200, 40, true);
		Fridge fridge2 = new Fridge("SuperFrigo", "Best fridge EVER", 400, 60, true);

		Client client = new Client("Jean", "12 rue des branches");

		Bill facture = new Bill(client);

		facture.addProduct(fridge1, 1);
		facture.addProduct(télé2, 10);

		Map<Produit, Integer> listeProducts = facture.getProducts();
		
		String x = "BIENVENUE DANS MON SUPER MAGASIN";
		for (int i =0; i<x.length();i++) {
			Thread.sleep(150);
			System.out.print(x.charAt(i));
		}
		
		System.out.println();

		System.out.println("Le total de la facture est " + facture.totalProduit(listeProducts));
		
		Writer f = new FileWriter("facture-"+ client.getFullname() +".txt");
		
		facture.generate(f);
		
		
		ArrayList<String>aze = new ArrayList<>();
		aze.add("salut");
		aze.add("cava");
		
		
		
		
		for (String a : aze) {
			System.out.println(a);
		}

	}

}
