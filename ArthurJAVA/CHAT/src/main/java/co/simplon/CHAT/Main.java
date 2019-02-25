package co.simplon.CHAT;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		ArrayList<Souris> listeSouris = new ArrayList<Souris>();
		ArrayList<Chat> listeChat = new ArrayList<Chat>();
		int tour = 1;

		Chat nemo = new Chat("Nemo", 5);
		Chat garfield = new Chat("Garfield", 1);
		Chat fripouille = new Chat("Fripouille", 15);
		Chat princesse = new Chat("Princesse", 2);
		Chat mimine = new Chat("Mimine", 7);

		for (int i = 0; i < 1500; i++) {
			listeSouris.add(new Souris(true));
		}
		
		listeChat.add(mimine);
		listeChat.add(princesse);
		listeChat.add(fripouille);
		listeChat.add(garfield);
		listeChat.add(nemo);
		
		Random r = new Random();
		
		int a = r.nextInt(listeSouris.size());
		int b = r.nextInt(listeSouris.size() - a);
		int c = r.nextInt(listeSouris.size() - (a+b));
		int d = listeSouris.size() - (a+b+c);
		
		do {
			System.out.println("Tour : " + tour++);
			
			
		}while(listeSouris.size()>=0);
	

	}

}
