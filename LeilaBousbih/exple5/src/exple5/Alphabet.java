package exple5;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*while
		 *
		char ch = 'A';
		Scanner sc = new Scanner(System.in);
		while (ch < 'Z')
		{
		System.out.println(ch);
		ch++;
	
		}*/
		
		
		
		
		/*while
		 
		Scanner clavier = new Scanner(System.in);
		System.out.println("choisissez un nbre");
		int nbre = clavier.nextInt();
		
		while (nbre < 11) {
			System.out.println(nbre);
		   nbre++;
		}*/
		
		
		
		
		/*do...while
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choisissez une lettre et appuyez sur ENTREE");
		
		char ch = 'q';
	
		do {
		   ch = sc.nextLine().charAt(0);
			
	    if(ch != 'q')
			System.out.println("Réessayez");
			
		}while(ch != 'q');
		
		System.out.println("Vous avez trouver!");
        */
		
	//For	
	double i;
	System.out.println("euro conversion table");
	System.out.println();
	for(i = 1; i < 101; i++)
	{
		
		System.out.println(" euro is equivalent to Lm " +(i*0.5));
		}
	
		
			
}
}

