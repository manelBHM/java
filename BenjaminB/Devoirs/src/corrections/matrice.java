package corrections;
import java.util.Scanner;
public class matrice {
private static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Entrez la dimmension de la matrice");
		int size = scanner.nextInt();
		int tab[][]= new int [size][size];
		int bat[][]=new int [size][size];
		for (int row = 0; row<size;row++) {
			for(int col=0;col<size;col++) {
				System.out.println("entrer un nombre pour la rangée "+row+"et pour la colone"+col+":");
				tab[row][col]=scanner.nextInt();
				bat[col][row]=scanner.nextInt();
			}
		}
		System.out.println("la matrice original est :");
		for(int row=0;row<size;row++) {
			for(int col=0;col<size;col++) {
				System.out.print(tab[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println("La matrice transposé est :");
		for(int col=0;col<size;col++) {
			for(int row=0;row<size;row++) {
				System.out.print(bat[col][row]+" ");
			}
			System.out.println();
		}
	}

}
