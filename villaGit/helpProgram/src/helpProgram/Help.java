package helpProgram;

import java.util.Scanner;

public class Help {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(" Pour comprendre le syntax des boucles et les conditions !! ");
		System.out.println("On essaye ?? (O/N)? ");
		Scanner clavier = new Scanner(System.in);
		
		char c = clavier.nextLine().charAt(0);
		
		if ( c =='O')
		{
			System.out.println(" Choisissez une parmi les suivantes : ");
			System.out.println(" 1- le IF ... ELSE : ");
			System.out.println(" 2- SWITCH  : ");
			System.out.println(" 3- FOR  : ");
			System.out.println(" 4- WHILE  ");
			System.out.println(" 5- DO ..... WHILE  : ");
			
			// Scanner clavier2 = new Scanner (System.in);
			char  choix = clavier.nextLine().charAt(0);
			
			// int c = Integer.parseInt(choix);
			switch (choix)
			{
			case '1' : 
				System.out.print("Pour utiliser les conditions : IF ... ELSE :");
				System.out.println("Il faut suivre ce shema : ");
				System.out.println(" if ( condition ()) {\n  statements;... }\n  else statement; ");
				break;
				
			case '2' :
				System.out.println("Pour utiliser le switch : ");
				System.out.println("Il faut suivre ce shema : ");
				System.out.println(" switch (condition ) { \n case constante1 : {statement 1 ;} \n case constante 2 : {statement 2 ;} \n case constante n : {statement n ;}}");
				System.out.println("default : break ; ");
				break;
				
			case '3' : 
				System.out.println("Pour utiliser la boucle FOR : ");
				System.out.println("Il faut suivre ce shema : ");
				System.out.println(" for ( int compteur; compteur < maximum d'iteration ; compteur nscrementé (ou decrementé ) { \n statement 1; .. statement n; } ");
				break;
				
			case '4' :
				System.out.println("Pour utiliser la boucle WHILE : ");
				System.out.println("Il faut suivre ce shema :");
				System.out.println("while ( condition ) {\n statement1; \n statement 2; \n ... statement n; \n}");
				break;
				
			case '5' :
				System.out.println("Pour utiliser la boucle DO ... WHILE  :");
				System.out.println("Il faut suivre ce shema :");
				System.out.println(" do { \n statement1; \n statement 2; \n ...\n statement n;\n} while ( condition);");
				break;
				
			
				
				 
			}
			
		}

		else 
			System.out.println(" Oups .. peut etre la prochaine fois , au revoir ");
	}

}
