/**
 * 
 */
package restaurant;

import java.util.Scanner;

/**
 * @author simplonco
 *
 */
public class menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Bonjour, Bienvenue au restaurant :");
		
		System.out.println("Le mennu aujourd'hui est :");
		System.out.println("1- au poulet.");
		System.out.println("2- au boeuf.");
		System.out.println("3- végétarien.");
		
		System.out.println("QUE SOUHAITEZ VOUS COMME MENU ?");
		
		
		int choix ;  // ce variable presente le choix de menu .
		             // ce choix , on va le recuperer du console 
		
		Scanner clavier = new Scanner(System.in); // cette methode nous permet de saisir notre choix au console 
		choix = clavier.nextInt(); // setLine pour recuperer cette valeur saisie 
		
		 if (choix == 1) {

	            System.out.println("Vous avez choisi comme menu : poulet");

	        } else if (choix == 2) {

	            System.out.println("Vous avez choisi comme menu : boeuf");

	        } else if  (choix == 3) {

	            System.out.println("Vous avez choisi comme menu : végétarien");

	        } else {

	            System.out.println("Vous n'avez pas choisi de menu parmi les choix proposés");

	        }

	    }
		
		
	}


