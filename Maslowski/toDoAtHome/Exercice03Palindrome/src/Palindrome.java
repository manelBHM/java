import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		String original, inverse = "";
		Scanner mot = new Scanner(System.in);
		
		System.out.print("Rentrez ce que vous voulez, je vous dirais si c'est un palindrome : ");
		original = mot.nextLine();
		original = original.toUpperCase();

		int length = original.length();
		
		for (int i = length - 1; i >= 0; i--) {
			inverse = inverse + original.charAt(i);
		}
			if(original.equals(inverse)) {
			System.out.print(original + " est un palindrome.");
		}
			else {
				System.out.print(original + " n'est pas un palindrome.");
			}
	}
}


