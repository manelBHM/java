package drmas;

import java.util.Scanner;

public class Exo1Condition {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		System.out.println("Ecrire une application qui permet de comparer 2 Nombres entiers etafficher le plus petit ?");
		*
		*
		*/
		
	    /*	
		int num1 = 10, num2 = 20;
		if(num1 < num2) {
			System.out.println("Number 1 Plus Petit Que Number 2");
		} else if(num1 == num2) {
			System.out.print("Your Numbers Are Equals");
		}else {
			System.out.println("Number 2 Plus Grand Que Number 1");
		}
        */
		
		System.out.println("\n--------- Example 1 ---------");
		System.out.println("Ecrire une application qui permet de comparer 2 Nombres entiers etafficher le plus petit ?\n");
		Scanner s = new Scanner(System.in);
		int exo1N1, exo2N2;
		char confirm = 'y';
			
		while(confirm == 'y') {
		System.out.println("Enter Number 1");
		exo1N1 = s.nextInt();
		
		System.out.println("Enter Number 2");
		exo2N2 = s.nextInt();

			if(exo1N1 < exo2N2) {
				System.out.println("Number 1 Plus Petit Que Number 2");
			}else if(exo1N1 == exo2N2) {
				System.out.print("Vos numbers sont égales !");
			}else {
				System.out.println("Number 2 Plus Grand Que Number 1");
			}
			
			 System.out.println("\n\n\n--------- Example 2 ---------");
			 System.out.println("Ecrire une application qui permet d'indiquer pour un nombre entier donné s'il est positif, négatif ou null \n");
			 System.out.println("\nEnter Number Négatif, Positif où Null ");
			 int sum2 = s.nextInt();
			 int ex2Num = 0;
			 if(sum2 < ex2Num) {
				 System.out.println("Négatif");
			 } else if (sum2 > ex2Num){
				 System.out.println("Positif");
			 }else {
				 System.out.println("Null");
			 }
			 
			 
			 System.out.println("\n\n\n--------- Example 3 ---------");
			 System.out.println("\nEcrire une application qui permet de vérifier pour un numbre entier s'il est dans l'intervalle[50,100]? \n");
			 
			 System.out.println("Enter Number Between 50 And 100");
			 
			 int num = 50, num2 = 100;
			 int res = s.nextInt();
			 
			 if(res < num) {
				 System.out.println("Your Number Smaller Then 50");
			 } else if (res >= num && res <= num2){
				 System.out.println("Your Number Is Correct :" + " " + res);
			 }else {
				 System.out.println("Your Number Bigger Then 100");
			 }
			 

			System.out.println("\n--------------\n");
			System.out.println("If You Want To Try Again Enter (y) ?: Or Any Char to Exit");
			confirm = s.next().charAt(0);
			
			if(confirm != 'y') {
				System.out.println("Your Have Been Exit of Application");
			}
			
		}
		


	}//Main

}


/*
 * 
 * Voici les régles de notre programme: 1- Chaque candidat aa une mention entre
 * "Excellent" et "A rejecter". il y en en tout
 * 
 */

//System.out.println("Candidat, Electeurs Votes");
// Excellent, Trés bien, Bien, Assez Bien, Passable, Insuffisant, A rejecter

// 1- Tableau avec les noms des candidats + mentions
// 2- ajout bulletin x10
// 3- Tri de mention / par condidat
// 4- Ajout cette info dans le tableau
// 5- répéter l'action jusqu'à ce qu'il n'y ait plus de bulletins

/*
 * Condition ternaires
 */
/*
int x = 10, y = 20;
int max = (x < y) ? y :x;
//System.out.println(max);

int max2 = (x < y) ? y * 2 : x * 2;
System.out.println(max2);

int max3 = (x < y) ? (y < 10 ) ? y % 10 : y * 2 : x;
System.out.println(max3);

max = (x < y) ? ((y < 10) ? y % 10 : y * 2): x;
System.out.println(max);
*/