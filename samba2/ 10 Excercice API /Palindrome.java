import static java.lang.System.out;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Palindrome {

	public static String reverse(String inputUser) {
		// le quote et pattern : retourne le model de la chaine
		// litteral specifier en string
		String[] words = inputUser.split(Pattern.quote(""));
		String inputWords = "";

		// parcourir le chaque lettre du mot et le stocker dans inputWords
		for (int i = words.length - 1; i >= 0; i--) {
			inputWords += words[i];
		}
		return inputWords;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		out.print("Saisissez un mot : ");
		String inputUser = sc.nextLine();

		// La methode, retourne la saisie inverse de chaque lettre
		String outputUser = reverse(inputUser);

		if (inputUser.equals(outputUser)) {
			out.println(outputUser + ": Est un Palindrome. ");
		} else {
			out.println(outputUser + ": Est pas un Palindrome. ");
		}
	}
}
