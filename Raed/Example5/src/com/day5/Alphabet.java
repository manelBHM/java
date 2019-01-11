package com.day5;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// Ecrire une application qui permet d'afficher, en se basant de boucle while, toutes les lettres de l'alphabet
		
		
		boolean t = true;
        char c;
        char letter = 'a';
        Scanner scan = new Scanner(System.in);
        char reponse;
        reponse = scan.nextLine().charAt(0);
        
        
        while(reponse <= 'z' ) {
 
    		      
    	      	  System.out.print("hello : "+reponse);
    	      	  
    	      	  c++;
    	      	 
    		}
   
      	if(t) break;
        
        }

    
		
 
        
        
        
	}




/*"
for(c = 'A'; c <= 'Z'; ++c)
    System.out.print(c + " ");


*/

 