package com.Pokemon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RunPokemon {

	public void run(List<Pokimon> list) throws RuntimeException {

		ArrayList<Pokimon> maList = new ArrayList<Pokimon>();
		Scanner sc = new Scanner(System.in);
		boolean rester = true;

		do {
			System.out.println("Choisir un pokemon : 1 / Rentrez en duel : 2 ?");
			int choix = sc.nextInt();

			switch (choix) {
			case 1:
				showPokemon(list);
				System.out.println();
				System.out.println(" Choirsir son pokemeon : ? ");
				int x = sc.nextInt();
				Pokimon monPokemon = list.get(x - 1);
				maList.add(monPokemon);
				// list.remove(monPokemon);
				System.out.println();
				System.out.println(" Bon choix de pokemenom " + monPokemon.getNom());
				break;

			case 2:
				if (list.contains(null)) {

				}

				int newEnemyPV;
				int myNewPv;
				monPokemon = list.get(0);
				Random random = new Random();
				int randomList = random.nextInt(list.size());
				Pokimon enemy = list.get(randomList);
				System.out.println("Votre enemi est : " + enemy.getNom() + " Preparez vous !!");
				System.out.println("Votre enemy a : " + enemy.getPointVie() + " PV");
				System.out.println();
				System.out.println(
						"Mon Pokemon est : " + monPokemon.getNom() + " Il dispose de " + monPokemon.getPointVie());
				// break;
				do {
					System.out.println("Attaque : 1" + monPokemon.getAttaque1().getNom());
					System.out.println("Attaque : 2" + monPokemon.getAttaque2().getNom());

					int attaque = sc.nextInt();
					switch (attaque) {

					case 1:
						newEnemyPV = enemy.getPointVie() - monPokemon.getAttaque1().getDegat();
						enemy.setPointVie(newEnemyPV);
						System.out.println("Vous infligez : " + monPokemon.getAttaque1().getNom() + "pour "
								+ monPokemon.getAttaque1().getDegat() + "Se super efficace");

						System.out.println("Il rest " + enemy.getPointVie() + "a l'enemy ");

						if (enemy.getPointVie() < 0) {
							break;
						}

						int rand = new Random().nextInt(100);

						if (rand > 50) {
							myNewPv = monPokemon.getPointVie() - enemy.getAttaque1().getDegat();
							monPokemon.setPointVie(myNewPv);

							// for (int i = 0; i < 4; i++) {
							// Thread.sleep(500);
							// System.out.println("*");
							// }
							System.out.println();

							System.out.println("Aill vous recevez : " + enemy.getAttaque1().getNom() + "pour"
									+ enemy.getAttaque1().getDegat() + "PV, c'est efficace!!");
						} else {
							myNewPv = monPokemon.getPointVie() - enemy.getAttaque2().getDegat();
							monPokemon.setPointVie(myNewPv);

							// for (int i = 0; i < 4; i++) {
							// Thread.sleep(500);
							// System.out.println("*");
							// }
							System.out.println();
							System.out.println("Aill vous recevez :" + enemy.getAttaque2().getNom() + "pour"
									+ enemy.getAttaque2().getDegat() + "PV, c'est efficace!!");
						}

						System.out.println("Il vous reste : " + monPokemon.getPointVie() + "Pv");
						break;

					case 2:
						newEnemyPV = enemy.getPointVie() - monPokemon.getAttaque2().getDegat();
						enemy.setPointVie(newEnemyPV);
						System.out.println("Vous infligez " + monPokemon.getAttaque2().getNom() + "pour"
								+ monPokemon.getAttaque2().getDegat() + "PV, c'est efficate!!");
						System.out.println("Il reste " + enemy.getPointVie() + "PV a l'enemy!!");
						if (enemy.getPointVie() < 0) {
							break;
						}

						int rand2 = new Random().nextInt(100);
						if (rand2 > 50) {
							myNewPv = monPokemon.getPointVie() - monPokemon.getAttaque1().getDegat();
							monPokemon.setPointVie(myNewPv);

							// for (int i = 0; i < 4; i++) {
							// Thread.sleep(500);
							// System.out.println("*");
							// }

							System.out.println();

							System.out.println("Vous recevez " + enemy.getAttaque1().getNom()
									+ enemy.getAttaque1().getDegat() + "PV, c'est efficace!!");
						} else {
							myNewPv = monPokemon.getPointVie() - monPokemon.getAttaque2().getDegat();
							monPokemon.setPointVie(myNewPv);

							// for (int i = 0; i < 4; i++) {
							// Thread.sleep(500);
							// System.out.println("*");
							// }
							System.out.println();
							System.out.println("Vous recevez " + enemy.getAttaque1().getNom()
									+ enemy.getAttaque1().getDegat() + "PV, c'est efficace!!");
						}
						System.out.println("Il vous reste : " + monPokemon.getPointVie() + "PV");
						break;
					}

				} while (monPokemon.getPointVie() > 0 && enemy.getPointVie() > 0);

				if (monPokemon.getPointVie() < 0) {
					System.out.println("You louse ! jeune dresseur");
				} else if (enemy.getPointVie() < 0) {
					System.out.println("Bravo vous etes bientot pret pour le conseil");
				} else {
					System.out.println("Vous ets a egalité");
				}

				System.out.println("COMBAT TERMINEY REVENEZ PLUS TARD");
				// Thread.sleep(2500);

				rester = false;
			}

		} while (rester);
	}

	public void showPokemon(List<Pokimon> list) {
		int i = 1;
		Iterator<Pokimon> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getNom() + " : " + i++);
		}
	}

}
