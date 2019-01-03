import java.util.Scanner;

public class Transposee {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int entree  ;
		// matrice a creer 
		
		
		Scanner clavier = new Scanner(System.in);
		System.out.println(" Donnez la dimension de l amatrice :");
		int tailleMatrice = clavier.nextInt();
		int [][] mat = new int [tailleMatrice][tailleMatrice]   ;
		
		for ( int i = 0 ; i <tailleMatrice ; i++  )
		{   for (int j = 0 ; j<tailleMatrice ; j++ ) {
		System.out.println(" Entrez un nombre entier pour la rangee "  + i + "  et la colonne "  +  j + ": "  ); 
		      
		    mat[i][j]= clavier.nextInt();
		}
		}
		
		// affichahge matrice initiale 
		System.out.println(" La matrice originale : ");
		for ( int i = 0 ; i <tailleMatrice ; i++  )
		{   for ( int j = 0 ; j < mat[i].length ; j++  ) {
			System.out.print("  "  + mat[i][j]);
		}
		 System.out.println();
		}
		
		// affichage matrice transposse 
		
		System.out.println(" La matrice transposee  : ");
		for ( int i = 0 ; i <tailleMatrice ; i++  )
		{   for ( int j = 0 ; j < mat[i].length ; j++  ) {
			
			System.out.print ("   " + mat[j][i]);
			}
		System.out.println();
		}

	}

}
