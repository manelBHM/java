import java.util.Scanner;

public class mune2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Bonjour et bienvenue au Georges V, au menu de ce soir nous avons :");
		
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
	}

}
