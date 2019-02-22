import static java.lang.System.out;

import java.util.Scanner;

public class Score2 {

	enum quiGagne {
		domicile, visiteur, Null
	};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int paris, marseille;
		quiGagne qui;

		out.print("Resultat du PSG est LOM ? :");
		paris = sc.nextInt();
		marseille = sc.nextInt();
		out.println();

		if (paris > marseille) {
			qui = quiGagne.domicile;
			out.println("Victoire appartient au PSG ;-) !");
		} else if (marseille > paris) {
			qui = quiGagne.visiteur;
			out.println("Victoire appartient a LOM ;-) !");
		} else {
			qui = quiGagne.Null;
			out.println("Match null pour le deux equipes");
		}
		out.print("");

		if (qui == quiGagne.domicile) {
			out.println("Victoire bien meritée !");
		} else if (qui == quiGagne.visiteur) {
			out.print("Belle victoire, mais l'abitre a volé un penalty !");
		} else if (qui == quiGagne.Null) {
			out.print("Tres jolie match null !");
		}
	}
}