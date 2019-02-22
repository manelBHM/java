package exple5;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		char ch, answer = 'k';
		
		do {
			System.out.println("je pense que la lettre est entre a et z");
			System.out.println("entrer une lettre");
			Scanner sc = new Scanner(System.in);
				
		do {
			ch = sc.nextLine().charAt(0);
		}while(ch == '\n');
			
		if(ch==answer)
			System.out.println("bien");
		else {
			System.out.println("désoler ce n'est pas cette letrre");
			if(ch<answer)
				System.out.println("plus loin");
			else System.out.println("avant");
			System.out.println("esseille encore!\n");
			
		}
		
		}while(answer != ch);
	
	}
}
