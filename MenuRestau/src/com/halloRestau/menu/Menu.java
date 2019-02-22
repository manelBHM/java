package com.halloRestau.menu;

import java.util.Scanner;

public class Menu {

	Scanner sc = new Scanner(System.in);

	public int nmbOfMenu() {
		int nmbrMenu = -1;
		System.out.println("Combien de menu souhaitez vous ? :");
		do {
			nmbrMenu = sc.nextInt();
		} while (nmbrMenu < 0);
		return nmbrMenu;
	}

	public void showMenus() {
		System.out.println("Quel menu voulez vous ?");
		System.out.println("1 - Poulet");
		System.out.println("2 - Boeuf");
		System.out.println("3 - Végétarien");
	}

	public void showSides() {
		System.out.println("Choisissez votre side svp :");
		System.out.println("1 - Légumes frais");
		System.out.println("2 - Frites");
		System.out.println("3 - Riz");
	}

	public void showVegetarien() {
		System.out.println("Voulez vous un peu de riz?");
		System.out.println("1 - Riz");
		System.out.println("2 - Pas de riz");
	}

	public void showDrink() {
		System.out.println("Quelle boisson voulez vous ?");
		System.out.println("1 - Un grand cru Evian 2018");
		System.out.println("2 - Une boisson gazeuse");
		System.out.println("3 - Un soda");
	}

	public int askMenu() {
		showMenus();
		int menu = sc.nextInt();
		return menu;
	}

	public int askDrink() {
		showDrink();
		int drink = sc.nextInt();
		return drink;
	}

	public int askSide(int menu) {
		switch (menu) {
		case 1:
			showSides();
			break;
		case 2:
			showSides();
			break;
		case 3:
			showVegetarien();
			break;
		}
		int choix = sc.nextInt();
		return choix;
	}

	public void chooseMenu() {
		int menu = askMenu();
		int side = 0, drink = 0;

		switch (menu) {
		case 1:
			side = askSide(1);
			drink = askDrink();
			break;
		case 2:
			side = askSide(2);
			break;
		case 3:
			side = askSide(3);
			drink = askDrink();
			break;
		}
		comfirmation(menu, side, drink);
	}

	public void runMenu() {
		int run = nmbOfMenu();
		for (int i = 0; i < run; i++) {
			chooseMenu();
		}
	}

	public void comfirmation(int a, int b, int c) {
		System.out.println("Vous avez fait le choix numero : " + a);
		System.out.println("Vous avez fait le choix numero : " + b);
		System.out.println("Vous avez fait le choix numero : " + c);
	}
}
