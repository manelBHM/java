//importing Scanner from native library.
import java.util.Scanner; 
public class ChoisirMenu {

	public static void main(String[] args) {
		
		//making new class of Scanner & displaying the List of menu.
		Scanner scan = new Scanner(System.in);
		System.out.println("Please select just the number of the menu from the list given below..."
				+ "\n" + "1. Poulet" + "\n" + "2. Boeuf" + "\n" + "3. Végétarian");
		
		//taking user input into menu variable as a int.
		int menu = scan.nextInt();
		String menu1 = "Poulet"; 
		String menu2 = "Boeuf"; 
		String menu3 = "Végétarian";
		//System.out.println("1. "+ menu1 + "   2. "+ menu2 + "   3. "+ menu3);
		
		//checking user input with switch case.
		switch (menu) {
		
		case 1:
			System.out.println("Coming from switch...case statement :");
			System.out.println("You have selected the menu of " + menu1 + ".");
			break;
		case 2:
			System.out.println("Coming from switch...case statement :");
			System.out.println("You have selected the menu of " + menu2 + ".");
			break;
		case 3:
			System.out.println("Coming from switch...case statement :");
			System.out.println("You have selected the menu of " + menu3 + ".");
			break;
			
		default :
			System.out.println("Please select a menu");
		
		} 
		
		
		//checking user input with if else condition.
		if(menu == 1) {
			System.out.println("Coming from if...else statement :");
			System.out.println("You have selected the menu of " + menu1 + ".");
		}else if (menu == 2) {
			System.out.println("Coming from if...else statement :");
			System.out.println("You have selected the menu of " + menu2 + ".");
		}else if (menu == 3) {
			System.out.println("Coming from if...else statement :");
			System.out.println("You have selected the menu of " + menu3 + ".");
		}else {
			System.out.println("Coming from if...else statement :");
			System.out.println("Please select a number of menu ex: 1/2/3");
		}
			

	}

}
