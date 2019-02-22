
import static java.lang.System.out;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int socks, hankees;

		out.print("Resultats des Hankees et des Socks ? : ");
		socks = sc.nextInt();
		hankees = sc.nextInt();
		out.println();

		if (socks < hankees) {
			out.print("Yellow : ");
			out.println(socks);
			out.print("Blues : ");
			out.println(hankees);

		} else if (hankees > socks) {
			out.println("Blues : ");
			out.print(hankees);
			out.println("Yellow : ");
			out.print(socks);
		} else {
			out.println("Match null");
			out.print("Jaune :");
			out.println(socks);
			out.print("Blues :");
			out.println(hankees);
		}

	}

}
