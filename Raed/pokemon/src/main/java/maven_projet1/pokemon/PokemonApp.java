package maven_projet1.pokemon;

import java.util.ArrayList;
import java.util.List;

public class PokemonApp {

	public static void main(String[] args) {
		

		Pokemon p1 = new Pokemon("Regice",80);
		Pokemon p2 = new Pokemon("Maganon",75);
		Pokemon p3 = new Pokemon("Métalosse",80);
		
		Pokemon.nomPks();
		 
	 
 
	 
		p1.battle(p2);
		p1.battle(p3);
		System.out.println();

		p2.battle(p1);
		p2.battle(p3);
		System.out.println();

		p3.battle(p1);
		p3.battle(p2);
		System.out.println();
	 
		
		
		
		
		
		
		
		
		
	}

	 



}
