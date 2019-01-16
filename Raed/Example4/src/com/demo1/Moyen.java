package com.demo1;

import java.util.Scanner;

public class Moyen {

	public static void main(String[] args) throws Exception {
		
		
		System.out.println("saisir un nombre entre 0 et 20 s'il vous plai: ");
		Scanner scan =new Scanner(System.in);
		int input = scan.nextInt();
		
		if(true) {
			switch(input) {
			case 0: case 1: case 2: case 3: case 4:case 5: case 6: case 7: case 8: case 9:
				System.out.println("il faut travailler ");
				break;
			case 10: case 11: case 12:
				System.out.println("passable");
				break;
			case 14: case 15:
				System.out.println("bien");
				break;
			case 16: case 17: case 18:case 19:
				System.out.println("tres bien");
				break;
			 case 20:
					System.out.println("TOP");
					break;
			default:
				System.out.println("votre nombre est hors de zone");
				System.out.println("saisir un nombre entre 0 et 20 s'il vous plait de nouveau: "+input);	
				break;
				
			}
			
			
		}else {
			input = input;
		 
		}
		 
 
		
	
		
	}
	

}
		




		
			


/*

System.out.println("saisir un nombre entre 0 et 20 s'il vous plai: ");
Scanner scan =new Scanner(System.in);
int input = scan.nextInt();

boolean shouldBreak = true;
while(input < 20) {
	switch(input) {
	case 0: case 1: case 2: case 3: case 4:case 5: case 6: case 7: case 8: case 9:
		System.out.println("il faut travailler ");
		break;
	case 10: case 11: case 12:
		System.out.println("passable");
		break;
	case 14: case 15:
		System.out.println("bien");
		break;
	case 16: case 17: case 18:case 19:
		System.out.println("tres bien");
		break;
	 case 20:
			System.out.println("TOP");
			break;
	default:
		System.out.println("votre nombre est hors de zone");
		System.out.println("saisir un nombre entre 0 et 20 s'il vous plait de nouveau: "+input);

		break;
	
	}
	if(shouldBreak) {
		break;	
	}

	
	


 


	

	
	}



*/