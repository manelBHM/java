package com.day5;

import java.util.Scanner;

public class Guess {

 

	public static void main(String[] args) throws Exception {
		// Ecrire une application guess qui permet de deviner lq lettre que vous avez en tete
		
/*		char ch,answer = 'K';
		do {
			System.out.println("i have a letter for a  guessing");
			Scanner sc = new Scanner(System.in);
			//read a letter
			
			do {
				ch = sc.nextLine().charAt(0);
			}while(ch=='\n' | ch=='\r');
			
			if(ch==answer)
				System.out.println("right");
			else {
				System.out.println("sorry");
				
				if(ch < answer)
					System.out.println("too low");
				else
					System.out.println("too hight");
			System.out.println("try again");
			}
		
		
		
			
		}while(answer != ch);
		
		
		*/
		
		
		char a ,b='r';
		do {
		
			System.out.println("a letter to guess");
			Scanner scan = new Scanner(System.in);
			
			do {
				a = scan.nextLine().charAt(0);
			}while(a=='\n'| a=='\r');
			if(a==b) {
				System.out.println("right answer");
			}else {
				System.out.println("sooooory boday");
			}
			if(a < b) {
			System.out.println("low");
			}else {
				System.out.println("hight");
			}
				
		System.out.println("sorry try again");
		 
			
			 
			}	while(a != b);
			
			
	
		
		
		
		
		
		


		
	 
	 
			
		}
}












//my soluation


/*Scanner scan = new Scanner(System.in);

char input = scan.nextLine().charAt(0);
 

do {
	System.out.println("devine une lettre :  ");
	
	
	if (input < 'i') 
		System.out.println("tu es avant "); 
	else if (input > 'i')
		System.out.println("tu es apres ");
	else 
		System.out.println("bravo c la boone lettre");
	 
		

 
	 
}while(input >= 'a' && input <= 'z'); 
 
	
 
	
}*/











