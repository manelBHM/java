import static java.lang.System.out;

import java.util.Random;
import java.util.Scanner;

public class Commutatuer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int month;
		int numberOfDays = 0;
		boolean isLeapDays;

		out.print("Quel choisissez-vous ? :");
		month = sc.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numberOfDays = 31;
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			numberOfDays = 30;
			break;
		case 2:
			out.print("Est ce que c'est Année bissextile ? (true/false): ");
			isLeapDays = sc.nextBoolean();
			numberOfDays = isLeapDays ? 29 : 28;
		}

		out.print(numberOfDays);
		out.println(" jour ");
	}

}
