
public class lesTableaux {
	int nb= 0;

	int[] tab = { 3, 7, 1, 9, 1, 2, 5 };
	

	public void tableaux(int[] tab) {
		afficher(tab);
		operation1(tab);
		operation2(tab);
		operation3(tab);
		operation4(tab);
		operation5(tab);

	}
	

	public int [] remplir1(int nb) {
		int [] tab = new int [nb];
		for (int i = 0; i < tab.length; i++) {
          tab[i]= i;
		}
		return tab;

	}
	public int [] remplir2(int nb) {
		int [] tab = new int [nb];
		for (int i = 0; i < tab.length; i++) {
			tab [i]= i+ 5;
		}
		return tab;
	}
	public int [] remplir3(int nb) {
		int [] tab = new int [nb];
		for (int i = 0; i < tab.length; i++) {
			tab [i]= nb-i;
		}
		return tab;
	}

	public void operation1(int[] tab) {
		int coun = 0;
		for (int i = 0; i < tab.length; i++) {
			if((tab[i] < 2) || (tab[i] > 4)){
				coun++;
			}
		}
		System.out.println("Il y a "+coun+" éléments plus grand que 4 ou plus petit que 2 ");

	}

	public void operation2(int[] tab) {
		int coun= 0;
		for (int i = 0; i < tab.length; i++) {
			if(tab [i] == 9) {
				coun++;
			}
		}
		System.out.println("Il y a "+coun+" éléments de valeur 9 dans le tableau");
	}

	public void operation3(int[] tab) {
		int sum= 0;
       for (int i = 0; i < tab.length; i++) {
		sum += tab[i];
	}
       System.out.println("la somme des éléments du tableau est "+sum);
	}

	public void operation4(int[] tab) {
		int sum=0, i;
		double  moyen;
		for (i = 0; i < tab.length; i++) {
			sum+= tab[i];
		}
		moyen = sum/i;
        System.out.println("la moyenne arithmétique de tous les d'éléments du tableau est "+ moyen);
	}

	public void operation5(int[] tab) {
		int max= 0,i;
      for (i = 0; i < tab.length; i++) {
    	  max = tab[0];
		if(tab[i] > max) {
			max= tab[i];
		}
	}
      System.out.println("Le plus grand élément du tableau vaut " +max);
	}
	public void afficher(int[] tab) {
		System.out.println("\n"+"****************"); 
        	for (int i = 0; i < tab.length; i++) {
            	System.out.print(tab[i]+"  ");
			}
       
       
        System.out.println("\n"+"****************"); 
    }
}
