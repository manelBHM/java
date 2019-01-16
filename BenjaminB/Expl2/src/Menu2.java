<<<<<<< HEAD
import java.util.Scanner;

public class Menu2 {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Bonjour et bienvenue au Georges V, au menu de ce soir nous avons :");
		System.out.println("Pour le Poulet 9 999.99€ tapez 1 ( que nous déconseillons aux policiers");
		System.out.println("Pour le Boeuf 9 999.99€ tapez 2 ( que nous déconseillons à Franck )");
		System.out.println("Pour Le végétarien tapez 3 ( que nous déconseillons aux paraplégiques )");
		System.out.println("Que désirez vous ?");
		int menu = scan1.nextInt();
		
		switch (menu){
		case (1):
			System.out.println("J'espère que vous vous régalerez avec ce poulet braisé au cocktail molotov !" );
		break;
		case (2):
			System.out.println("J'espère que vous vous régalerez avec ce Boeuf de Kobe Bryant !" );
		break;
		case (3):
			System.out.println("J'espère que vous vous régalerez avec cette salade jamaïquaine !" );
		break;
		default :
			System.out.println("Et oui viens pas au Georges V si t'es Smicar !!! ");
			break;
		}
}}
=======
import java.util.Scanner;

public class Menu2 {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Bonjour et bienvenue au Georges V, au menu de ce soir nous avons :");
		System.out.println("Pour le Poulet 9 999.99€ tapez 1 ( que nous déconseillons aux policiers");
		System.out.println("Pour le Boeuf 9 999.99€ tapez 2 ( que nous déconseillons à Franck )");
		System.out.println("Pour Le végétarien tapez 3 ( que nous déconseillons aux paraplégiques )");
		System.out.println("Que désirez vous ?");
		int menu = scan1.nextInt();
		
		switch (menu){
		case (1):
			System.out.println("J'espère que vous vous régalerez avec ce poulet braisé au cocktail molotov !" );
		break;
		case (2):
			System.out.println("J'espère que vous vous régalerez avec ce Boeuf de Kobe Bryant !" );
		break;
		case (3):
			System.out.println("J'espère que vous vous régalerez avec cette salade jamaïquaine !" );
		break;
		default :
			System.out.println("Et oui viens pas au Georges V si t'es Smicar !!! ");
			break;
		}
}}
>>>>>>> 9731d8118d80b09b7d14eeaf403e7b8c423e4ae9
