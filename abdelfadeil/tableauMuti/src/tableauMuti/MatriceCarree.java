package tableauMuti;

import java.util.Arrays;
import java.util.Scanner;

public class MatriceCarree {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nb;
		
		System.out.println("Dnnoez la dimension de la matrice ");
		nb = sc.nextInt();
		int [] [] tab = new int [nb][nb];
		
	    int [] [] tabTransposee = new int [nb][nb];


		for (int i = 0; i < tab.length; i++) {
			
			for (int j = 0; j < tab.length; j++) {
				System.out.println("Entez un nombre pour la rangé "+ i+" et de la colonne "+ j+": " );
				tab[i][j]= sc.nextInt();
				
			}
		}
		
		System.out.println("La matrice originale est: ");
		 for (int i = 0; i < tab.length; i++) {
				for (int j = 0; j < tab.length; j++) {
					System.out.print(tab[i][j]+" ");
					
				}
				System.out.println();
			}
		
		
		 System.out.println();
		
       
        
		System.out.println("La matrice transposé est: ");

        for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab.length; j++) {
				System.out.print(tab[j][i]+" ");	
			}
			System.out.println();
		}
        

       
		
		
		
    
		
	}

}
