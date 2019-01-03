package exemple5;

import java.util.Scanner;

public class Monaie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Bonjour , c'est notre convertisseur :");
		System.out.println("Vous voulez l'essayer ? (O/N");
		System.out.println(" c'est a vous : Allez GOOOO !!!! ...");
		
		Scanner clavier = new Scanner (System.in);
		char reponse = clavier.nextLine().charAt(0);
		
		double euros =0.0 ;
		double malte =0.0;
		
		
		if (reponse =='O')
		{
			
			  
			System.out.println(" Vous echangez de Euros vers Malte ou Malte vers Euros?");
			System.out.println(" 1 - Euros vers Malte .");
			System.out.println("2- Malte vers Euros.");
			 
			
			 char choix = clavier.nextLine().charAt(0);
			 if (choix =='1') {
			  
			 for (int i=1 ; i<= 10; i++)
				
			{     
				 
				 System.out.println( i+" Malte = "+i * 0.5+ " euros");
				
				 
			}
			 
		
			 } else {
			 
				 for ( int i=1 ; i<= 10 ; i++)
				
			{   malte = i;
				euros = malte *  2;
				
				System.out.println( malte+" Euros = "+malte *2 + " malte");
				malte = malte +1;
				
				
				
			
			
			}}
			
	
	
		}else 
			System.out.println("Vous ne voulez pas  essayer notre convertisseur !!! oups ... ");

		}
}
