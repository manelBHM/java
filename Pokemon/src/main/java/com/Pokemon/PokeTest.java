package com.Pokemon;

import java.util.ArrayList;

public class PokeTest {

	public static void main(String[] args) {

		Attaque lightinig = new Attaque("lightinig", 65);
		Attaque powerLight = new Attaque("PowerLight", 45);
		Attaque pistolet = new Attaque("pistolet a eau", 55);
		Attaque hydro = new Attaque("hydrocanon", 70);
		Attaque attaquedirect = new Attaque("attaque-direct", 25);
		Attaque psycho = new Attaque("Psycho", 60);
		Attaque ultraLaser = new Attaque("Ultra-Laser", 80);
		Attaque griffe = new Attaque("Griffe", 35);

		Pokimon pikatchu = new Pokimon("Pikatchu", 160, lightinig, powerLight);
		Pokimon raitchu = new Pokimon("Raitchu", 200, pistolet, hydro);
		Pokimon nidoqueen = new Pokimon("Nidoqueen ", 200, attaquedirect, psycho);
		Pokimon nidoking = new Pokimon("Nidoking", 180, ultraLaser, griffe);

		ArrayList<Pokimon> list = new ArrayList<Pokimon>();
		list.add(pikatchu);
		list.add(raitchu);
		list.add(nidoqueen);
		list.add(nidoking);

		RunPokemon pokemonGo = new RunPokemon();
		pokemonGo.run(list);
	}

}
