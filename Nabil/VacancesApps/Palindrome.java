package Application_Vacances;

import java.util.Scanner;

public class Palindrome {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrez un mot :");
		String mot = sc.next();
        String inverse = (new StringBuffer(mot)).reverse().toString();

		System.out.println("L'invers de " + mot + " est " + inverse);

		
		
		if ( mot.equals(inverse)) {
			System.out.println(mot + " est un palindrome ");
			
			}
		else {
			
			System.out.println(mot + " n'est pas un palindrome ");

		}
	}

	

}
