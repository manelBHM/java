import static java.lang.System.out;

import java.util.Random;

public class JeuDeCart {

	public static void main(String[] args) {
		Random random = new Random();
		int carte, total = 0;

		out.println("Catre  Total");
		while (total < 21) {
			carte = random.nextInt(9) + 1;
			total += carte;

			out.print(" " + carte);
			out.print("      ");
			out.println(" " + total);
		}
		if (total == 21) {
			out.print(" Vous avez gagnez :-)");
		} else {
			out.print(" Vous avez perdu :-( ");
		}
	}
}
