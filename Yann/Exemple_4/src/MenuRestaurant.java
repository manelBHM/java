import java.util.Scanner;

public class MenuRestaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan =  new Scanner(System.in);
		
		String menu1="Poulet", menu2="Boeuf", menu3="Végétarien";
		
		
		
		System.out.println("Que souhaitez-vous comme menu :");
		System.out.println(menu1);
		System.out.println(menu2);
		System.out.println(menu3);
		
		
	    String menu = scan.nextLine();
	    
		
		if (menu.contains(menu1)){System.out.println("Vous avez Choisis le Menu " + menu1);}
		else if (menu.contains(menu2)){System.out.println("Vous avez Choisis le Menu " + menu2);}
		else if (menu.contains(menu3)){System.out.println("Vous avez Choisis le Menu " + menu3);}
		else {System.out.println("Vous n'avez pas choisis de menu");}
		
	    
	   
	}
	

}



