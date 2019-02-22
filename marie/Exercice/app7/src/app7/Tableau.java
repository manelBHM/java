package app7;

import java.util.Arrays;

public class Tableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tab = {3, -8, 14, 4};
		tableau(tab);
		
	}

	static void afficher(int[] tab) {
		System.out.println(Arrays.toString(tab)+"\n");
	}
	
	static void tableau(int[] tab) {
		afficher(tab);
		operation1(tab);
		operation2(tab);
	}
	
	static void operation1(int[] tab) {
		int nb=0;
	for(int i=0; i<tab.length; i++) {
		nb++;
	}
	System.out.println("Longueur du tableau = " + nb);
	}
	
	static void operation2(int[] tab) {
		int somme=0;
		for(int i=0; i<tab.length; i++) {
			somme+=tab[i];
		}
		System.out.println("Somme du tableau = " + somme);
	}
}
