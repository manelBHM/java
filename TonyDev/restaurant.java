import java.util.Scanner;


	public class restaurant {
		
		public static void main(String[] args) 
		{
		
		Scanner bvnu = new Scanner(System.in);
		System.out.println("Bienvenue vous souhaitiez commander ? Oui ou Non");
		
		String choix = bvnu.nextLine();
		
		switch (choix)
		{
			case "oui":
			System.out.println("Quel menu souhaitiez vous choisir ?");
			break;
			
			case "Oui":
				System.out.println("Quel menu souhaitiez vous choisir ?");
			break;
			
			case "Non":
				System.out.println("Merci aurevoir ! :)");
			break;
			
			default:
				System.out.println("erreur soit Oui soit Non relancez");
			
				
		}
		
		Scanner menu = new Scanner(System.in);
		System.out.println ("Choisissez votre menu :");
		System.out.println("Poulet");
		System.out.println("Boeuf");
		System.out.println("Vegi");
		
		String monmenu = menu.nextLine();
		
		switch (monmenu)
		{
		
		case "Poulet":
			System.out.println("Voici votre menu Poulet");
		break;
		
		case "Boeuf":
			System.out.println("Voici votre menu Boeuf");
		break;
		
		case "Vegi":
			System.out.println("Voici votre menu vegi");
			
		default:
			System.out.println("Veuillez relancer l'application");
		}
		}
	
}
