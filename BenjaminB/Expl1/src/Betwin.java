import java.util.Scanner;

public class Betwin {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Please enter A : ");
		int input1 = scan1.nextInt();
		
		if (input1 >= 50 && input1 <= 100) {
			System.out.println("A est comprit entre 50 et 100");
		}
		else {
			System.out.println("A n'est pas compris entre 50 et 100");
		}
	}
}
