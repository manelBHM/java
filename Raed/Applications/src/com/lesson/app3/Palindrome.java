package com.lesson.app3;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// Il s'agit d'écrire un programme qui, prend une chaîne de caractères et calcule la chaîne inverse 
		//puis indique s'il s'agit ou non d'un palindrome 
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("write a string please :");
		String input1,input2 = "";
		input1= scan.nextLine();
		
		int a = input1.length();
		
		for(int i = a -1;i>=0;i--) {
			input2 += input1.charAt(i);
			
		}
		if(input1.equalsIgnoreCase(input2)) {
			System.out.println("The string is palindrome.");
		}else {
			 System.out.println("The string is not palindrome.");
		}
		
		
		
		
		
		

	}

}
