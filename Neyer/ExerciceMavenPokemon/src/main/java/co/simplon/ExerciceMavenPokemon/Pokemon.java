package co.simplon.ExerciceMavenPokemon;

import java.util.ArrayList;

public class Pokemon {

	String nomPokemon;
	int ptVie;

	static int nbPokemon = 0;

	//ArrayList <Pokemon> poke1 = new ArrayList<Pokemon>();

	public Pokemon (String nomPokemon, int ptVie) {

		this.nomPokemon=nomPokemon;
		this.ptVie=ptVie;

		nbPokemon++;	
	}

	static int affichNbPoke() {
		return nbPokemon;
	}

	public void presenterLePokemon() {
		System.out.println("");

		System.out.println("Le Pokemon "+ nomPokemon + " est prêt pour le combat!");
		System.out.println("Ses points de vie s'élève à "+ ptVie+"!!!");
	}

	/*public void auCombat(Pokemon adversaire) {

		System.out.println("Au combat!");

		if(this.ptVie > adversaire.ptVie) {

			System.out.println(this.nomPokemon+" a terrassé "+adversaire.nomPokemon+" sans pitier!!" );

		}else if(this.ptVie < adversaire.ptVie) {

			System.out.println(adversaire.nomPokemon+" a terrassé "+ this.nomPokemon+" sans pitier!!" );

		}else {

			System.out.println(this.nomPokemon+" et "+ adversaire.nomPokemon+" sont execaut.");

		}
	}*/

	public void auCombat(Pokemon adversaire, ArrayList <Pokemon> lalist){

		System.out.println("Au combat!");

		//for(Pokemon i : ) {

			if(this.ptVie > adversaire.ptVie) {

				System.out.println(this.nomPokemon+" a terrassé "+adversaire.nomPokemon+" sans pitier!!" );

			}else if(this.ptVie < adversaire.ptVie) {

				System.out.println(adversaire.nomPokemon+" a terrassé "+ this.nomPokemon+" sans pitier!!" );

			}else {

				System.out.println(this.nomPokemon+" et "+ adversaire.nomPokemon+" sont execaut.");

			//}
		}
	}
}
