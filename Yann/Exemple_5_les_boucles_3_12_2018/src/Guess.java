import java.util.Scanner;
import java.lang.Character;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc =  new Scanner(System.in);
		  System.out.println("i'm thinking of a letter between A and Z");
		
		char ch;
		
		
		
		
		do {
			
			ch = Character.toUpperCase(sc.nextLine().charAt(0));
			
		
			
			 if(ch == '\n'|| ch == '\r' || ch == ' '){System.out.println("Mauvais caractère saisir");}
			
			
			 else if (ch > Character.toUpperCase('l')){System.out.println("La lettre chercher est Avant celle que vous avez saisir : " + ch + '\n' + "Reessayer encore ...");}
			
			 else if (ch < Character.toUpperCase('l')){System.out.println("La lettre chercher est Après celle que vous avez saisir : " + ch + '\n' + "Reessayer encore ...");}
			
			
		}while(ch != Character.toUpperCase('l'));
		System.out.println("GOOD :) !!!");

	}

}