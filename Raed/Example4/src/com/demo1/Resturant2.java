package com.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Resturant2 {

	public static void main(String[] args) {
		// dans switch
		
		
		List<String> menu1 = new ArrayList<String>();
		menu1.add("Poulet");
		menu1.add("Boeuf");
		menu1.add("Vegetarian");


		Scanner scan1 = new Scanner(System.in);
		System.out.println("Bonjour, Qu'est ce que vous voudraiez demander s'il vous plait :"); 
		System.out.println("Voici le menu qui contient de ^Poulet  Boeuf  et Vegetarian^ :");
		String input1 = scan1.nextLine();
		
		switch(input1) {
		case "Poulet":
			System.out.println("vous avez choisi Poulet :) ");
			break;
		case "Boeuf":
			System.out.println("vous avez choisi Vegetarian :) ");
			break;
		case "Vegetarian":
			System.out.println("vous avez choisi Vegetarian :) ");
			break;
		default:
			System.out.println(" Maheuresement votre choix n'est pas dans le menu (: ");
			break;
		}
		
		

	}

}
