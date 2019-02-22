import java.util.Scanner;

public class TableauxMulti {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez la dimension de la matrice");
      int size = sc.nextInt();
      
		int [][] mat = new int [size][size];
		int [][] output = new int [size][size];
		
      for (int i = 0; i < size; i ++) {
      for ( int j = 0; j < size; j++) { 
    	  System.out.println("entrez un nombre entier  pour la rangee " + i + "et la colonne " + j);
       mat [i][j] = sc.nextInt();
       output [j][i] = mat [i][j];
      }
      
	}
      
      System.out.println("La matrice originale est : ");
      
      for (int i = 0; i < size; i++) {
    	  for (int j = 0; j < size; j++) {
    		  System.out.print(mat[i][j] + " ");
    	  }
    	  System.out.println();
    	  System.out.println();
      }
      
System.out.println("La matrice transposée est : ");
      
      for (int i = 0; i < size; i++) {
    	  for (int j = 0; j < size; j++) {
    		  System.out.print(output[i][j] + " ");
    	  }
    	  System.out.println();
    	  System.out.println();
      }

}
}