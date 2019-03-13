package com.lesson.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Souliste {

	
	public static void afficherListe(final String nom, List<String> sousListe) {
		
		int i =0;
		for(String s:sousListe) {
			System.out.format("%s : %2d : %s\n",nom,i,s);
			i++;
		}
		
	}
	public static void main(String[] args) {
		
		List<String> liste = new ArrayList<String>();
		liste.add("1");
		liste.add("2");
		liste.add("3");
		liste.add("4");
		liste.add("5");
		
		List<String> sousliste = liste.subList(0, 4);
		afficherListe("sous liste", sousliste);
		System.out.println("");
		
		sousliste.remove(1);
		afficherListe("liste",liste);
		System.out.println("");
		
		afficherListe("sous liste", sousliste);
		System.out.println("");
 
		
		
		liste.remove(1);
		afficherListe("liste", liste);
		System.out.println("");
	 
 
		afficherListe("sous liste", sousliste); // ERROR : java.util.ConcurrentModificationException
		System.out.println("");
	

		
		
		//System.out.println();
		//Collections.sort(ls,Collections.reverseOrder());
		//System.out.println(ls);
	}

}
