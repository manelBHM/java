import java.util.Scanner;

public class BilletCinema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		char hapitant;
		double price = 0.0;
		char coupon = ' ';

		System.out.print("Bonjour bienvenu au cinema de Montreurl. Habitez vous a montreuil ? O/N :");
		hapitant = sc.nextLine().charAt(0);

		if (hapitant == 'O' || hapitant == 'o') {
			System.out.print("Quel age avez vous ? : ");
			age = sc.nextInt();
			if (age <= 3) {
				System.out.println("L'entre est gratuite pour le enfants de moins de 3ans");
			} else if (age >= 12 && age < 65) {
				price = 5.95;
			} else {
				price = 4.95;
			}
		}

		if (hapitant == 'N' || hapitant == 'n') {
			System.out.print("Avez vous une coupon de reduction ? O/N :");
			coupon = sc.nextLine().charAt(0);
			if (coupon == 'N' || coupon == 'n') {
				System.out.print("Quel age avez vous ? : ");
				age = sc.nextInt();
				if (age <= 3) {
					System.out.println("L'entre est gratuite pour le enfants de moins de 3ans");
				} else if (age >= 12 && age < 65) {
					price = 9.95;
				} else {
					price = 7.95;
				}

			} else if (hapitant == 'N' || hapitant == 'n') {
				if (coupon == 'O' || coupon == 'o') {
					System.out.print("Quel age avez vous ? : ");
					age = sc.nextInt();
					if (age <= 3) {
						System.out.println("L'entre est gratuite pour le enfants de moins de 3ans");
					} else if (age >= 12 && age < 65) {
						price = (9.90 - 2);
					} else {
						price = (7.95 - 2);
					}
				}
			}
		}

		System.out.print("Vous devez payez ");
		System.out.println(price + "€");
		System.out.println("Merci, bon spectacle");

	}
}
