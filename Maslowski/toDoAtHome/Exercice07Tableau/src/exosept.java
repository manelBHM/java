import java.util.Arrays;
import java.util.Scanner;

public class exosept {
	
	public static void afficher(Integer[] tab) {
		for(int i = 0; i < tab.length; i++) {
		System.out.print(tab[i] + " ");
		}
		System.out.println();
	}
	
	public static void longueur(Integer[] tab) {
		int taille = 0;
		for(int i = 0; i < tab.length; i++) {
			taille++;
		}
		System.out.println("La longueur du tableau est de " + taille);
	}
	
	public static void somme(Integer[] tab) {
		int somme = 0;
		for(int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}
		System.out.println("La somme du tableau est de " + somme);
	}
	
	public static void max(Integer[] tab) {
		int max = tab[0];
		int i;
		for( i = 0; i < tab.length-1; i++) {
			if(max < tab[i]) {
				max = tab[i];
			}
		}
		System.out.println("La valeur max du tableau est " + max + ". Cette valeur se trouve à l'indice " + Arrays.asList(tab).indexOf(max) + ".\n");
	}
	
	public static void ajouter() {
		System.out.print("Ajoutons la valeur '20' à ce tableau. Celà nous donne : ");
		int[] tab = {3, -8, 14, 4,20};
		for(int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]+" ");
		}
	}
	
	
	static void tableaux(Integer[] tab) {
		afficher(tab);
		longueur(tab);
		somme(tab);
		max(tab);
		ajouter();
		}
	
	
	public static void main(String[] args) {
		
		Integer[] tab = {3, -8, 14, 4};
		tableaux(tab);
		
	}
	
	
	
	
}