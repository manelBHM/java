// takes a user input number and verifies.

import java.util.Scanner;
public class VerifyEntier {

	public static void main(String[] args) {
		
		System.out.println("Enter a number please!!!");
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		if (a <= 100 && a >= 50) {
			System.out.println("Valeur est positif et entre 50 et 100");
		} else if (a >= 0) {
			System.out.println("Valeur est positif");
		} else if (a <= 0) {
			System.out.println("Valeur est négatif");
		} else {
			System.out.println("Valeur est null");
		}
		
		
	}
	
}
		
