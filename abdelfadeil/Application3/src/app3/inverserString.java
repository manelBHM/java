package app3;

import java.util.Scanner;

public class inverserString {
	
	public static void inverser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ecrivez un mot ");
		String mot = sc.nextLine();
		StringBuffer sb = new StringBuffer(mot).reverse();
		
		System.out.println(" L'inverse de "+ mot+" est "+ sb);
		if(mot.contentEquals(sb)) {
			System.out.println( mot +" est un palindome");
		}else {
			System.out.println( mot +" n'est pas  un palindome");
		}

	}
	
	
	public static void main(String[] args) {
		System.out.println("Exemple 1");
		inverser();
		
		System.out.println("Exemple 2");
		inverser();
		
		
	}

}
