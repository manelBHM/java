package Application_Vacances;

import java.util.Arrays;
import java.util.Collections;

public class Tableaux{

	
	static int tab[]= {0,3,2,5,4,6,7,1,9,8};
	static int tab1[] = {1,4,3,2,0};
		
	public static void tableaux() {
		
		Arrays.sort(tab);
		System.out.println(Arrays.toString(tab));

	}
	
	public static void remplir1() {
		Arrays.sort(tab);
		System.out.println(Arrays.toString(tab));
		tableaux();
	}
	public static void remplir2() {
	  
		Arrays.sort(tab1);

		System.out.println(Arrays.toString(tab1));
	}
	public static void remplir3() {
		
		
	}
	
	
	
	public static void operation1() {
		
		
		
		int nbr = 0;
				
		for (int i=0; i <tab.length; i++) {
							
			
			if (tab[i] == 9) {
				
			nbr++;

			}
				
		}
		
		System.out.println("Il y a " + nbr + " éléments de valeur 9 dans le tableau");

		

		
		
	}
	
	public static void operation2() {
		
		int nbr = 0;
		
		
		for (int i=0; i<tab.length; i ++) {
			
			if (tab[i]>4 || tab[i]<2) {
				
				nbr ++;
				
			}
			
		}
		
		
		System.out.println("Il y a " + nbr + " éléments plus grand que 4 ou plus petit que 2");

			}
			
	public static void operation3() {
		int Sum=0;
		for (int i=0; i< tab.length; i++) {
			
			Sum += tab[i]; 
						
		}
		System.out.println("La somme des éléments est " + Sum);
		
	}
	
	
	public static void operation4() {
		
		double moyenne = 0.0;
		int Sum = 0;
		for (int i=0; i<tab.length ; i++) {
			
			Sum += tab[i];
			moyenne = Sum / tab.length;
		}
		System.out.println("La moyenne arithmétique des éléments est " + moyenne);
		
	}
	
	
	
	public static void operartion5() {
		
		int max = 0;
		for (int i=0; i <tab.length; i++) {
			
			 max = Math.max(max, tab[i]);

			
		}
		System.out.println("Le plus grand élément vaut: " + max);

	}
	
	//	-------------------------------------------------
	
	
	
	public static void operation6() {
		
		
		
		int nbr = 0;
				
		for (int i=0; i <tab1.length; i++) {
							
			
			if (tab1[i] == 9) {
				
			nbr++;

			}
				
		}
		
		System.out.println("Il y a " + nbr + " éléments de valeur 9 dans le tableau");

		

		
		
	}
	
	public static void operation7() {
		
		int nbr = 0;
		
		
		for (int i=0; i<tab1.length; i ++) {
			
			if (tab1[i]>4 || tab1[i]<2) {
				
				nbr ++;
				
			}
			
		}
		
		
		System.out.println("Il y a " + nbr + " éléments plus grand que 4 ou plus petit que 2");

			}
			
	public static void operation8() {
		int Sum=0;
		for (int i=0; i< tab1.length; i++) {
			
			Sum += tab1[i]; 
						
		}
		System.out.println("La somme des éléments est " + Sum);
		
	}
	
	
	public static void operation9() {
		
		double moyenne = 0.0;
		int Sum = 0;
		for (int i=0; i<tab1.length ; i++) {
			
			Sum += tab1[i];
			moyenne = Sum / tab1.length;
		}
		System.out.println("La moyenne arithmétique des éléments est " + moyenne);
		
	}
	
	
	
	public static void operartion10() {
		
		int max = 0;
		for (int i=0; i <tab1.length; i++) {
			
			 max = Math.max(max, tab1[i]);

			
		}
		System.out.println("Le plus grand élément vaut: " + max);

	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remplir1();
		operation1();
		operation2();
		operation3();
		operation4();
		operartion5();
		
		remplir2();
		operation6();
		operation7();
		operation8();
		operation9();
		operartion10();


	}

}
