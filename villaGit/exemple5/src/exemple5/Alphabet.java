package exemple5;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("vous voulez savoir les alphabets? (O/N)");
		Scanner clavier = new Scanner(System.in);
		
		char reponse ;
		reponse = clavier.nextLine().charAt(0);
		char lettre ='a';
		char lettreMaj ='A';
		
		 
		 
		
		while (lettre <= 'z' || lettreMaj <= 'Z')
			
		{
			 System.out.print(" "+ lettre+"\n" + lettreMaj);
			
			 lettre ++;
			 lettreMaj++;
			 
			
		}
		
	}

}
