package appPokemon.pokemon;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {       
       List<Pokemon> pokemons= new  ArrayList<Pokemon>();
       pokemons.add(new Pokemon("Loup", 100));
       pokemons.add(new Pokemon("Lion", 250));
       pokemons.add(new Pokemon("Tigre", 300));
       pokemons.add(new Pokemon("coque", 100));
       
       System.out.println(pokemons.get(0).getConunt());
       
       System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"); 
       System.out.println(pokemons.get(0).toString());
       for (int i = 0; i < pokemons.size(); i++) {
			if(pokemons.get(0)!=pokemons.get(i)) {
				pokemons.get(0).afficheResult(pokemons.get(i));
			}
		}
	
      
    System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"); 
      System.out.println(pokemons.get(1).toString());
              for(int i = 0; i < pokemons.size(); i++) {
			if(pokemons.get(1)!= pokemons.get(i)) {
				pokemons.get(1).afficheResult(pokemons.get(i));
			}
	}
      
      System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"); 
      System.out.println(pokemons.get(2).toString());
      for (int i = 0; i < pokemons.size(); i++) {
			if(pokemons.get(2)!= pokemons.get(i)) {
				pokemons.get(2).afficheResult(pokemons.get(i));
			}
	}
      
      System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"); 
      System.out.println(pokemons.get(3).toString());
      for (int i = 0; i < pokemons.size(); i++) {
			if(pokemons.get(3)!= pokemons.get(i)) {
				pokemons.get(3).afficheResult(pokemons.get(i));
			}
	}
      
      
    }
}
