import java.util.Scanner;

public class Help {

	public static void main(String[] args) {
		
		System.out.println("Bienvnue dans l'assistant pour les nuls sur les structures conditionelles et les boucles" + "\n" + "\n" + "\n" + "Assistance pour la structure conditionelle -- if -- tapez : 1" + "\n" + "\n" + "Assistance pour la structure conditionelle -- switch -- tapez : 2" + "\n" + "\n" + "Assistance pour la boucle -- for -- tapez : 3" + "\n" + "\n" + "Assistance pour la boucle -- while -- tapez : 4" + "\n" + "\n" + "Assistance pour la boucle -- do while -- tapez : 5");
		

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		switch (x) {
		
		case 1 : System.out.println("if (condition) {" + "\n" + "intruction;" + "\n" + "}" + "\n" + "\n" + "else if (condition) {" + "\n" + "instruction;" + "\n" + "}" + "\n" + "\n" + "else {" + "\n" + "instruction;" + "\n" + "}");
		break;
		
		case 2 : System.out.println("switch (expression) {" + "\n" + "\n" + "case constant1 : instruction" + "\n" + "break;" + "\n" + "\n" + "case constant2 : instruction" + "\n" + "break;" + "\n" + "\n" + "case etc ..." + "\n" + "};");
		break;
		
		case 3 : System.out.println("for (compteur exp i=0; condition; itération) {" + "\n" + "code a executer dans la boucle" + "\n" + "}");
		break;
		
		case 4 : System.out.println("while (condition boolean) {" + "\n" + "code a executer dans la boucle" + "\n" + "}" );
	    break;
	    
		case 5 : System.out.println("do {" + "\n" + "code a executer dans la boucle" + "\n" + "}" + "\n" + "while (condition boolean);");
	    break;
		
		}
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
