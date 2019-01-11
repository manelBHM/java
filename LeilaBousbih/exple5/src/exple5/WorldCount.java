package exple5;

import java.util.Scanner;

public class WorldCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texte = "bla bla bla\n" + 
		               "tu tu tu\n" + 
		               "la la la";
		
		int car = texte.length();
		System.out.println(car + " lettres");
		System.out.println("il y a " + (texte.split("").length-1)+" mots");
		System.out.println("et " +(texte.split("\n", -1).length  - 1)+ " espaces");
		
		
		

	}



}
