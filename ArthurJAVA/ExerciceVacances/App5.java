import java.util.Arrays;
import java.util.Scanner;

public class App5 {
	
	
public static void main(String[] args) {
	
	
	
	//int[][]mat = remplir(2);
	
	 //static int[][] remplir (int nb) {
	
	     Scanner sc = new Scanner(System.in);
	     
	     System.out.println("Entrez un nombre nb pour la dimension du tableau");
	     
	     int nb =sc.nextInt();
	
	
		 
		 int[][] matrice = new int [nb][nb];
		 int[][] matrice2 = new int [nb][nb];
			
			for (int i=0;i<nb;i++) {
				
				for (int j=0;j<nb;j++) {
					
					System.out.println("Entrez i et j");
					
					matrice[i][j] = sc.nextInt();
				}
}
			
			
              for (int i=0;i<nb;i++) {
				
				for (int j=0;j<nb;j++) {
					
					System.out.print(matrice[i][j] + " ");
					
	
				}
					System.out.println();
					
				}
              
              System.out.println();
              System.out.println("la 2eme matrice est" + "\n");
              
              
              
              for (int j=0;j<nb;j++) {
  				
  				for (int i=0;i<nb;i++) {
  					
  					System.out.print(matrice[i][j] + " ");
  					
  	
  				}
  					System.out.println();
  					
  				}
              
            
			
	 }
			
	

}