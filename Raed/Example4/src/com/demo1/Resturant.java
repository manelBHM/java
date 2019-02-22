package com.demo1;

 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Resturant {

	public static void main(String[] args) {
		//proposer une carte de Resturant à un client et afficher son choix 
		
		//menu = ["Poulet","Boeuf","Vegetarian"]
		List<String> menu = new ArrayList<String>();
		
		//sans la contenu de list ca march aussi
	/*	menu.add("Poulet");
		menu.add("Boeuf");
		menu.add("Vegetarian");
*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Bonjour, Qu'est ce que vous voudraiez demander s'il vous plait ?");
	 
		System.out.println("Voici le menu qui contient de ^Poulet  Boeuf  et Vegetarian^ :");
		String input = scan.nextLine();
		
		int count =+1;
		if(input.equals("Poulet") ) {
			System.out.println("vous avez choisi Poulet :) ");
			
		}else if(input.equals("Boeuf")) {
			System.out.println("vous avez choisi Boeuf :) ");
		}else if(input.equals("Vegetarian")) {
			System.out.println("vous avez choisi Vegetarian :) ");
			
		}else {
			System.out.println(" Maheuresement votre choix n'est pas dans le menu (: ");
			
		}
		

	}

}
