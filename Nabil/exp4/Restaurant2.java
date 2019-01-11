package exp4;

import java.util.Scanner;

public class Restaurant2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
			
		
		String Menu1 = "1-Menu Poulet . ";
		String Menu2 = "2-Menu Boeuf . ";
		String Menu3 = "3-Menu Végitarien .";
		
		System.out.println("Liste des Menus:");
		System.out.println("---------------");

		System.out.println(Menu1 + Menu2 + Menu3);
		System.out.println("");
		System.out.println("Veuillez entreé le numéro de Menu :");

		int choix = sc.nextInt();
		
	if (choix == 1) {
		
		System.out.println("Vous avez choisir le Menu : Poulet ");

	}
	else if (choix == 2) {
		
		System.out.println("Vous avez choisir le Menu : Boeuf ");

	}
	
	else if (choix == 3) {
		
		System.out.println("Vous avez choisir le Menu : Végetarien ");

	}
	else {
		
		System.out.println("Vous n'avez pas choisi de menu !");

	}

	}

}
