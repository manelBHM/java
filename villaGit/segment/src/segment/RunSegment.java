package segment;

import java.util.Scanner;

public class RunSegment {
	
	public static int tailleSegment (int tete , int pied) {
		int taille=0 ; 
		int position ;
		 
		if ((tete>=0 && pied>=0 && tete>=pied)|| (tete <=0 && pied <=0 && tete>=pied)) {
			System.out.println("Votre segement est : [" + pied + "," + tete + "] ");
			taille = tete - pied ; 
			 position = 1;
			
		}
		if ((tete>=0 && pied>=0 && tete<= pied)|| (tete <=0 && pied <=0 && tete<=pied)) {
			System.out.println("Votre segement est : [" + tete + "," + pied + "] ");
			taille = pied - tete ;
			position = 2;
		}
		
		if( tete>=0 && pied <0 ) {
			System.out.println("Votre segement est : [" + pied + "," + tete + "] ");
			taille = tete + ( pied * -1);
			position = 3;
		}	
		if (tete<=0 && pied >0 ){
			System.out.println("Votre segement est : [" + tete + "," + pied + "] ");
			taille = pied + ( tete * -1);
			position = 4;
		}
		return taille;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		System.out.println(" Trouver le point est dans le segment ");
		System.out.println(" Veux tu essayer avec nous : ( OUI o / Non N ) ");

		Scanner clavier = new Scanner(System.in);
		char reponse = clavier.nextLine().charAt(0);

		if (reponse == 'O') {
			
			System.out.println(" Entrez en premier les extrimités et ensuite le point a tester ");
			int tete = clavier.nextInt();
			int pied = clavier.nextInt();
			int point = clavier.nextInt();
			
			
			System.out.println(tete + "  " + pied+ "  "+point );
			System.out.println("taille du segment : " + tailleSegment( tete ,  pied));
			
			if ( point >= tete || point <= pied) {
				System.out.println("le point est sur le segment ");
				
			} else System.out.println("le point n'est pas sur le segment ");
		
		
		} else
			System.out.println(" Peut etre une prochaine fois !! ");

	}

}
