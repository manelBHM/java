import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choisissez votre menu. poulet, boeuf ou végétarien");
		
		String menu = sc.nextLine();
	
	
				
		if  (menu.equals("poulet")){
			System.out.println("Vous avez choisi le menu poulet");
			
		}
		
		else if (menu.equals("boeuf")){
			System.out.println("Vous avez choisi le menu boeuf");
			
			}
		
		else if (menu.equals("vegetarien")) {
			System.out.println("Vous avez choisi le menu végétarien");
			
			}
	
		
		else {
			System.out.println("Vous n'avez rien choisi !");
		}
		
		
		
	}

}
