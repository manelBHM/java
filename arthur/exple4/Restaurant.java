package exple4;

import java.util.Scanner;

public class Restaurant {
	
	public static void main(String[] args) {
		public void displayAvailableMenu() {
		
		System.out.println("Bienvue au restaurant Royal Food");
		System.out.println("Nous vous proposons 3 menus");
		System.out.println("Pour le menu Poulet entrez : 1");
		System.out.println("Pour le menu Boeuf entrez  : 2");
        System.out.println("Pour le menu végétarien entrez : 3");
		}
        
Scanner sc = new Scanner(System.in);
		
		int menu = sc.nextInt();
		
		
		switch (menu) {
		
		case 1 : System.out.println("Vous avez choisi le menu Poulet");
		break;
		
		case 2 : System.out.println(" Vous avez choisi le menu boeuf");
		break;
		
		case 3 : System.out.println(" Vous avez choisi le menu végétarien");
		break;
		
		default : System.out.println("ERREUR SERVEUR ABORT");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
