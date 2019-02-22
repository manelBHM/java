package exple4;

import java.util.Scanner;

public class RestaurantAVECIFELSE {
	public static void main(String[] args) {
		
		System.out.println("Bienvue au restaurant Royal Food");
		System.out.println("Nous vous proposons 3 menus");
		System.out.println("Pour le menu Poulet entrez : 1");
		System.out.println("Pour le menu Boeuf entrez  : 2");
        System.out.println("Pour le menu végétarien entrez : 3");
        
        Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		//String menu = sc.nextLine();
		//if(menu.contain("poulet"))
		
	
        
        if (x==3) {
        	System.out.println("Vous avez choisi le menu végétarien");
        }
		
        else if (x==2) {
        	System.out.println(" Vous avez choisi le menu boeuf");
        }
        
       
        
        else if (x==1) {
        	System.out.println("Vous avez choisi le menu poulet");
        }
        
        else {
        	System.out.println("Mauvaise entrée");
        }
		
		
		
		
		
		
		
		
	}

}
