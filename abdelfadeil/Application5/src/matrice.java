import java.util.Scanner;

public class matrice {
    static int nb;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez la dimension de la matrice: ");
		nb = sc.nextInt();
		int [][] tab = new int [nb][nb];
		for (int i = 0; i < nb; i++) {
			for (int j = 0; j < nb; j++) {
				System.out.print("Entrez un nombre entier pour la rangée "+i +" et la colonne "+j +": ");
				tab [i][j] = sc.nextInt();
			}
			
		}
		System.out.println("La matrice originale est :");
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab.length; j++) {
				System.out.print(tab[i][j]+" ");
			}
			
			System.out.println();
		}
		
		System.out.println("La matrice originale est :");
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab.length; j++) {
				System.out.print(tab[j][i]+" ");
			}
			
			System.out.println();
		}
	}
}