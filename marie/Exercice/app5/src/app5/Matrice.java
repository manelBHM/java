package app5;
import java.util.Scanner;
public class Matrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner la dimention de la matrice ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		int[][] output = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.println("Entrer un nombre entier pour la ranger " + i + " et la colonne " + j);
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("La matrice original est ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(mat[i][j]);
			}
				System.out.println(" ");
		}
		
		System.out.println("La matrice transposer est ");
		for(int j=0; j<n; j++) {
			for(int i=0; i<n; i++) {
				System.out.print(mat[i][j]);
			}
				System.out.println(" ");
		}
	}

}
