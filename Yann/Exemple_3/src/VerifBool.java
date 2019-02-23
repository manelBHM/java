import java.util.Scanner;

public class VerifBool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ecrire une application qui permet d'indiquer pour un nombre entier donné s'il est positif, négatif ou null?
		
				System.out.println("Enter a number");
				
				 Scanner sc = new Scanner(System.in);
					
				int c= sc.nextInt();
				
				if(c>0) {System.out.println("Le nombre saisir est Positif");}
				else if(c<0) {System.out.println("Le nombre saisir  est Négatif");}
				else {System.out.println("Le nombre saisir est null");}
			
	}

}
