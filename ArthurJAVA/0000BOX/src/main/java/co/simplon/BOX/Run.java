package co.simplon.BOX;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {

	public void run() {
		Scanner sc = new Scanner(System.in);
		boolean rester = true;
		System.out.println("Hello");
		System.out.println("Identifiez vous, quel est votre nom ? :");
		String nom = sc.nextLine();
		ArrayList<Box> listeBox = new ArrayList<Box>();
		Personne personne = new Personne(nom, listeBox);
		
		do {
			
			System.out.println("Afficher mes boites : 1 // Créer une boite : 2");
			int choix = sc.nextInt();
			switch(choix) {
			case 1 : 
			}
			
			
		}while(rester);
		
	}
	
	
	public void afficherBoite() {
		
	         
	}
	
}
