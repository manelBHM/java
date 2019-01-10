import java.util.Arrays;
public class Tableau {
	
	public static void main(String[] args){
		
		int tab[]= {2, 34, 56, 64, 3, 65, 76, 56, 8, 15};
		   tableau(tab);
		   
	 int[] tab1 = remplir1(5);
	        tableau(tab1);
	}

	private static void tableau(int[] tab) {
		// TODO Auto-generated method stub
		
	}

	static int[] remplir1(int nb) {
        int[] tab = new int[nb];
     for (int i= 0; i<tab.length;i++) {
    	 tab[i] = i;
    	 //System.out.print(tab[i]);
     }
        return tab;
    }
	
	static int[] remplir2(int nb) {
        int[] tab = new int[nb];
     for (int i= 0; i<tab.length;i++) {
    	 tab[i] = i+5;
    	// System.out.print(tab[i]);
     }
        return tab;
    }
	
	static int[] remplir3(int nb) {
        int[] tab = new int[nb];
     for (int i= 1; i<tab.length;i++) {
    	 tab[i] = - i;
    	 //System.out.print(tab[i]);
     }
        return tab;
    }


    static void tableaux(int[] tab) {
        afficher(tab);
        operation1(tab);
        operation2(tab);
        // operation3(tab);
        // operation4(tab);
       // operation5(tab);
    }
    
    
    static void afficher(int[] tab) {
      System.out.print(Arrays.toString(tab) + "\n");  }
    
    static void operation1(int[] tab ) {
    	int nb = 0;
    	for (int i = 0; i <tab.length; i++) {
    	if (i == 9); {
    		nb++;
    	}

    	}
    	System.out.println("Il y a " + nb + " éléments de valeur 9 dans le tableau");
    }
    
    static void operation2(int[] tab ) {
    	int nbr = 0;
    	for (int i = 0; i <tab.length; i++) {
    	if (i>4 || i<2); {
    		nbr++;
    	}
    	} 
    	System.out.println("Il y a " + nbr + " plus petit que 2 ou plus grand que 4");
    }
    
    static void operation3(int[] tab ) {
    	int somme = 0;
    	for (int i = 0; i <tab.length; i++) {
    		somme+= tab[i];
    	} 
    	System.out.println("Il y a " + somme + " plus petit que 2 ou plus grand que 4");
    }
    
    static void operation4(int[] tab ) {
    	int moyenne= 0;
    	for (int i = 0; i <tab.length; i++) {
    		somme+= tab[i];
    	} 
    	System.out.println("Il y a " + moyenne + " plus petit que 2 ou plus grand que 4");
    }
    	
    }
 
	

