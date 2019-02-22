<<<<<<< HEAD
import java.util.Scanner;
public class Menu1 {
	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Bonjour et bienvenue au Georges V, au menu de ce soir nous avons :");
		System.out.println("Le Poulet 9 999.99€ ( que nous déconseillons aux policiers");
		System.out.println("Le Boeuf 9 999.99€ ( que nous déconseillons à Franck )");
		System.out.println("Le végétarien 9 999.99€ ( que nous déconseillons aux paraplégiques )");
		System.out.println("Que désirez vous ?");
		String str = scan1.nextLine();
		String menu1 = "Le Poulet";
		String menu2 = "Le Boeuf";
		String menu3 = "Le végétarien";
		
		if (str.equals(menu1)) {
			System.out.println("J'espère que vous vous régalerez avec ce poulet braisé au cocktail molotov !" );
		}
		else if (str.equals(menu2)) {
			System.out.println("J'espère que vous vous régalerez avec ce Boeuf de Kobe Bryant !" );
		}
		else if (str.equals(menu3)) {
			System.out.println("J'espère que vous vous régalerez avec cette salade jamaïquaine !" );
		}
		else {
			System.out.println("Et oui viens pas au Georges V si t'es Smicar !!! ");
		}
	}
}
=======
import java.util.Scanner;
public class Menu1 {
	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Bonjour et bienvenue au Georges V, au menu de ce soir nous avons :");
		System.out.println("Le Poulet 9 999.99€ ( que nous déconseillons aux policiers");
		System.out.println("Le Boeuf 9 999.99€ ( que nous déconseillons à Franck )");
		System.out.println("Le végétarien 9 999.99€ ( que nous déconseillons aux paraplégiques )");
		System.out.println("Que désirez vous ?");
		String str = scan1.nextLine();
		String menu1 = "Le Poulet";
		String menu2 = "Le Boeuf";
		String menu3 = "Le végétarien";
		
		if (str.equals(menu1)) {
			System.out.println("J'espère que vous vous régalerez avec ce poulet braisé au cocktail molotov !" );
		}
		else if (str.equals(menu2)) {
			System.out.println("J'espère que vous vous régalerez avec ce Boeuf de Kobe Bryant !" );
		}
		else if (str.equals(menu3)) {
			System.out.println("J'espère que vous vous régalerez avec cette salade jamaïquaine !" );
		}
		else {
			System.out.println("Et oui viens pas au Georges V si t'es Smicar !!! ");
		}
	}
}
>>>>>>> 9731d8118d80b09b7d14eeaf403e7b8c423e4ae9
