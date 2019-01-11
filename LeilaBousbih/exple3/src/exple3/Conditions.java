package exple3;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer la valeur A");
		int a = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);

		System.out.println("Entrer la valeur B");
		int b = sc2.nextInt();
		/*int a = 2;
		int b = 3;*/
		
		
		
		if (a < b) {
		
			System.out.println(a + " est le plus petit");
		}
		else if (b < a){
			System.out.println(b + " est le plus petit");
		}
		else 
		{
			System.out.println(a + " A est égale a B");
		}
		
		
		
		Scanner sc3 = new Scanner(System.in);

		System.out.println("Entrer la valeur C");
		int c = sc3.nextInt();
		/*int c = 0;*/
		
		if (c < 0){
			System.out.println(" ce nombre est negatif");
		}
		else if (c == 0) {
				
			System.out.println(" ce nombre est nul");
		}
			else {
				
			System.out.println("ce nombre est positif");
		}
		
		Scanner sc4 = new Scanner(System.in);

		System.out.println("Entrer la valeur D");
		int d = sc4.nextInt();	
	/*int d = 75;*/
	
	if (d < 100 && d > 50) {
		
		System.out.println("entre 50 et 100");
	}
	else {System.out.println("n'est pas entre 50 et 100");
	}
		
		
	}

}
