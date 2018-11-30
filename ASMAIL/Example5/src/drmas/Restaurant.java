package drmas;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		/*
		 *  Proposer une Carte de Restaurant à un client et Afficjer son Choix
		 */
		
		//Indication:
		// - Afficher à l'utilisateur une carte de Restaurant et lui demander de choisir un Menu
		// - La carte propose 3 Menus : Poulet, Boeuf, Végétarien
		// - Afficher sur la console Le Choix Du Client
		
		// avec if and else et switch
		
		Scanner s = new Scanner(System.in);
		System.out.println("\n-----------");
		System.out.println("Ce Sont Nos Menus");
		
		String poulet = "poulet";
		String boeuf = "boeuf";
		String vegeratien = "Végératien";
		
		System.out.println("-----------");
		System.out.println("1- "+poulet);
		System.out.println("-----------");
		System.out.println("2- "+boeuf);
		System.out.println("-----------");
		System.out.println("3- "+vegeratien);
		System.out.println("-----------\n");
		
		System.out.println("Choisir que Vous Voulez à Manger Par Mot");
		String menu = s.next();	
		
		
		if(menu.contains(poulet)) {
			System.out.println("Vous avez choisi " + poulet);
		} else if(menu.contains(boeuf)) {
			System.out.println("Vous avez choisi " + boeuf);
		} else if(menu.contains(vegeratien)) {
			System.out.println("Vous avez choisi " + vegeratien);
		}else {
			System.out.println("Nous n'avons pas votre choix ");
		}
		
		/*
		 * Application Avec Switch
		 */
		System.out.println("\n------Choisir Par Numero -----\n");
		System.out.println("Choisir que Vous Voulez à Manger");
		int client = s.nextInt();
		switch(client) {
		case 1:
			System.out.println("Vous avez choisi " + poulet); break;
		case 2:
			System.out.println("Vous avez choisi " + boeuf); break;
		case 3:
			System.out.println("Vous avez choisi " + vegeratien); break;
			default:
				System.out.println("Nous n'avons pas votre choix "); break;
		}
		


	}

}
