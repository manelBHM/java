import java.util.Random;
import java.util.Scanner;

public class TestRandom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int randNumber;

		randNumber = random.nextInt(10) + 1;

		do {
			System.out.println("Rentrez un chiffre au hasard :");
			randNumber = sc.nextInt();
			if (randNumber != 10) {
				System.out.println("You loose, try again");
			} else {
				System.out.println("Congradulation :)");
			}
		} while (randNumber != 10);

	}
}
