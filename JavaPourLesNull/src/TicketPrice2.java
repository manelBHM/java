import static java.lang.System.out;

import java.util.Scanner;

public class TicketPrice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		double price = 0.0;
		char reply = ' ';
		boolean kids, senior, hasCoupon, hasNoCoupon;

		out.print("quel age avez-vous ? :");
		age = sc.nextInt();

		out.print("Avez-vous un coupon de redution ? O/N : ");
		reply = sc.findWithinHorizon(".", 0).charAt(0);

		kids = age >= 12;
		senior = age < 65;
		hasCoupon = reply == 'O' || reply == 'o';
		hasNoCoupon = reply == 'N' || reply == 'n';

		if (kids && senior) {
			price = 9.90;
		} else if (!kids && !senior) {
			price = 5.90;
		}

		if (hasCoupon) {
			price -= 2;
		}
		if (!hasCoupon && !hasNoCoupon) {
			out.print("Desole vous avez pas de reduction ");
		}

		out.print("Vous devez " + price + "€ " + " Bon spectacle");

	}
}
