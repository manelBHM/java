package ex;

import java.util.Scanner;

public class MenueOrdar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Bonjour et bienvenue ce que vous voulz comme menue de offre (9£) ?" + "\n");
		System.out.println(" 1:Le Poulet \n 2:le Boeuf \n 3:levégétarien \n" );
		
		int str = scan1.nextInt();
		String menu1 = "Le Poulet";
		String menu2 = "Le Boeuf";
		String menu3 = "Le végétarien";

		
			
		
		
		switch (str) {
		
		case 1:
			System.out.println(" vous avez choisi le menu poulet \n" + "le menu poulet il propose 3 choix \n A:des légumes fris \n B:des files \n C:du riz \n");
			System.out.println("et boisson :" + "\t" + " eau plate " + "\t" + " eau gazeuse " + "\t" + " ou soda \n");
		break;
		
		case 2:
			System.out.println("  vous avez choisi le menu Boeuf \n" + "le menu Boeuf il propose 3 choix \n 1:des  frites \n 2:des files \n 3:du riz \n");
		
			int a =1;
			int s =2;
			int b =3;
			
			if (a<s) {
				
				 a = scan1.nextInt();
				 System.out.println("vous avez choisi : frites");
			}
			else {
				System.out.println();
			}
			
		break;
		
		case 3:
			System.out.println("  vous avez choisi le menu végétarien \n" + "le menu végétarien il propose 3 choix \n A:des légumes fris \n B:du riz \n C: une boisson \n"); 
			break;
		default :
			System.out.println( );
			break;
		
		}
		
	}

}
