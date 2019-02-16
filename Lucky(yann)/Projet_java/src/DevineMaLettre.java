import java.util.Scanner;

public class DevineMaLettre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	    Scanner carac =  new Scanner(System.in);
		
		char tableau[]= {'a', 'e', 'i', 'o', 'u', 'y'};
		
		
		System.out.println("Rentrez une lettre en miniscule, SVP");
		
		char answer;
		int i, x;
		
			
	do {
			answer= carac.nextLine().charAt(0);
		
			
			
				for(i=0; i<tableau.length; i++) 
				 {
					 if(answer==tableau[i])
					 {System.out.println("La lettre " + answer + " se trouve bien dans le tableau a l'indice " + (i+1));
					
					}
					
					 
				 }
				
	
	}while(answer!='N');
	
	  	 		
	}

}
