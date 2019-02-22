package com.lesson.one;

import java.util.ArrayList;

public class CollectionsB {

	public static void main(String[] args) {
 
		
		ArrayList<String> etudiants = new ArrayList<String>();
		
		etudiants.add("francois");
		etudiants.add("Juliette");
		etudiants.add("Daniel");
		etudiants.add("Jack");
		etudiants.add("Patrick");
		etudiants.add("Frank");
		
		//displaying elements
		System.out.println(etudiants);
		
		//removing Francois and Patrick
		etudiants.remove(0);
		etudiants.remove(3);
		
		
		//displaying elmentens
		System.out.println(etudiants);
		
		
		
		//removing 3rd element
		etudiants.remove(2);
		
		//iterating throught ArrayList
		for(String s:etudiants) {
			System.out.println(s);
		}
		
		
		
		
		
	}

}
