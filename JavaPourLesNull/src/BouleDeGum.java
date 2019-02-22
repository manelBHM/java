import java.util.Scanner;

public class BouleDeGum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kids;
		int gumballs;
		int gumballPerKids;

		System.out.print("Combient de boule de gum ? combien d'enfant ? : ");
		gumballs = sc.nextInt();
		kids = sc.nextInt();

		gumballPerKids = gumballs / kids;

		System.out.print(" Chaque enfant recoit ");
		System.out.print(gumballPerKids);
		System.out.print(" Boule de gum ");

	}

}