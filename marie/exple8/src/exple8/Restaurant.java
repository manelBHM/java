package exple8;
import java.util.Scanner;

public class Restaurant {
	public static void main(String[] args) {
		int nbMenu;
	do {
		System.out.println("Choix menu");
		System.out.println("1 - Poulet");
		System.out.println("2 - Boeuf");
		System.out.println("3 - Vegetarien");
		System.out.println("que souhaitez-vouc comme menu?");
		Scanner sc = new Scanner(System.in);

		
	do {
		nbMenu = sc.nextLine().charAt(0);
		
	}while(nbMenu == '\n');
	
		if(nbMenu == 1)	 {
			System.out.println("vous avez choisi comme menu: poulet!");
			System.out.println("Choix accompagnement");
			System.out.println("4 - Legumes frais");
			System.out.println("5 - Frites");
			System.out.println("6 - Riz");
		}
		
		else if(nbMenu == 2) {
			System.out.println("vous avez choisi comme menu: Boeuf!");
			System.out.println("Choix accompagnement");
			System.out.println("4 - Legumes frais");
			System.out.println("5 - Frites");
			System.out.println("6 - Riz");
	}
		else if(nbMenu == 3) {
			System.out.println("vous avez choisi comme menu: Vegetarien!");
			System.out.println("voulez vous en plus un peu de riz");
		}
		
		else {
			System.out.println("vous n'avez pas choisi de menu parmi les choix proposés");
	}
		
		
		
			if(nbMenu == 4)	{
				System.out.println("vous avez choisi comme accompagnement: Legumes frais!");
				System.out.println("Choix boisson");
				System.out.println("7 - Eau plate");
				System.out.println("8 - Eau gazeuse");
				System.out.println("9 - Soda");
			}
				
			else if(nbMenu == 5) {
				System.out.println("vous avez choisi comme accompagnement: Frites!");
				System.out.println("Choix boisson");
				System.out.println("7 - Eau plate");
				System.out.println("8 - Eau gazeuse");
				System.out.println("9 - Soda");
			}
			
			else if(nbMenu == 6) {
				System.out.println("vous avez choisi comme accompagnement: Riz!");
				System.out.println("Choix boisson");
				System.out.println("7 - Eau plate");
				System.out.println("8 - Eau gazeuse");
				System.out.println("9 - Soda");
			}
			
			if(nbMenu == 7) {
				System.out.println("vous avez choisi comme boisson: Eau plate");
			}
			if(nbMenu == 8) {
				System.out.println("vous avez choisi comme boisson: Eau gazeuse");
			}
			if(nbMenu == 9) {
				System.out.println("vous avez choisi comme boisson: Soda");
			}
			
			
			if(nbMenu == 2) {
				System.out.println("vous avez choisi comme menu: Boeuf!");
				System.out.println("Choix accompagnement");
				System.out.println("4 - Legumes frais");
				System.out.println("5 - Frites");
				System.out.println("6 - Riz");
		}
			if(nbMenu == 4)	{
				System.out.println("vous avez choisi comme accompagnement: Legumes frais!");
			}
				
			else if(nbMenu == 5) {
				System.out.println("vous avez choisi comme accompagnement: Frites!");
			}
			
			else if(nbMenu == 6) {
				System.out.println("vous avez choisi comme accompagnement: Riz!");
			}
			
			if(nbMenu == 3) {
				System.out.println("vous avez choisi comme menu: Vegetarien!");
				System.out.println("voulez vous en plus un peu de riz");
			}
			
			if(nbMenu == 6) {
				System.out.println("vous avez choisi comme accompagnement: Riz!");
			}

			else {
				System.out.println("vous n'avez pas choisi de menu parmi les choix proposés");
		}
}while(nbMenu != 0);
}}	
