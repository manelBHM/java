import java.util.Arrays;

class Tableaux {
    public static void main(String args[]) {
        // Construction d'un tableau:
        int[] tab = {3, 7, 1, 9, 2, 8, 9, 1, 2, 5};
        // Opérations sur le tableau:
        tableaux(tab);
 
        // La même chose pour d'autres tableaux:
        int[] tab1 = remplir1(5);
        tableaux(tab1);
 
        int[] tab2 = remplir2(10);
        tableaux(tab2);
 
        int[] tab3 = remplir3(5);
        tableaux(tab3);
    }
 
    /**
     * Cette méthode retourne un tableau int[] de nb éléments
     * initialisés en ordre croissant de 0 à nb-1.
     * @param nb
     * @return
     */
    static int[] remplir1(int nb) {
        int[] tab = new int[nb];

        
        for (int i=0; i<nb;i++) {
        	tab[i] = i;
        }
        
        return tab;
    }
 
    /**
     * Cette méthode retourne un tableau int[] de nb éléments
     * initialisés en ordre croissant à partir de 5.
     * @param nb
     * @return
     */
    static int[] remplir2(int nb) {
        int[] tab = new int[nb];
        
        
        for (int i=0;i<tab.length;i++) {
        	
        	tab[i] = i+5;
        	
        }
        
        return tab;
    }
 
    /**
     * Cette méthode retourne un tableau int[] de nb éléments
     * initialisés en ordre décroissant de nb à 1.
     * @param nb
     * @return
     */
    static int[] remplir3(int nb) {
        int[] tab = new int[nb];

        for (int i = 0; i<nb; i++) {
        	
        	tab[i] = nb-i;
        }
        
        return tab;
    }
 
    static void tableaux(int[] tab) {
        afficher(tab);
        operation1(tab);
        operation2(tab);
        operation3(tab);
        operation4(tab);
        operation5(tab);
    }
 
    /**
     * Cette méthode affiche tous les éléments du tableau reçu en
     * paramètre sur une même ligne. Les éléments sont séparés par
     * deux espaces.
     * @param tab
     */
    static void afficher(int[] tab) {
    	
        //for (int i = 0; i < tab.length; i++) {
    	System.out.println("\n");
        System.out.println(Arrays.toString(tab));
        } 
        //System.out.println();    // Saut de ligne à la fin de l'affichage
    //}
 
    /**
     * Cette méthode calcule et affiche le nombre d'éléments de valeur
     * 9 dans le tableau. La variable nb sert à compter les éléments
     * trouvés. Elle est initialisée à 0 et incrémentée dans la boucle
     * qui parcourt le tableau chaque fois que l'on trouve un 9.
     * @param tab
     */
    static void operation1(int[] tab) {
		int x=0;
		
		for (int i =0; i<tab.length; i++) {
			if (9==tab[i]) {
				x++;
			}
			
		}
		

        
        System.out.println("Il y a " + x + " éléments de valeur 9 dans le tableau");
    }
 
    /**
     * Cette méthode calcule et affiche le nombre d'éléments qui sont
     * plus grand que 4 OU plus petit que 2.
     * @param tab
     */
    static void operation2(int[] tab) {

    	int min = 0;
		for (int i =0; i<tab.length; i++) {
			if (tab[i]>4 || tab[i]<2) {
				min++;
				}
		}
    
		System.out.println("il y a " + min + " Elements plus grands que 4 et plus petit que 2");

    }
 
    /**
     * Cette méthode calcule et affiche le somme de tous les éléments du tableau.
     * @param tab
     */
    static void operation3(int[] tab) {
        int somme = 0;
        for (int i=0;i<tab.length;i++) {
        	
        	somme = somme + tab[i];
        	
        }
    System.out.println("La somme est de : " + somme);
    }
 
    /**
     * Cette méthode calcule et affiche la moyenne arithmétique de
     * tous les éléments du tableau.
     * @param tab
     */
    static void operation4(int[] tab) {

        double moy = 0.0, som = 0.0;
		
		for (int i =0; i<tab.length; i++) {
			som = som + tab[i];
		}
		moy = som/tab.length;
		
		System.out.println("la moyenne est de " + moy);
    }
 
    /**
     * Cette méthode calcule et affiche le plus grand élément du tableau.
     * @param tab
     */
    static void operation5(int[] tab) {
        
    	{int max = tab[0];
		for (int i =0; i<tab.length; i++) {
			if (max<tab[i]) {
				max=tab[i];
			}
			
			}
    System.out.println("l'élément le plus grand est " + max);
    }
    	
   }
    
}