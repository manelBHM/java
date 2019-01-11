package exple5;

import java.util.Scanner;

public class Help {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Choisissez un nombre pour avoir la structure correspondante :");
	System.out.println("1- IF");
	System.out.println("2- SWITCH");
	System.out.println("3- FOR");
	System.out.println("4- WHILE");
	System.out.println("5- DO WHILE");
	
	
	String exercice = sc.nextLine();
	
	if (exercice.equals("1")) {
		System.out.println("if(//condition)\n" + 
				"{\n" + 
				"  //Exécution des instructions si la condition est remplie\n" + 
				"}\n" + 
				"else\n" + 
				"{\n" + 
				"  //Exécution des instructions si la condition n'est pas remplie\n" + 
				"}");
	}

	else if (exercice.equals("2")) {
		System.out.println("switch (/*Variable*/)\n" + 
				"{\n" + 
				"  case /*Argument*/:\n" + 
				"    /*Action*/;\n" + 
				"    break;        \n" + 
				"  default:\n" + 
				"    /*Action*/;             \n" + 
				"}");
		}
	
	else if (exercice.equals("3")) {
		System.out.println("for(int i = 1; i <= 10; i++)\n" + 
				"{\n" + 
				"  System.out.println(\"Voici la ligne \"+i);\n" + 
				"}");
		}
	
	else if (exercice.equals("4")) {
		System.out.println("while (/* Condition */)\n" + 
				"{\n" + 
				"  //Instructions à répéter\n" + 
				"}");
	}
	
	else if (exercice.equals("5")) {
		System.out.println("do{\n" + 
				"  //Instructions\n" + 
				"}while(a < b);");
	}
	
	
	
	}
}
