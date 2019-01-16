import java.util.Scanner;

public class Intervalle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre entier entre 50 est 100 : ");
		int nbre = sc.nextInt();
		
		if ((50 <= nbre) && (nbre <= 100)) {
			
			System.out.println("Le nombre saisi est bien dans l'intervalle demandée ");
	}
		else { 
			
			System.out.println("Le nombre saisi est hors limite");
		}

	}

}
