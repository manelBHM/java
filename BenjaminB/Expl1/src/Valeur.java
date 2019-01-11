import java.util.Scanner;

public class Valeur {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Please enter A : ");
		int input1 = scan1.nextInt();		
		
		if (input1 < 0) {
			System.out.println("A est Négatif");
		}
			else if (input1 == 0) {
				System.out.println("A est nul");
			}
			else {
				System.out.print("A est positif");
			}
	}
}
