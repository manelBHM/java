package app4;

import java.util.Arrays;

public class Tableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tab = {6, 1, 8, 7, 2, 3, 9, 10, 5, 4};
		tableau(tab);
		
		int[] tab1 = remplir1(5);
		tableau(tab1);
		
		int[] tab2 = remplir2(10);
		tableau(tab2);
		
		int[] tab3 = remplir3(5);
		tableau(tab3);
	}


	private static int[] remplir1(int nb) {
		int[] tab1 = new int[nb];
		for(int i=0; i<tab1.length; i++) {
			tab1[i]=i;
		}
		return tab1;
	}
	
	private static int[] remplir2(int nb) {
		int[] tab2 = new int[nb];
		for(int i=0; i<tab2.length; i++) {
			tab2[i]=i;
		}
		return tab2;
	}

	private static int[] remplir3(int nb) {
		int[] tab3 = new int[nb];
		for(int i=0; i>tab3.length; i--) {
			tab3[i]=i;
		}
		
		return tab3;
	}


	private static void tableau(int[] tab) {
		afficher(tab);
		operation1(tab);
		operation2(tab);
		operation3(tab);
		operation4(tab);
		operation5(tab);
	}

	static void afficher(int[] tab) {
		System.out.println(Arrays.toString(tab)+"\n");
		
	}

	static void operation1(int[] tab) {
		int nb=0;
		for(int i=0; i<tab.length; i++) {
			if(nb==9) {
			nb++;
			}
		}
		System.out.println("Il y a " + nb + " element de valeur 9 dans le tableau");
	}
		
	static void operation2(int[] tab) {
	int nb=0;
	for(int i=0; i<tab.length; i++) {
		if((tab[i]>4) || (tab[i]<2)) {
			nb++;
		}
	}
		
	}

	static void operation3(int[] tab) {
		int somme=0;
		for(int i=0; i<tab.length; i++) {
			somme+=tab[i];
		}
		System.out.println(somme);
	}

	static void operation4(int[] tab) {
		double somme=0;
		double moyenne=0;
		for(int i=0; i<tab.length; i++) {
			somme+=tab[i];
		}
		System.out.println("La moyenne de ce tableau est de " + (moyenne=somme/tab.length));
	}

	static void operation5(int[] tab) {
		int max=tab[0];
		for(int i=0; i<tab.length; i++) {
			if(tab[i]>max) {
				max=tab[i];
			}
		}
		System.out.println("La valeur maximale de ce tableau est " + max + "\n");
	}

}
