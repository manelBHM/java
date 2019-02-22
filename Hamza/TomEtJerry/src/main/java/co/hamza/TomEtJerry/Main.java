package co.hamza.TomEtJerry;

import co.hamza.TomEtJerry.animaux.Chat;
import co.hamza.TomEtJerry.animaux.Souris;
import co.hamza.TomEtJerry.des.Des;
import co.hamza.TomEtJerry.fermier.Fermier;

public class Main {

	public static void main(String[] args) {
		
		 Chat Nemo = new Chat("Nemo", 5);
		 Chat Garfield = new Chat("Garfield", 1);
		 Chat Fripouille = new Chat("Fripouille", 15);
		 Chat Princesse = new Chat("Princesse", 2);
		 Chat Mimine = new Chat("Nemo", 7);
		
		Des des = new Des();
		Souris souris = new Souris();
		Fermier fermier = new Fermier();
		
		
		System.out.println(des.lancer());
		
		souris.randomSouris();
		
		fermier.repartitionChat();
		
		
		
		
		
		
	}

}
