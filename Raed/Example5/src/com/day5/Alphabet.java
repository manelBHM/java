package com.day5;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// Ecrire une application qui permet d'afficher, en se basant de boucle while, toutes les lettres de l'alphabet
		
 
        //char letter = 'a';
        Scanner scan = new Scanner(System.in);
        char reponse;

        reponse = scan.nextLine().charAt(0);
        while(reponse< 'z') {

        	reponse++;
            System.out.print(" "+reponse);
        	
        }
    
		
		
		
        
		
		
		
		
		
		
        
/*		for (int i = 0; i < 26; i++)
		{
		    //char upper = (char) ('A' + i);
		    //char lower = (char) ('a' + i);
 
		    System.out.println((char) ('A' + i)+" "+(char) ('a' + i));
		}
     */
        
        
     /*   
        for (int i = 65; i <= 90; i++) {
            System.out.print(" "+(char)i);
        }
        
        */
        
		
	/*	
		for(int i = 0; i < 26; i++)
		{
		    System.out.println((char)('A' + i) + ":" + ('A' + i) + " : " + (char)('a' + i) + ":" + ('z' + i));
		}
		*/
		
		
		
        }
	}




/*"
for(c = 'A'; c <= 'Z'; ++c)
    System.out.print(c + " ");


*/

 