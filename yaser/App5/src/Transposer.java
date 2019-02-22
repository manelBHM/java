import java.util.Scanner;

public class Transposer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int [][] matrix = new int [m][m];
		int [][] matric = new int [m][m];
		
			
		for (int i=0; i<m; i++) {
			for (int j=0; j<m; j++) {
				
				System.out.println("Entrez un namber entier pour la rangée " + i + "et la colonne O:" + j );
	               
	             matrix[i][j]=input.nextInt();
	             matric[j][i]=matrix[i][j];
			}
		}
				
		System.out.println("la matrice orginale est :" + "\n" );
		
		for (int i=0; i<m; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(matrix[i][j] + " ");
			}System.out.println();
		}
		
		System.out.println("la matrice transposée est :" + "\n" );
		
		for (int j=0; j<m; j++) {
			for (int i=0; i<m; i++) {
				System.out.print(matrix[i][j] + " ");
			}System.out.println();
		}

	}

}