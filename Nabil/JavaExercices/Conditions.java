import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//String str = sc.nextLine();
		int a = sc.nextInt();
		int b = sc.nextInt();

		
		
		if (a < b) {
			
			System.out.print(a + " Donc 'a' est inferieur");
		}
		
		else if (a > b) {
			System.out.println(b + " Donc 'b' est inferieur");
		}
		
		else {
			
			System.out.println("Aucun resultat disponible");
		}

	}

}
