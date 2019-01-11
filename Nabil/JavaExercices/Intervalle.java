import java.util.Scanner;

public class Intervalle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//String str = sc.nextLine();
		int a = sc.nextInt();
		
		if (a < 100 && a > 50) {
			
			System.out.println("Le nombre est dans l'intervalle");
		}
		else {
			
			System.out.println("Le nombre n'est pas dans l'intervalle !!");
		}

	}

}
