package com.lesson.app7;

 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trace {
	
		//Ecrire une application tableau qui pourrait afficher la trace ci dessous :
		//Le tableau initial : (3, -8, 14, 4)
		//longueur du tableau = 4
		//somme du tableau = 13
		//indice du max du tableau = 2
		//Après ajout de 20 :
		//le tableau initial est : (3, -8, 14, 4)
		//et le résultat est : (3, -8, 14, 4, 20)

	 
	//Le tableau initial
	public static void showTable(Integer[] tab) {
	 
		for(int i= 0;i<tab.length;i++) {
		 System.out.print(" "+tab[i]);
	 
		}
		System.out.println();
		 
	}
	
	//somme du tableau
	public static void somme(Integer[] tab) {
		int sum =0;
		for(int i= 0;i<tab.length;i++) {
			sum+=tab[i];
		}
		System.out.println("the sum is :"+sum);
	}
	
	// 

	
	
	
	//indice du max du tableau
	public static void indice(Integer[] tab) {
		int mx = tab[0];
		for(int i= 0;i<tab.length;i++) {
			if(mx < tab[i]) {
				mx = tab[i];
			}
		}
		System.out.println("indice du max du tableau: "+Arrays.asList(tab).indexOf(mx));
	}
	
	
	
 
	
	
	//Après ajout de 20
	public static void add() {
	 
		int[] tab = {3, -8, 14, 4,20};
		for(int i= 0;i<tab.length;i++) {
			System.out.print(tab[i]+" ");
		}
 
	 
	}
	
	
	//longueur du tableau
	public static void longeur(Integer[] tab) {
		int lg = tab.length;
		System.out.println("longueur du tableau :"+lg);
 
	}
	
	
	public static void myTables(Integer[] tab) {
		showTable(tab);
		somme(tab);
		indice(tab);
		//add1(tab);
		longeur(tab);
		add();
	 
		
	}
	public static void main(String[] args) {
		 
		
		
		Integer[] tab = {3, -8, 14, 4};
	 
		myTables(tab);
	
		

	}

}
