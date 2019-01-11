import java.util.Scanner;

public class Test {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print(" Donnez la dimension de la matrice: ");
        int m = scanner.nextInt();
		
		int[][]mat = new int [m][m];
		int [][] output = new int[m][m];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < m; j++) {
		    System.out.println("Entrez un nombre entier pour la rangé  " +i + " et la colonne " + j+ ": " ); 
		 mat[i][j] = scanner.nextInt();
		  }
		}
		
		System.out.println(" La matrice originale  est : ");
		for(int i = 0; i < m; i++) {
         for(int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
 
  
        System.out.println(" La matrice transposée est : ");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
            	System.out.print(mat[j][i] + " ");
            }
            System.out.println();
		}}
}
   
	