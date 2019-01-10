import java.util.Scanner;

public class PositifNegatif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//String str = sc.nextLine();
		int a = sc.nextInt();

		if (a < 0) {
			
			System.out.println("Le nombre est négatif.");
		}

		else {
			System.out.println("Le nombre est Positif");
		}

	}

}
