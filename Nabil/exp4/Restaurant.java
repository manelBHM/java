package exp4;

import java.util.Scanner;

public class Restaurant {

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
		System.out.println("Veuillez Choisir votre Menu :");

		//int choix = sc.nextInt();
	
		
		switch (choix) {
		
		case 1:
			System.out.println("Vous avez choisir le Menu : Poulet ");
			break;
			
		case 2:
			
			System.out.println("Vous avez choisir le Menu : Boeuf ");
			break;
			
		case 3:	
			
			System.out.println("Vous avez choisir le Menu : Végetarien ");
			break;
			
			default:
				System.out.print("Vous n'avez pas coisi de Menu !");
		}
		

	}

}
