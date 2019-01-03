import java.util.Scanner;
public class menu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Bonjour et bienvenue au Georges V, au menu de ce soir nous avons :");
		
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
