import java.util.Scanner;

public class Help {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Veuillez taper le numero de l'exercice à corrigé s'il vous plaît !");
		System.out.println("1. if");
		System.out.println("2. switch");
		System.out.println("3. for");
		System.out.println("4. while");
		System.out.println("5. do while");
		
		String carte = sc.nextLine();
		
		
		if(carte.equals("1")) {
			System.out.println (" if (Condition) {\n" + 
					"			System.out.println (instruction);\n" + 
					"			}\n" + 
					"			else if (Condition) {\n" + 
					"			System.out.println (instruction);\n" + 
					"			}\n" + 
					"			else {\n" + 
					"				System.out.println (instruction); \n" + 
					"			} ");
			
	}
		else if(carte.equals("2")) {
			System.out.println
			               ("switch (expression) {\n" + 
					"		case constante 1: \n " +
					"		   System.out.println (instruction);\n" + 
					"		break;\n" + 
					"		case  constante 2:\n" + 
					"		   System.out.println(instruction); \n" +
					"		break;\n" + 
					"		default: \n" + 
					"		   System.out.println(instruction) };"
					);	
}
		else if (carte.equals("3")) {
			System.out.println("for( compteur initialisé ; compteur < d'itération ; compteur à incrémenter ou décrementer)\n" + 
					"{\n" + 
					"  System.out.println(instruction);\n" + 
					"}");}
		
		else if (carte.equals("4")) {
			System.out.println("while (condition) {\n" + 
					"		System.out.println(instruction);\n" + 
					"		\n" + 
					"		}");}
		else if (carte.equals("5")) {
			System.out.println("do{\n" + 
					"       System.out.println(instruction)\n" + 
					"       }"  +
					"      while(Condition);");}
		else {
			System.out.println("Echec !");}
		}
}
		
