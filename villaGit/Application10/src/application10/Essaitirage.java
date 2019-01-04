package application10;

import java.util.Scanner;

public class Essaitirage {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner clavier = new Scanner(System.in);	
	
	Animal a1 = new Chat();
	Animal a2 = new Oiseau();
	
	System.out.println(" choisir un numero au hazard ");
	int choix = clavier.nextInt();
	
	if ((choix %2 )== 0 )
		a1.devine();
	else 
		a2.devine();
	}

}
