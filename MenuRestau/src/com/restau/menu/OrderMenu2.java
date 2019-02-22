package com.restau.menu;

import java.util.Scanner;

public class OrderMenu2 {

	Scanner sc = new Scanner(System.in);
	int nbrMenus;

	public int nbrMenus() {
		System.out.println("Combien souhaitez vous commander de menu ?");
		int nbrMenus = -1;
		do {
			nbrMenus = sc.nextInt();
		} while (nbrMenus < 0);
		return nbrMenus;
	}

	public void afficherMenus() {
		System.out.println("Quel menu voulez vous ?");
		System.out.println("1 - Poulet");
		System.out.println("2 - Boeuf");
		System.out.println("3 - Végétarien");
	}

	public void afficherSides() {
		System.out.println("Choisissez votre side svp :");
		System.out.println("1 - Légumes frais");
		System.out.println("2 - Frites");
		System.out.println("3 - Riz");
	}

	public void afficherVegetarien() {
		System.out.println("Voulez vous un peu de riz?");
		System.out.println("1 - Riz");
		System.out.println("2 - Pas de riz");
	}

	public void afficherDrink() {
		System.out.println("Quelle boisson voulez vous ?");
		System.out.println("1 - Un grand cru Evian 2018");
		System.out.println("2 - Une boisson gazeuse");
		System.out.println("3 - Un soda");
	}

	public int askMenu() {
		afficherMenus();
		int askMenu = sc.nextInt();
		return askMenu;
	}

	public int askDrink() {
		afficherDrink();
		int drink = sc.nextInt();
		return drink;
	}

	public int askSides(int menu) { // on connait deja le menu choisi par le //
									// clien
		switch (menu) {
		case 1:
			afficherSides();
			break;
		case 2:
			afficherSides();
			break;
		case 3:
			afficherVegetarien();
			break;
		}

		int askSide = sc.nextInt();
		return askSide;
	}

	public void runMenu() {
		int menu = askMenu();
		int drink = 0;
		int side = 0;

		switch (menu) {
		case 1:
			side = askSides(1);
			drink = askDrink();
			break;
		case 2:
			side = askSides(2);
			break;
		case 3:
			side = askSides(3);
			drink = askDrink();
			break;
		}

		confirmerCommande(menu, side, drink);
	}

	public void RunMenus() {
		int nbr = nbrMenus();
		for (int i = 0; i < nbr; i++) {
			runMenu();// appel recurssif qui renvoie tous le resutal de la
						// command
		}
	}

	public void confirmerCommande(int choix, int side, int drink) {
		System.out.println("Vous avez choisi comme menu : " + choix);
		System.out.println("Vous avez choisi comme accompagnement : " + side);
		System.out.println("Vous avez choisi comme boisson : " + drink);

	}
}
