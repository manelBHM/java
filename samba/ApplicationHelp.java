import java.util.Scanner;

public class ApplicationHelp {

	public static void main(String[] args) {

		System.out.println(
				"Choisisze votre Systeme de structure if = n°1 - switch = n°2 - while = n°3 - do while = n°4 - for = n°5 :");
		Scanner sc = new Scanner(System.in);
		int choix = sc.nextInt();

		switch (choix) {
		case 1:
			System.out.println(" Voici la sintax de la strucutre du if : \n\r " + "if(//condition){ \n\r "
					+ " \n\r //Exécution des instructions si la condition est remplie \n\r}" + "\n\r else{ \n\r"
					+ "\n\r //Exécution des instructions si la condition n'est pas remplie \n\r}");
			break;

		case 2:
			System.out.println(" Voici la sintax de la strucutre du switch : " + " switch(/*Variable*/){ \n\r"
					+ " case /*Argument*/: \n\r " + " /*Action*/;  \n\r " + " break;  \n\r " + "default: /*Action*/; "
					+ "\n\r }");
			break;
		case 3:
			System.out.println("Voici la sintax de la strucutre du while :  \n\r " + "while (/* Condition */){ \n\r "
					+ " //Instructions à répéter \n\r}");
			break;

		case 4:
			System.out.println("Voici la sintax de la strucutre du do while : \n\r " + " do{ \n\r "
					+ "//Instructions \n\r " + " }while(a < b);");
			break;

		case 5:
			System.out.println("Voici la sintax de la strucutre du for : \n\r" + " for(int i = 1; i <= 10; i++) { \n\r "
					+ "System.out.println(\"Voici la ligne\"+i); \n\r}");
			break;
		}

	}

}
