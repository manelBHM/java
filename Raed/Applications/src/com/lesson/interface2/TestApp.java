package com.lesson.interface2;

import java.util.Date;

public class TestApp {

	public static void main(String[] args) {
		
		
		Personne p1 = new Personne("Mohamed","Raed", new Date("15/06/1990"), 2000, new Profile("DM","Directeur manager"));
		
		Personne p2 = new Personne("bukhary","Ali", new Date("11/11/2000"), 1000, new Profile("EM","Emoployeur"));
		
		System.out.println();
		p1.affiche();
		p1.calculerSalaire();
		 
		System.out.println();
		p2.affiche();
		p2.calculerSalaire();
		 

	}

}
