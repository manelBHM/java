package com.lesson.app4;

public class Tables {
	
	//Un tableau tab est construit et rempli de 10 valeurs. Le tableau est ensuite envoyé en
	//paramètre à la méthode auxiliaire tableaux qui, à son tour, appelle 6 méthodes
	//auxiliaires en leur envoyant le même tableau en paramètre
	
	//Un deuxième tableau tab1 est construit par l'intermédiaire de la méthode auxiliaire
	
	
	
	
	

	public static void main(String[] args) {
		 int[] tab = {3,7,1,9,2,8,9,1,2,5};
		 tableaux(tab);
		 
		 int[] tab1 = remplir1(5);
		 tableaux(tab1);
		 
		 
		 int[] tab2 = remplir2(10);
		 tableaux(tab2);
		 
		 
		 
		 int[] tab3 = remplir3(5);
		 tableaux(tab3);
		 
		 
		 
		 

	}//fin main
	
	
	public static void tableaux(int[] tab) {
		showTable(tab);
		operation1(tab);
		operation2(tab);
		operation3(tab);
		operation4(tab);
		operation5(tab);
 
	}

	
	//affichage du plus grand élément du tableau.
	private static void operation5(int[] tab) {
		int mx = tab[0];
		for(int i =0;i<tab.length;i++) {
			if(mx < tab[i]) {
				mx = tab[i];
			}
		}
		System.out.println("the biggest number is : "+mx);	
	}
	
	

	//affichage de la moyenne arithmétique de tous les d'éléments du tableau. La moyenne arithmétique est
	//la somme de tous les éléments divisé par le nombre
	//d'éléments. Faites attention à afficher le résultat sous forme de double.
	private static void operation4(int[] tab) {
		double sum = 0.0,moy = 0.0;
		for(int i =0;i<tab.length;i++) {
			sum += tab[i];
		}
		moy=sum/tab.length;
		System.out.println("the moyenne is :"+moy);
	}

	//affichage de la somme de tous les éléments du tableau.
	private static void operation3(int[] tab) {
		int sum=0;
		for(int i =0;i<tab.length;i++) {
			sum+=tab[i];
		}
		System.out.println("the sum is :"+sum);
	}

	//affichage du nombre d'éléments qui sont plus grands que 4 ou plus petits que 2.
	private static void operation2(int[] tab) {
		int n =0;
		for(int i =0;i<tab.length;i++) {
			if(tab[i] > 4 || tab[i] < 2) {
				n++;
			}
		}
		System.out.println("there are  :"+n+" :"+"numbers that are greater than 2 and less than 2");
	}

	//calcule et affiche le nombre d'éléments de valeur 9.
	private static void operation1(int[] tab) {
		int n =0;
		for(int i =0;i<tab.length;i++) {
			if(tab[i]==9) {
				n++;
			}
		}
		System.out.println("there are  :"+ n +" : " + "elements of number 9 in this table.");
	}

	//afficher la table
	private static void showTable(int[] tab) {
		System.out.println();
		for(int i =0;i<tab.length;i++) {
			System.out.print(tab[i]+" ");
		}
		System.out.println();
	
	}
	
	
	//remplir1. Les éléments sont initialisés en ordre croissant de 0 à 4. Ensuite, la méthode auxiliaire tableaux 
	//est appelée pour effectuer les mêmes opérations sur ce deuxième
	public static int[] remplir1(int tab) {
		int[] t = new int[tab];
		for(int i =0;i<t.length;i++) {
			t[i]+=i;
			
		}
		//System.out.print();
		return t;
	}
	
	//remplissage du tableau en ordre croissant à partir de 5.
	public static int[] remplir2(int tab) {
		int[] t = new int[tab];
		for(int i =0;i<t.length;i++) {
			t[i]+=i+5;
			
		}
		
		return t;
	}
	
	//remplissage du tableau en ordre décroissant de nb à 1 où nb est le nombre d'éléments du tableau.
	public static int[] remplir3(int tab) {
		int[] t = new int[tab];
		for(int i =0;i<t.length;i++) {
			t[i] = t[i]+t.length -i;
			
		}
		
		return t;
	}
	
	
	

}
