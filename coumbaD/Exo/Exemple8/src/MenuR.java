import java.util.Scanner;

public class MenuR {

	Scanner sc = new Scanner (System.in);
	
	int nbrMenus;
	
    public int nbrMenus () {
    	System.out.println("Combien de menus désirez vous ?");
    	int nbrMenus = -1;
    	do {
    		nbrMenus = sc.nextInt();}
    	
    	while (nbrMenus<0);
    	return nbrMenus;
    }
    public void choixMenu (){
    		System.out.println("Bonjour, nous vous proposons plusieurs formules au choix à 9€ !");
    		System.out.println("\n" +"1- Menu au Poulet ?");
    		System.out.println("2- Menu au Boeuf ?");
    		System.out.println("3- Menu végétarien ?");	
    		System.out.println("\n" + "Combien de menu voulez vous ?");
    		} 
 
    	
	
    public void afficherMenu () {		
		System.out.println("Quel menu voulez vous ?");
		System.out.println("1 - poulet");
		System.out.println("2 - Boeuf");
		System.out.println("3 - Végétarien");

	}
    
    public void afficherSides () {		
		System.out.println("Choisissez un accompagnement pour votre plat svp?");
		System.out.println("1 - frites");
		System.out.println("2 - riz");
		System.out.println("3 - pates");

	}
    public void afficherVégétarien () {		
		System.out.println("Voulez vous un peu de riz?");
		System.out.println("1 - oui ");
		System.out.println("2 - non, merci");

	}
    public void afficherDrink (){
	    System.out.println("Quelle Boisson voulez vous ?");
		System.out.println("1 - Soda");
		System.out.println("2 - Eau plate");
		System.out.println("3 - Eau gazeuze");
	}
    
    public int askDrink () {
    	afficherDrink();
    	int drink = sc.nextInt();
    	return drink;
    }
    
    public int askMenu () {
    	afficherMenu();
    	int Menu = sc.nextInt();
    	return Menu;
    }
    public int askSides(int menu) {
    
  
    	switch (menu) {
    	case 1: afficherSides();
    	break;
    	case 2: afficherSides();
    	break;
    	case 3: afficherVégétarien();
    	break;
    	}
    int askSide = sc.nextInt();
    return askSide;
    	
    }
    
    public void runMenu () {
    	int menu = askMenu ();
    	int drink =0;
    	int side=0 ;
    	
    	switch (menu) {
    	case 1: side = askSides(1);
    	        drink = askDrink();
    	break;
    	case 2: askSides(2);
    	break;
    	case 3: askSides(3);
    	        askDrink();
    	break;
    	}
     
    	
    	confimerCommande (menu, side, drink);
    }
    public void RunMenus () {
    	
    	int nbr = nbrMenus();
    	for (int i=0; i<nbr; i++) {
    		runMenu();
    		
    	}
    	
    }
    public void confimerCommande (int choix, int side, int drink) {
    	System.out.println("Vous avez choisis comme menu: " + choix);
    	System.out.println("Vous avez choisis comme accompagnement: " + side);
    	System.out.println("Vous avez choisis comme boisson: " + drink);
    	
    }
    public void main (String[]args) {
    	RunMenus();
    }
}
 
 

