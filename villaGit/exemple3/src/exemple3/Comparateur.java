package exemple3;

import java.util.Scanner;

public class Comparateur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner clavier = new Scanner(System.in);
		
		
		int a, b ;
		
		System.out.println("Entrez votre valeur a : ");
		a = clavier.nextInt();
		
		System.out.println("Entrez votre valeur b :");
		b = clavier.nextInt();
		
		
		
		if (a<b)
			System.out.println( "le plus petit est a " + a);
		else
			System.out.println("le plus petit est b "+b);
		
		
		// valeur positif ou negatif ou nul 
		
		System.out.println("\n");
		int c ;
		System.out.println("Entrez la nouvelle valeur ");
		c = clavier.nextInt();
		
		if (c == 0)
			System.out.println("votre valeur est nulle ");
		    
		else if ( c> 0)
			System.out.println("votre valeur est positive");
		    
		else
			System.out.println("votre valeur est negative ");
		
		
		
		// nombre est dans une intervalle
		
		System.out.println("\n");
		int d ;
		System.out.println("Entrez la nouvelle valeur ");
		d = clavier.nextInt();
		
		if (d>=50 && d <= 100)
			System.out.println(" votre valeur est bien dans l'intervalle [50,100] ");
		else
			System.out.println("Votre valeur est desormaois n'appartient pas a l'intervalle [50, 100]");
			
			
		
	}

}
