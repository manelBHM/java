import java.util.Scanner;

public class nombrePositif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre entier : ");
		int nbre = sc.nextInt();
		
		if (nbre > 0) {
			System.out.println("Le nombre saisi est un entier positif.");
		} else if (nbre < 0) {
			System.out.println("Le nombre saisi est un entier négatif.");
		} else {
			System.out.println("Vous avez saisi le nombre 0.");
		}
		

	}

}
