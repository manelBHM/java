package cinama;

import java.util.Scanner;

public class CB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println(" quel age avez vous ?");
		int ageUtilisateur = sc.nextInt();
		
		System.out.println(" habitez vous a Montreuil ? 1 oui / 2 non"  + "\n");
		int residenceUtilisateur = sc.nextInt();
		
		if (ageUtilisateur <=3 ) {
			System.out.println(" votr billet est gratuit" );
		}
	
		else if (ageUtilisateur > 3 && ageUtilisateur <=60 && residenceUtilisateur == 1 ) {
			System.out.println(" votr billet est 5£" );
		}
		else if (ageUtilisateur > 3 && ageUtilisateur <=60 && residenceUtilisateur == 2 ) {
			System.out.println(" votr billet est 8£"  );
		}
		else if (ageUtilisateur > 60){
			System.out.println(" votr billet est 4£" );
		}
		
	}

}
