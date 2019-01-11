import java.util.Scanner;
public class Smaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("Please enter A : ");
		int input1 = scan1.nextInt();
		System.out.println("Please enter B : ");
		int input2 = scan2.nextInt();
		
			if (input1 < input2) {
			System.out.println("A est inférieur a B car A = " + input1 + " et B = " + input2);
			}
			else if (input1 == input2) {
				System.out.println(" A est égale a B");
			}
			else {
				System.out.println("B est inférieur a A car B = " + input2 + " et A = " + input1);
			}
	}

}
