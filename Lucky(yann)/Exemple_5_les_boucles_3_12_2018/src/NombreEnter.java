import java.util.Scanner;
import java.util.*;

public class NombreEnter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ecrire une application qui permet d'afficher des nombres entrés par l'utilisateur tant qu'ils sont inférieur a 10.
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Entre un nombre compris entre [0, 10]");
		
		int nmbre = sc.nextInt();
		int end = 10;
		
		while (nmbre<=end)
		{
	
		System.out.println(nmbre++);
		
			
		}
		
 System.out.println("end");
	}

}
