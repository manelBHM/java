package co.hamza.jeu.personnages;

import java.util.Scanner;

public class Juge extends Personnages {

	private	int coup;
	private	String[] intensite = {"doux", "fort"};

	public Juge() {

	}

	public void sentence() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Choisissez le nombre de coup(s) : ");
		int coup = sc.nextInt();
		System.out.println("Vous avez choisi " + coup + " coups.");
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Choisissez l'intensité : ");
		String intensite = sc2.nextLine();
		System.out.println("Vous avez choisi " + intensite);
		

	}

}
