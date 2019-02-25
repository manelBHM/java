
public class Tableaux {

	public static void main(String[] args) {
	
		int [] tab = {3, 7, 1, 9, 2, 8, 9, 1, 2, 5};
		tableaux(tab);
		
		int [] tab1 = rempleir1(5);
		tableaux(tab1);
		
		int [] tab2 = rempleir2(10);
		tableaux(tab2);
		
		int [] tab3 = remleir3(5);
		tableaux(tab3);
	}

	 static int[] rempleir1(int nb) {
			int [] tab = new int [nb];
			
			for (int i=0; i<nb; i++) {
				tab [i]=i;
			}
			return tab;
		}
	 
	

       static int[] rempleir2(int nb) {
    	int [] tab = new int [nb];
    	
    	for (int i=5; i<nb; i++) {
    		tab[i]=i;
    	}
		return tab;
	}

       static int[] remleir3(int nb) {
    		int [] tab = new int [nb];
    		
    		for ( int i=1; i<tab.length; i++) {
    			tab [i]=tab.length-1;
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

	private static void afficher(int[] tab) {
		for (int i=0; i<tab.length; i++) {
			
		}
		System.out.println("{3, 7, 1, 9, 2, 8, 9, 1, 2, 5}");
	}

	private static void operation1(int[] tab) {
		int nb = 0;
		for (int i=0; i<tab.length; i++) {
			if(tab[i] == 9) {
				nb++;
			}
		}
		System.out.println("Il y a " + nb + " éléments de valeur 9 dans le tableau");
	}

	private static void operation2(int[] tab) {
	int nb = 0;
	for (int i=0; i<tab.length; i++) {
		if(tab[i]>4 || (tab[i]>2)) {
			nb++;
			
		}
	}
	System.out.println("le plus grand que 4" + nb + "le plus petit que 2");
	}

	private static void operation3(int[] tab) {
	
		int somme = 0;
		for (int i=0; i<tab.length; i++) {
			somme = somme+tab[i];
		}
		System.out.println("le somme" + somme);
	}

	private static void operation4(int[] tab) {
		double moyen = 0;
		double somme = 0;
		for ( int i=0; i<tab.length; i++) {
			somme= somme+tab[i];
			
		}
		 System.out.println("le moyenne" + somme);
	}

	private static void operation5(int[] tab) {
		int max = tab[0];
		for (int i=0; i<tab.length; i++) {
			if (tab[i]>max) {
				max=tab[i];
			}
		}
		 System.out.println("le plus grand" + max);
	}




	
	
	
	

}
