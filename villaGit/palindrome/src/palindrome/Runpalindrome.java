package palindrome;

import java.util.Scanner;

public class Runpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner clavier = new Scanner(System.in);
		char reponse;
		do {

		String reverse = "";
		System.out.println(" Un petit jeu des mots : --------- (Oui O / Non N )?? ");
		reponse = clavier.nextLine().charAt(0);
         
		
		if (reponse == 'O') {
			String original;
			System.out.println(" Entrez votre mot a verifier ? ");
			original = clavier.nextLine();
			
			for (int i = original.length() - 1; i >= 0; i--) {

				reverse = reverse + original.charAt(i); // append() de la classe String 
			}
			if (original.equalsIgnoreCase(reverse)) {
				System.out.println(" le mot est palindrome !! ");
			} else {
				System.out.println(" le mot n'est pas palindrome !! try again ");
			}

		} else
			System.out.println(" merci , une prochaine fois peut etre ---- ");
		
	} while (reponse == 'O');
		
	}

}
