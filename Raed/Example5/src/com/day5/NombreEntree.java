package com.day5;

import java.util.Scanner;

public class NombreEntree {

	public static void main(String[] args) {
		//  Ecrire une application qui permet d'afficher des nombres entrée par l'utiliser tant qu'ils sont inférieurs à 10
		
		Scanner scan = new Scanner(System.in);
		System.out.println("entrez un nombre entre 0 et 10");
		
		
		int input = scan.nextInt();
		

		System.out.println("le reste :");
		
		while(input <  11) {
			
			int reste;
			reste = input ++;
			System.out.println(reste);	
		}
		
		
 
		
		
		
					
	}
}
