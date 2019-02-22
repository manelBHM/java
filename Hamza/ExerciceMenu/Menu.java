import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		System.out.println("Bienvenue dans notre restaurant. Veuillez choisir votre menu parmi les choix suivants :");
		System.out.println("Pour le menu Poulet, tapez 1.");
		System.out.println("Pour le menu Boeuf, tapez 2.");
		System.out.println("Pour le menu Végétarien, tapez 3.");
		
		int menu = saisie.nextInt();
		
	/*	switch (menu) {
			case 1 :
				System.out.println("Vous avez choisi de prendre le menu Poulet");
					break;
			case 2 :
				System.out.println("Vous avez choisi de prendre le menu Boeuf");
					break;
			case 3 :
				System.out.println("Vous avez choisi de prendre le menu Végétarien");
					break;
			default :
				System.out.println("Nous n'avons pas compris votre choix, vous allez mourir de faim.");
					
		} */
		
		if (menu == 1) {
			System.out.println("Vous avez choisi de prendre le menu Poulet");
		} else if (menu == 2) {
			System.out.println("Vous avez choisi de prendre le menu Boeuf");
		} else if (menu == 3) {
			System.out.println("Vous avez choisi de prendre le menu Végétarien");
		} else {
			System.out.println("Nous n'avons pas compris votre choix, vous allez mourir de faim.");
		}
		

	}

}
