/*Exercices sur les valeurs*/


package exemple3;
 /*Exemple et applications exercice if else*/
import java.util.Scanner;

public class exercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner clavier = new Scanner(System.in);

	/*
		int a = 8;
	int b = 2; */
		
		/*
		
		int a,b;
		
		System.out.println("Entrez la valeur de a :");
		a = clavier.nextInt();
		
		
		System.out.println("Entrez la valeur de b :");
		b = clavier.nextInt();
		
		
	
	
	
	
	
	if(a<b) {
		
		System.out.println("la valeur la plus petite est " +a);
	}
	else 
	System.out.println(b+ " est plus petit");	
	*/
	/*
	int c ;
	System.out.println("entrez la valeur de c ");
	c = clavier.nextInt();
	 
	if (c==0) {
		System.out.println("c'est nul");
	}
	 else if (c>0) {
		 
		 System.out.println("c'est positif ");
	}
	 else 
		 System.out.println("c'est negatif ");
	
*/
int d ;
   System.out.println("entrez la valeur de d");

   d = clavier.nextInt();
   
   if (d>50 && d<100)
	   System.out.println("c'est dans l'intervalle ");
   else 
	   System.out.println("nous ne sommes pas dans l'intervalle");
	}

} 
	
