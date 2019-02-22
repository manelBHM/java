package com.day5;

public class Puissance {

	public static void main(String[] args) {
		// Ecrire une application Power qui retour la puissance 2 des valeurs entre 0 et 10
		
/*		
		//ma solution
		int c =0;
		for(int i =1;i<10;i++) {
			System.out.println("la valure de "+i+" est : "+Math.round(Math.pow(i, 2)));
		}
		
		
		*/
		
		
		
		//la solution de prof

		int e;
		int result;
		for(int i=0;i<10;i++) {
			result =1;
			e = i;
			while(e>0) {
				result = result*2;
				e--;
			}
			System.out.println("2 to power of "+i+"is "+result);
		}
	
		 
		
		
		

		

	}

}












