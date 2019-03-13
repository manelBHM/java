package co.simplon.ExerciceMavenPokemon;

import java.util.ArrayList;

public class TestPokemon {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Pokemon> poke1 = new ArrayList<Pokemon>();	

		Pokemon p1 = new Pokemon("Marisson", 60);//on crée des pokemons
		Pokemon p2 = new Pokemon("Grenoussie",60);
		Pokemon p3 = new Pokemon("Roussil",80);


		poke1.add(p1);//on ajoute le pokemon p1 dans la liste de Pokemon
		poke1.add(p2);
		poke1.add(p3);

		System.out.println("Il y a "+Pokemon.nbPokemon+" pokemons dans l'arène !!!"+"\n");
		p1.presenterLePokemon();
		p1.auCombat(p2);
		p1.auCombat(p3);

		p2.presenterLePokemon();
		p2.auCombat(p1);
		p2.auCombat(p3);

		p3.presenterLePokemon();
		p3.auCombat(p1);
		p3.auCombat(p2);
		
		System.out.println("-----------------------------");
		
		/*for(int i = 0 ; i < poke1.size() ; i++) {
			
			Pokemon combattant1 = poke1.get(i);//recupère le pokemon
			
			for(int j = 0 ; j < poke1.size() ; j++) {
				
				Pokemon combattant2 = poke1.get(j);
				
				if ( i != j ) {
					
				combattant1.auCombat(combattant2);
					
				}	
			}
		}*/
	}
}
