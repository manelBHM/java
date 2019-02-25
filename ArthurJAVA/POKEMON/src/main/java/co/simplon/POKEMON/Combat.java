package co.simplon.POKEMON;

import java.util.LinkedList;

public class Combat{

	


	public void Run(LinkedList<Pokemon> liste) {
		for (int i = 0; i < liste.size(); i++) {
			Pokemon x = liste.get(i);
			System.out.println("Je m'appelle " + x.getNom());
			System.out.println("J'ai " + x.getPV() + " points de vie");
			System.out.println();
			
			
			
			 for(int j = 1; j<liste.size();j++) {
				 Pokemon y = liste.get(j);
				 if(x!=y) {
					 x.Combat2(y);
					 System.out.println("");


				 }
			 }
			}
		
      
	}
}
