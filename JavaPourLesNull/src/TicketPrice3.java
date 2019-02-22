import static java.lang.System.out;

import java.util.Scanner;

public class TicketPrice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		double price = 0.0;
		char reply = ' ';

		out.print("Quel est votre age ? :");
		age = sc.nextInt();

		out.print("Avez-vous un bon de reduction ? :");
		reply = sc.findWithinHorizon(".", 0).charAt(0);

		if (age >= 12 && age < 65) {
			price = 9.25;
			if (reply == 'O' || reply == 'o') {
				price -= 2;
			}
		} else {
			price = 5.25;
		}

		out.print(" Vous devez " + price + "€ Bon spectacle ");
	}

}
