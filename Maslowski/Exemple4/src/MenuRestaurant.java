import java.util.Scanner;

public class MenuRestaurant {

	public static void main(String[] args) {
		
		/* Scanner scan = new Scanner(System.in);
		
		System.out.println("Bonjour, bienvenue � Simplon Burger !");
		System.out.println("Aujourd'hui vous pouvez personnaliser votre burger en choisissant la base, au choix :");
		System.out.println("Au Poulet, au Boeuf ou V�g�tarienne.");
		
		String choixBase;
		System.out.println("Je vous laisse �crire ce que vous voulez.");
		Scanner input1 = new Scanner(System.in);
		choixBase = input1.nextLine();
		
		if (choixBase) {
			String string = "Poulet";
			System.out.println("Vous avez choisi le Poulet, nous lan�ons votre commande. :)");
		}
		
		else if (choixBase) {
			String string = "Boeuf";
			System.out.println("Vous avez choisi le Boeuf, nous lan�ons votre commande. :)");
		}
		
		else if (choixBase) {
			String string ="V�g�tarien";
			System.out.println("Vous avez choisi le v�g�tarien, nous lan�ons votre commande. :)");
		}
		*/
		
		
		
				
				Scanner scan1 = new Scanner(System.in);
				System.out.println("Bonjour et bienvenue au Georges V, au menu de ce soir nous avons :");
				System.out.println("Le Poulet 9 999.99� ( que nous d�conseillons aux policiers");
				System.out.println("Le Boeuf 9 999.99� ( que nous d�conseillons � Franck )");
				System.out.println("Le v�g�tarien 9 999.99� ( que nous d�conseillons aux parapl�giques )");
				System.out.println("Que d�sirez vous ?");
				
				String str = scan1.nextLine();
				String menu1 = "Le Poulet";
				String menu2 = "Le Boeuf";
				String menu3 = "Le v�g�tarien";
				
				if (str.equals(menu1)) {
					System.out.println("J'esp�re que vous vous r�galerez avec ce poulet brais� au cocktail molotov !" );
				}
				else if (str.equals(menu2)) {
					System.out.println("J'esp�re que vous vous r�galerez avec ce Boeuf de Kobe Bryant !" );
				}
				else if (str.equals(menu3)) {
					System.out.println("J'esp�re que vous vous r�galerez avec cette salade jama�quaine !" );
				}
				else {
					System.out.println("Et oui viens pas au Georges V si t'es Smicar !!! ");
				}
	}
}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


