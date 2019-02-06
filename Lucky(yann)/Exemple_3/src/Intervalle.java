import java.util.Scanner;

public class Intervalle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Ecrire une application qui permet de vérifier pour un nombre s'il est dans l'intervalle [50, 100]?
		
		System.out.println("Verifier si un nombre est compris entre [50, 100]");
		
		Scanner inter = new Scanner(System.in);
		 int d = inter.nextInt();

		if(d < 100 && d > 50) {System.out.println("Ma variable se trouve bien dans l'intervalle [50, 100].");}
		else if (d <= 100 && d >= 50) {System.out.println("Ma variable se trouve pas dans l'intervalle [50, 100].");}
		else {System.out.println("Ma variable se trouve pas dans l'intervalle [50, 100].");}

	}

}
