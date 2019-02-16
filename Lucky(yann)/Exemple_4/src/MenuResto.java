import java.util.Scanner;

public class MenuResto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		Scanner sc =  new Scanner(System.in);
		
		String menu1="Poulet", menu2="Boeuf", menu3="Végétarien";
		
		System.out.println("Que souhaitez-vous comme menu :");
		System.out.println(menu1);
		System.out.println(menu2);
		System.out.println(menu3);
		
		
	    String menu = sc.nextLine();
		
	
	    switch (menu)
	    {
	    
	    case "Poulet":
	    System.out.println("Vous avez Choisi le Menu " + menu1);
	    
	    break;
	    
	    case "Boeuf":
		    System.out.println("Vous avez Choisi le Menu " + menu2);
		    
		    break;
		    
	    case "Végétarien":
		    System.out.println("Vous avez Choisi le Menu " + menu3);
		    
		    break;
	    default:

			  System.out.println("Vous n'avez pas choisis de Menu");
			  
		
	    
	};
	
	}

}
