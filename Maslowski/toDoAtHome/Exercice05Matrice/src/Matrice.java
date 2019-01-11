import java.util.Scanner;

public class Matrice {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Donnez la dimmension de la matrice : ");
		int input1 = scanner.nextInt();
		
		int Tab1[][] = new int[input1][input1];
		int Tab2[][] = new int [input1][input1];
		
		for (int row = 0; row < input1; row ++) {
			
			for (int col = 0; col < input1; col++) {
				
				System.out.print("Entrez un nombre pour la rangée " + row + " et pour la cologne " + col + " : ");
				Tab1[row][col] = scanner.nextInt();
				Tab2[row][col] = Tab1[row][col];
					
			}
		}
		
		System.out.println("La matrice original est : ");
		for(int row = 0; row < input1; row++) {
			
			for(int col = 0; col < input1; col++) {
				
				System.out.print(Tab1[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("la matrice transposée est : ");
		for(int row = 0; row < input1; row++) {
			
			for(int col = 0; col < input1; col++) {
				
				System.out.print(Tab2[col][row] + " ");
				
			}
			System.out.println();
		}
	}

}
