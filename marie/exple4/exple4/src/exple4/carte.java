package exple4;

import java.util.Scanner;

public class carte {
public static void main(String[] arg) {
		
	System.out.println("Choix menu");
	System.out.println("1 - poulet");
	System.out.println("2 - boeuf");
	System.out.println("3 - vegetarien");
	System.out.println("que souhaitez-vouc comme menu?");
	}

		Scanner sc = new Scanner(System.in);
		int nbMenu = sc.nextInt();
		
		
		
switch (nbMenu) {			
case 1:
	System.out.println("vous avez choisi comme menu: poulet!");
    break;
			
case 2:
	System.out.println("vous avez choisi comme menu: boeuf!");
	break;

case 3:
	System.out.println("vous avez choisi comme menu: vegetarien!");
	break;

default:
	System.out.println("vous n'avez pas choisi de menu parmi les choix proposés");
	break;	
}
}

