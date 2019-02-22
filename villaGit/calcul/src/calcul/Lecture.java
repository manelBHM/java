package calcul;

import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner clavier = new Scanner(System.in); 
		
		String chaine1 ="";
		String chaine2 = "";
		
		int a =0;
		
		System.out.println(" Entrez un nombre : "  );
		a = clavier.nextInt();
		
		
		clavier.nextLine();
		
		
		System.out.println("Entrez un texte : ");
		chaine1 = clavier.nextLine();
		

		System.out.println("Entrez un texte : ");
		chaine2 = clavier.nextLine();
		
		
		System.out.println("le nombre est : "+a);
		System.out.println("la premiere chaine est :" + chaine1);
		System.out.println("la deuxieme chaine est : " + chaine2);
		
		
	}

}
