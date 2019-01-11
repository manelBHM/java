package exemple5;

import java.io.IOException;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
System.out.println("Je pense à une lettre entre A et Z... Peux-tu la deviner ?");
Scanner clavier= new Scanner(System.in);
		
		
		char reponse = 'T';
		do {
			reponse = clavier.nextLine().charAt(0);
	
			 if (reponse != 'T' && reponse < 'T'){
				 System.out.println("Raté ! Ma réponse est après");
				 System.out.println("Retente ta chance !!");

			  }
			 else if (reponse != 'T' && reponse > 'T') {
				 System.out.println("Raté ! Ma réponse est avant");
				 System.out.println("Retente ta chance !!");
		  
			 }
				 else 
			  System.out.println("Bonne réponse champion");
		  }
		
		while(reponse != 'T');
		
		
			} 
				
			
	 
	}

		
		  
			  
		
		
	

		 
		
		
		

	


