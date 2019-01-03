import java.util.Scanner;

public class BilletCinema {

	public static void main(String[] args) {
		int age = 0;

		System.out.println("Bonjour bienvenu au cinema de Montreurl. Habitez vous a montreuil ? oui / non :");
		Scanner sc = new Scanner(System.in);
		String habitant = sc.nextLine();

		if (habitant.equals("oui")) {
			System.out.println(" Quel age vous avez ? :");
			age = sc.nextInt();
			if (age <= 3) {
				System.out.println("Les entrée pour les enfant de moins de 3ans est gratuite");
			} else {
				System.out.println("L'entrée pour les residant cout 5 euro !");
			}
		}

		if (habitant.equals("non")) {
			System.out.println(" Quel age vous avez ? :");
			age = sc.nextInt();
			if (age >= 60) {
				System.out.println("L'entrée pour les vieux c'est 4 euro !");
			}
		}

	}
}
