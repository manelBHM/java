package Application_Vacances;

import java.util.ArrayList;
import java.util.Arrays;

public class TableauTrace {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int tableau[] = {3, -8, 14, 4};
		
				
		System.out.println("longeur du tableau = " + tableau.length);

		int somme = 0;
		for (int i=0; i<tableau.length; i++) {
			
			somme += tableau[i]; 
				
		}
		
		System.out.println("somme du tableau = " + somme);	
		
		int max = 0;
		
		for (int i= 0; i<tableau.length; i++) {
			
			if (tableau[i]> max) {
				
				max = tableau[i];
			}
		}
		
		System.out.println("indice du max du tableau = " + max);

		System.out.println("Après ajout de 20 :");
		System.out.println("Le tableau initial  est : " + Arrays.toString(tableau));
	
		int []tab2 = new int[tableau.length+1];
			  tab2[tab2.length-1]=20;


				for (int i=0;i <tab2.length-1; i++) {

					tab2[i] = tableau[i];
				}
		
		System.out.println("et le résultat est :" + Arrays.toString(tab2));
			
	}

}
