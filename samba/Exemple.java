import java.util.Scanner;

public class Exemple {
	public static void main(String[] arg) {
		/*
		 * int a = 5, b = ;
		 * 
		 * if (a < b) { System.out.println("le resultat est = " + a); } else if
		 * (a > b) { System.out.println(" le resultat est = " + b); } else {
		 * System.out.println("equel"); }
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Saisir un nombre entier :");
		int a = sc.nextInt();

		System.out.println("Saisir un nombre entier :");
		int b = sc.nextInt();

		if (a < b) {
			System.out.println(a + " est plus petit que " + b);
		} else if (a > b) {
			System.out.println(a + " est plus grand que " + b);
		} else {
			System.out.println(" a et b sant egaux");
		}
	}
}
