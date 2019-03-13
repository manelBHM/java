package com.stages;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class StagiaireApp {

	
	
	public static void main(String[] args) {
	 
		ArrayList<Stagiaire> st = new ArrayList<Stagiaire>();
		st.add(new Stagiaire(225,"Jean.L",25));
		st.add(new Stagiaire(100,"Franck.D",27));
		st.add(new Stagiaire(220,"Alain.J",20));
		st.add(new Stagiaire(150,"Victor.T",22));
	
		System.out.println("List orginal");
		System.out.print("\n"+st.toString()); //toString is not needed since we have declared it in our Stagiaire Class, it will be called Auto
		
		
		System.out.println();
		Collections.sort(st, Stagiaire.idCo);
		System.out.println("List triees ascending\n");
		for(Stagiaire e:st) {
			System.out.print(e);
		}
		
		System.out.println();
		Collections.sort(st, Stagiaire.idCo2);
		System.out.println("List descending\n");
		for(Stagiaire e:st) {
			System.out.print(e);
		}
		
		//Collections.sort(st, Collections.reverseOrder()); //this works it we have a simple List which is not instantiated from another class
		//System.out.println(st);
 
		System.out.println();
		System.out.println("sorting by names");
		Collections.sort(st, Stagiaire.nom);
		for(Stagiaire n:st) {
			System.out.print(n);
		}
		
 
	}

}
