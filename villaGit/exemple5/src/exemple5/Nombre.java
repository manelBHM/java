package exemple5;

import java.util.Scanner;

public class Nombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner clavier = new Scanner (System.in);
		
		System.out.println("Entrez votre nombre inferieur a 10" );
		
		int nbre = clavier.nextInt();
		boolean valide = true;
		if ( valide == true )
			
		{
			System.out.println("le reste pour atteindre 10 est : ");
		while (nbre <= 10)
		{
			int reste ;
			reste = nbre++;
			
			System.out.println( reste );
			// nbre ++;
			
			
		}
		
	}
		else
			System.out.println("votre nombre est au dela de 10 !! ");
	}

}
