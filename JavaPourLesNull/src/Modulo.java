import java.util.Scanner;

public class Modulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int parts, dimes, piece, cents;
		int reste, total;

		System.out.print("Combien de centimes avez-vous ? :");
		total = sc.nextInt();

		parts = total / 35;
		reste = total % 35;

		dimes = reste / 15;
		reste = reste % 15;

		piece = reste / 10;
		reste = reste % 10;

		cents = reste;

		System.out.println();
		System.out.println(" Avec " + total + " centime vous avez ");
		System.out.println(parts + " quarters ");
		System.out.println(dimes + " dimes ");
		System.out.println(piece + " nickels ");
		System.out.println(cents + " cents ");

	}

}
