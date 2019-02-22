import java.util.Scanner;

public class HellpOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Quelle aide voulez vous ?\n1 - if\n2 - switch\n3 - for\n4 - while\n"
				+ "5 - do while\nTapez le chiffre qui correspond à l'aide que vous cherchez.");
		
		
		Scanner sc = new Scanner(System.in);
		
		int nbAide = sc.nextInt();
		
		switch (nbAide) {
		case 1:
			System.out.println("Voici la structure du if :\nif(//condition)\r\n" + 
					"{\r\n" + 
					"  //Exécution des instructions si la condition est remplie\r\n" + 
					"}\r\n" + 
					"else\r\n" + 
					"{\r\n" + 
					"  //Exécution des instructions si la condition n'est pas remplie\r\n" + 
					"} .");
			break;
		case 2:
			System.out.println("Voici la structure du switch :\nswitch (/*Variable*/)\r\n" + 
					"{\r\n" + 
					"  case /*Argument*/:\r\n" + 
					"    /*Action*/;\r\n" + 
					"    break;        \r\n" + 
					"  default:\r\n" + 
					"    /*Action*/;             \r\n" + 
					"}");
			break;
		case 3:
			System.out.println("Voici la structure du for:\nfor(int i = 1; i <= 10; i++)\r\n" + 
					"{\r\n" + 
					"  System.out.println(\"Voici la ligne \"+i);\r\n" + 
					"}");
			break;
		case 4:
			System.out.println("Voici la structure du while :\nwhile (/* Condition */)\r\n" + 
					"{\r\n" + 
					"  //Instructions à répéter\r\n" + 
					"}");
			break;
		case 5:
			System.out.println("Voici la structure du do while :\ndo{\r\n" + 
					"  //Instructions\r\n" + 
					"}while(a < b);");
			break;
			default :
				System.out.println("Vous n'avez pas saisi un des chiffres proposés précédement.");
		}

		

	    
	
	
	
	
	
	
	}

}
