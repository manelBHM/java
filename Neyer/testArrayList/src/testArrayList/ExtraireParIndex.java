package testArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ExtraireParIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> etudiants = new ArrayList<String>();
		Iterator<String> itr = etudiants.iterator();
		
		etudiants.add("Francois");
		etudiants.add("Juliette");
		etudiants.add("Daniel");
		etudiants.add("Jack");
		etudiants.add("Patick");
		etudiants.add("Frank");
		
		System.out.println(etudiants);
		
		etudiants.remove(0);
		etudiants.remove(3);
		
		System.out.println(etudiants);

		etudiants.remove(2);
		
		for(String str : etudiants) {
			System.out.println(str);
		}
		
		
		
		/*while (itr.hasNext()) {
		      String element = itr.next();
		      System.out.print(element + " ");
		    }*/	
		

	}

}
