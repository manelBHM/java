package co.hamza.TomEtJerry.fermier;

import java.util.Random;

import co.hamza.TomEtJerry.animaux.Chat;

public class Fermier {

	private Chat Nemo = new Chat("Nemo", 5);
	private Chat Garfield = new Chat("Garfield", 1);
	private Chat Fripouille = new Chat("Fripouille", 15);
	private Chat Princesse = new Chat("Princesse", 2);
	private Chat Mimine = new Chat("Nemo", 7);
	private char desFaces[] = { 'A', 'B', 'C', 'D' };
	private Chat chat[] = { Nemo, Garfield, Fripouille, Princesse, Mimine };

	public Fermier() {
		// TODO Auto-generated constructor stub
	}

	public char lancerDes() {
		Random hasard = new Random();
		int i = hasard.nextInt(desFaces.length);
		return desFaces[i];
	}
	
//	public char lancerChat() {
//		Random hasard = new Random();
//		int i = hasard.nextInt(chat.length);
//		return chat[i].;
//	}

	public void repartitionChat() {
		lancerDes();
		Random hasard = new Random();
		
		for (int i = 0; i < chat.length; i++) {
			
		
		i = hasard.nextInt(this.chat.length);
		System.out.println("Le chat " + chat[i].getNom() + " sera dans la zone " + lancerDes());

	//	return this.chat[i];
		}
	}

}
