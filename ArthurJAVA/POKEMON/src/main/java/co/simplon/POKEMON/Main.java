package co.simplon.POKEMON;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		Pokemon salameche = new Pokemon("Salameche", 50);
		Pokemon reptincel = new Pokemon("Reptincel", 80);
		Pokemon dracaufeu = new Pokemon("Dracaufeu", 150);
		Pokemon carapuce = new Pokemon("Carapuce", 40);
		Pokemon carabaffe = new Pokemon("Carabaffe", 80);
		Pokemon tortank = new Pokemon("Tortank", 100);
		Pokemon bulbizarre = new Pokemon("Bulbizarre", 40);
		Pokemon herbizare = new Pokemon("Herbizarre", 60);
		Pokemon florizare = new Pokemon("Florizare", 130);

		LinkedList<Pokemon> liste = new LinkedList<Pokemon>();

		liste.add(herbizare);
		liste.add(bulbizarre);
		liste.add(carabaffe);
		liste.add(carapuce);
		liste.add(dracaufeu);
		liste.add(reptincel);
		liste.add(salameche);
		liste.add(tortank);
		liste.add(florizare);

		
		tortank.Afficher();
		System.out.println();

        Combat x = new Combat();
        x.Run(liste);
		
	}

}
