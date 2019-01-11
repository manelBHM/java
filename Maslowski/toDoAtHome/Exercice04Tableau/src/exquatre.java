
public class exquatre {
	
	static void afficher(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}
	
	static void ope1(int[] tab) {
		int nb = 0;
		for (int i = 0; i < tab.length; i++) {
			if(tab[i] == 0) {
				nb++;
			}
		}
		System.out.println("Il y a " + nb + " chiffre(s) 9 dans le tableau.");
	}
	
	static void ope2(int[] tab) {
		int nb = 0;
		for (int i = 0; i < tab.length; i++) {
			if(tab[i] < 2 || tab[i] > 4) {
				nb++;
			}
		}
		System.out.println("Il y a " + nb + " chiffre(s) plus petit(s) que 2 OU plus grand(s) que 4.");
	}
	
	static void somme(int[] tab) {
		int somme = 0;
		int i = 0;
		//somme = somme + Tab1[i];
		somme += tab[i];
		System.out.println("La somme des valeurs du tableau est " + somme + ".");
	}
	
	static void moyenne(int[] tab) {
		int somme = 0;
		int i = 0;
		somme += tab[i];
		double moyenne = somme / tab.length;
		System.out.println("La moyenne des valeurs du tableau est " + moyenne + ".");
	}
	
	static void max(int[] tab) {
		int max = tab[0];
		for(int i = 0; i < tab.length; i++) {
			if(tab[i] > max) {
				max = tab[i];
			}
			
		}
		System.out.println("la valeur max du tableau est " + max + ".\n");
	}
	
	static int[] remplir1(int nb) {
		int[] tab = new int[nb];
		for(int i = 0; i < tab.length; i++) {
			tab[i] = i;
		}
		return tab;
	}
	
	static int[] remplir2(int nb) {
		int[] tab = new int[nb];
		for(int i = 5; i < tab.length; i ++) {
			tab[i] = i;
		}
		return tab;
	}
	
	static int[] remplir3(int nb) {
		int[] tab = new int[nb];
		for(int i = 5; i < tab.length; i --) {
			tab[i] = i;
		}
		return tab;
	}
	
	static void tableaux(int[] tab) {
        afficher(tab);
        ope1(tab);
        ope2(tab);
        somme(tab);
        moyenne(tab);
        max(tab);
    }
	
	

	public static void main(String[] args) {
		
		int[] tab = {3, 7, 1, 9, 2, 8, 9, 1, 2, 5};
		tableaux(tab);
		 
        int[] tab1 = remplir1(5);
        tableaux(tab1);
 
        int[] tab2 = remplir2(10);
        tableaux(tab2);
 
        int[] tab3 = remplir3(5);
        tableaux(tab3);
	}

}
