package com.demo11;

import java.util.Random;

public class RandomLetter {

	public static void main(String[] args) {
		
	
		Random rand = new Random();
		String character = "abcdefghijklmnopqrstuvwxyz";
		String randomString = "";
		//int lenght = 5;  //length of letters that we want to predict 
		
		//let's a range of random numbers without fixing the length
		int lenght = rand.nextInt(15);
		char[] ch = new char[lenght];
			
		for(int i=0;i<lenght;i++) {
			ch[i] = character.charAt(rand.nextInt(character.length()));
		}
		for(int i =0;i<ch.length;i++) {
			randomString+=ch[i];
		}
		
		System.out.println(randomString);
		
		
		
	 
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
