import java.util.Random;
import java.util.Scanner;

public class Justeprix {

	public static void main(String[] args) {

		Random r = new Random();
		int justeprix = r.nextInt(200);
		int prix =0;
		int essai = 0;
		
		do {
			System.out.println("Entrez un nombre afin de trouver le juste prix !");
			Scanner sc = new Scanner(System.in);
			
			if(justeprix > prix) {
				System.out.println("C'est plus !");
			} else {
				System.out.println("C'est moins !");
			}
			
			prix = sc.nextInt();
			essai++;
		}
		while(justeprix != prix);
		
		System.out.println("BRAVO VOUS AVEZ TROUVEY LE PRIX QUI ETAIT DE : " + justeprix + "\n");
		System.out.println("En " + essai + " essais");
	}

}
