package co.hamza.jeu;

import co.hamza.jeu.outils.Des;
import co.hamza.jeu.personnages.Bourreau;
import co.hamza.jeu.personnages.Juge;
import co.hamza.jeu.personnages.Victime;

public class AireDeJeu {

	public static void main(String[] args) throws InterruptedException {
		Juge juge = new Juge();
		Bourreau bourreau = new Bourreau();
		Victime victime = new Victime();
		Des des = new Des();

		/**
		 * La première étape du jeu consiste en la désignation des rôles attribués à
		 * chacun des trois protagonistes. Cela se fait par le lancement d'une paire de
		 * dés. Si les deux dés affichent deux valeurs paires, le joueur qui les a
		 * lancés obtient le rôle de juge. Si l'un des dés retourne une valeur paire et
		 * l'autre une valeur impaire, le joueur qui les a lancés obtient le rôle de
		 * bourreau. Si les deux dés affichent deux valeurs impaires, le joueur qui les
		 * a lancés obtient le rôle de victime.
		 */

		// Lancement des dés
		int d1 = des.lancer();
		int d2 = des.lancer();

		// Désignation des rôles en fonction du résultat du lancement
		System.out.println(d1 + "  " + d2);

		if (d1 % 2 == 0 && d2 % 2 == 0) {
			System.out.println("Vous êtes le juge");
		} else if (d1 % 2 == 0 || d2 % 2 == 0) {
			System.out.println("Vous êtes le bourreau");
		} else {
			System.out.println("Vous êtes la victime");
		}
		
		juge.sentence();

	}

}
