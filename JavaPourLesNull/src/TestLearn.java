import java.util.Scanner;

public class TestLearn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		double price = 0;
		char reply;

		System.out.print("quel age vous avez ? : ");
		age = sc.nextInt();

		System.out.println("avez  vous un bon ? (O/N) : ");
		reply = sc.findWithinHorizon(".", 0).charAt(0);

		if (age >= 12 && age < 65) {
			price = 9.25;
			if (reply == 'O' || reply == 'o') {
				price -= 2;
			}
		} else {
			price = 5.25;
		}

		System.out.println("Ca vous fera " + price + "€" + " Merci bon spectacle");
	}
}
