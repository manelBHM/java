package segment;

import java.util.Scanner;

public class Run {
	

	public static int tailleSegment (int teteSegment , int piedSegment) {
		int taille=0 ; 
		int position ;
		 
		if ((teteSegment>=0 && piedSegment>=0 && teteSegment>=piedSegment)|| (teteSegment <=0 && piedSegment <=0 && teteSegment>=piedSegment)) {
			System.out.println("Votre segement est : [" + piedSegment + "," + teteSegment + "] ");
			taille = teteSegment - piedSegment ; 
			 position = 1;
			
		}
		if ((teteSegment>=0 && piedSegment>=0 && teteSegment<= piedSegment)|| (teteSegment <=0 && piedSegment <=0 && teteSegment<=piedSegment)) {
			System.out.println("Votre segement est : [" + teteSegment + "," + piedSegment + "] ");
			taille = piedSegment - teteSegment ;
			position = 2;
		}
		
		if( teteSegment>=0 && piedSegment <0 ) {
			System.out.println("Votre segement est : [" + piedSegment + "," + teteSegment + "] ");
			taille = teteSegment + ( piedSegment * -1);
			position = 3;
		}	
		if (teteSegment<=0 && piedSegment >0 ){
			System.out.println("Votre segement est : [" + teteSegment + "," + piedSegment + "] ");
			taille = piedSegment + ( teteSegment * -1);
			position = 4;
		}
		return taille;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Trouver le point est dans le segment ");
		System.out.println(" Veux tu essayer avec nous : ( OUI o / Non N ) ");

		Scanner clavier = new Scanner(System.in);
		char reponse = clavier.nextLine().charAt(0);

		if (reponse == 'O')
			
		{
			System.out.println(" Definir les extremités du segment : ");
			System.out.println(" Entrer la premiere extremité du segment : ");
			int teteSegment = clavier.nextInt();
			System.out.println(" Entrer la deuxieme extremité du segment : ");
			int piedSegment = clavier.nextInt();
			
			// traitement point !! 	
			System.out.println("" + tailleSegment(teteSegment, piedSegment) );
			
			System.out.println(" entre l'abcisse du point ");
			int point = clavier.nextInt();
			
			System.out.println( seSitue( point, teteSegment, piedSegment));
			
		}

		
		else
			System.out.println(" Peut etre une prochaine fois !! ");
	}


	private static String seSitue(int point, int teteSegment, int piedSegment ) {
		// TODO Auto-generated method stub
		String reponse ="";
		if (( point >= teteSegment && point <= piedSegment    )    ){
			return reponse = " le point est sur le segment ";
		}
		else return reponse= "le point n'appartient pas au segment " ;
		 
	}// on peut  changer par la methode toString heritée de la classe objet !!  overRride
	
	
	
	

}
