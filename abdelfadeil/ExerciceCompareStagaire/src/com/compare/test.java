package com.compare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class test {

	public static void main(String[] args) {
		List<Stagiaire> stagiaires = new ArrayList<Stagiaire>();
		
		stagiaires.add(new Stagiaire("Eric", 28, 4));
		stagiaires.add(new Stagiaire("Laurant", 24, 2));
		stagiaires.add(new Stagiaire("François", 44, 3));
		stagiaires.add(new Stagiaire("Emmanuelle", 33, 1));
		stagiaires.add(new Stagiaire("Fayd", 23, 7));
		stagiaires.add(new Stagiaire("Dany", 37, 5));
		stagiaires.add(new Stagiaire("Donald", 30, 6));
		stagiaires.add(new Stagiaire("Anne", 50, 8));
		
		Iterator<Stagiaire> its = stagiaires.iterator();
		System.out.println("Liste des stagiaires ");
		while (its.hasNext()) {
			System.out.println(its.next());
			
		}
		System.out.println("***********************************");
		System.out.println("****************Tri par age en ordre ascend ****************");
		Collections.sort(stagiaires, Stagiaire.ageCompare);
		for (Stagiaire stagiaire : stagiaires) {
			System.out.println(stagiaire);
		}
		
		System.out.println("****************Tri par age en ordre descend ****************");
		Collections.sort(stagiaires, Stagiaire.ageDesCompare);
		for (Stagiaire stagiaire : stagiaires) {
			System.out.println(stagiaire);
		}
		
		System.out.println("***********************************");
		System.out.println("****************Tri par nom  en ordre asscendant ****************");
		Collections.sort(stagiaires, Stagiaire.monCompare);
		for (Stagiaire stagiaire : stagiaires) {
			System.out.println(stagiaire);
		}

		System.out.println("***********************************");
		System.out.println("****************Tri par nom en ordre desscendant ****************");
		Collections.sort(stagiaires, Stagiaire.monDesCompare);
		for (Stagiaire stagiaire : stagiaires) {
			System.out.println(stagiaire);
		}
		
		System.out.println("***********************************");
		System.out.println("****************Tri par id****************");
		
		Collections.sort(stagiaires, Stagiaire.idCompare);
		for (Stagiaire stagiaire : stagiaires) {
			System.out.println(stagiaire);
		}
		

	}

}
