package exemple5;

import java.util.Scanner;

public class LookChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// do {
		
		
		System.out.println("On joue la recherche de la lettre ou elle situe ");
		System.out.println("Tu veux jouer avec Moi :");
		System.out.println("Allez on commence !!! (O/N)  ");
		Scanner clavier = new Scanner (System.in);
		char reponse ;
		reponse = clavier.nextLine().charAt(0);

		reponse ='O';
		
		if (reponse =='O')
		{
			System.out.println("je pense à une lettre : ....entre A et Z  ");
			System.out.println("tu peux le deviner ??? .. on essaye : ");
			
			char lettre;
			System.out.println("Entrez votre lettre ??? ");
			lettre = clavier.nextLine().charAt(0);
			
			
			char vide = ' ';
			// char ligne = " ";
			 
			do {
				
				 if (lettre < 'q')
				    System.out.println("Tu es au dessous de la lettre que je devine !!! ");
				 else if (lettre >'q')  
					 System.out.println("Tu es au dessus de la lettre que je devine !!!! ");
				 else System.out.println("C'est la bonne .. Bravo !!! ");
				
			   
				 break;
				 } while (((lettre >= 'a' && lettre <= 'z') || lettre >'A' && lettre <= 'Z')  );
			
			
		
		}
		
		else System.out.println("Oups !! on joue pas du coup !!! ");
		
		// } while (lettre != 'q');

	}

}
