import static java.lang.System.out;

import java.util.Scanner;

public class TicketPrice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		double price = 0.0;
		char reply;

		out.print("Quel age avez vous ? :");
		age = sc.nextInt();

		out.print("Avez-vous un bon de reduction ? O/N:");
		reply = sc.findWithinHorizon(".", 0).charAt(0);

		if (age >= 12 && age < 65) {
			price = 9.90;
		} else if (age < 12 || age >= 65) {
			price = 5.90;
		}

		if (reply == 'o' || reply == 'O') {
			price -= 2;
		}

		if (reply != 'O' || reply != 'o' && reply != 'N' || reply != 'n') {
			out.println(" Desole pas compris");
		}

		out.print("Vous devez : " + price + "€ " + "Bon spectacle ");

	}
}
