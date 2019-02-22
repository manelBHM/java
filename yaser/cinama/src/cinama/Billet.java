package cinama;

import java.util.Scanner;


public class Billet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input1 = new Scanner(System.in);
		 
		int age=4;
		int residenc=0;
		int a=3;
		int b=4;
		int c=5;
		int d=8;
	
	

	    
	    
	  
	   
		
	    System.out.println( " quel age avez vous ?");
	    age=input1.nextInt();
	    
	    if (age<b) {
			System.out.println(" votr billet est gratuit"  + "\n" );
		}
		else if( age >b && age <=60 ) {
			System.out.println(" habitez vous a Montreuil ? 1 oui / 2 non"  + "\n");
			residenc=input1.nextInt();
		}
		
		else if( age>60 ) {
			System.out.println(" votr billet est " + b + "£" + "\n");
	
		}
	
		
		switch (residenc) {
		
		case 1:
			System.out.println(" votr billet est " + c + "£" + "\n");
		break;
		case 2:
			System.out.println(" votr billet est " + d + "£" + "\n");
			break;
			
			
		}
		
		
		
		
		
		
	}
	

}
