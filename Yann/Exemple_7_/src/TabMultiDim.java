import java.util.Scanner;
public class TabMultiDim {
	
	
	
	static void oMatrice (int[][] tab) {
		
		System.out.println("La Matrice Original est: ");
		
        for (int i = 0; i < tab.length; i++) {
        	  
        	  for(int j = 0; j < tab.length; j++)
        	

    		  {
    			 System.out.println(tab[i][j]);
    			
    		  }
         
        }
 
    }
	
	
	
static void tMatrice (int[][] tab) {
		
	System.out.println("La Matrice Transposée est: ");
        for (int i = 0; i < tab.length; i++) {
       
        	  
        	  for(int j = 0; j < tab.length; j++)

    		  {
    			 System.out.println(tab[j][i]);
    		  
    		  }
         
        }
 
    }
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donnez la dimension de la Matrice : ");
		
		int x = sc.nextInt();
		
		int i, j;
		
		int tab [][]= new int[x][x];
		
		
		
		for(i = 0; i < tab.length; i++)

		{    

		  for(j = 0; j < tab.length; j++)

		  {
			 System.out.println("Entrez un nombre entier pour la rangée " + i + " et la colonne " + j + " : " + i);
			 			
			 tab[i][j]=sc.nextInt();
		  
		  }
		
		  System.out.println(" ");     

		}
		
		
		   oMatrice(tab);
		   
		   tMatrice(tab);
 		
		
	}

}

