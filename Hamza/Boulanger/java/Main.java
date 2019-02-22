import java.util.ArrayList;
import java.util.Scanner;

import co.hamza.clients.Client;
import co.hamza.facture.Facture;
import co.hamza.livraison.ADomicile;
import co.hamza.livraison.Express;
import co.hamza.livraison.Livraison;
import co.hamza.livraison.Relay;
import co.hamza.livraison.SurPlace;
import co.hamza.produits.Four;
import co.hamza.produits.Frigo;
import co.hamza.produits.Produits;
import co.hamza.produits.Television;

public class Main {

	public static void main(String[] args) {

		Television tele = new Television("LG", "Ecran OLED", 27, 1300);
		Frigo frigo = new Frigo("Samsung", "Double compartiment", 'A', 800);
		Four four = new Four("Panasonic", "Four micro-onde", 200, 80);
		Client client = new Client("Tony Truand", "25 rue des buissons 75000");
		Livraison livraison = null;

		System.out.println("Veuillez choisir un mode de livraison : \n" + "1 - Livraison à domicile  \n"
				+ "2 - Livraison Express  \n" + "3 - Dépot en point relais  \n"
				+ "4 - Marchandise à retirer sur place  ");

		Scanner sc = new Scanner(System.in);
		int saisie = sc.nextInt();
 
		switch (saisie) {
		case 1:
			livraison = new ADomicile();

			break;
		case 2:
			livraison = new Express();

			break;
		case 3:
			livraison = new Relay();

			break;
		case 4:
			livraison = new SurPlace();

			break;
		}

		Facture facture = new Facture(client, livraison);

		facture.addProduits(four);
		four.setQuantite(1);
		facture.addProduits(frigo);
		frigo.setQuantite(1);
		facture.addProduits(tele);

		ArrayList<Produits> liste = facture.getProduits();

		System.out.println("");
		System.out.println("\n------------------- FACTURE --------------------\n");
		System.out.println(client.getNom() + "\n" + client.getAdresse());
		System.out.println("\n------------------- PRODUITS -------------------\n");
		facture.panier(liste);
		System.out.println("\n-------------- MODE DE LIVRAISON ---------------\n");
		System.out.println(livraison.getInfo());
		System.out.println("\n------------------------------------------------\n");
		System.out.println("TOTAL : " + facture.total(liste) + " euros");

	}

}
