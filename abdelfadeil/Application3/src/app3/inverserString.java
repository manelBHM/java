package app3;

import java.util.Scanner;

public class inverserString {
	
	public static void inverser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ecrivez un mot ");
		String mot = sc.nextLine();
		String mot1 = mot.toUpperCase();
		String sb = new StringBuffer(mot1).reverse().toString();
		String sb1 = new StringBuffer(mot).reverse().toString();
		System.out.println(" L'inverse de "+ mot+" est "+ sb1);
		if(mot1.equals(sb)) {
			System.out.println( mot +" est un palindrome");
		}else {
			System.out.println( mot +" n'est pas  un palindrome");
		}

	}
	
	
	public static void main(String[] args) {
		System.out.println("Exemple 1");
		inverser();
		
		System.out.println("Exemple 2");
		inverser();
		
		
	}

}
