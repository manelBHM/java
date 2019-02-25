package co.simplon.POKEMON;

import java.util.LinkedList;

public class Pokemon {
	
	
	
	public static int nombre;
	String nom;
	int PV;
	@Override
	public String toString() {
		return "Pokemon [nom=" + nom + ", PV=" + PV + "]";
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPV() {
		return PV;
	}
	public void setPV(int pV) {
		PV = pV;
	}
	public Pokemon(String nom, int pV) {
		super();
		this.nom = nom;
		PV = pV;
		nombre++;
		
	}
	
	
public void Combat(Pokemon x, Pokemon y) {
		
		if(x.getPV()>y.getPV()) {
			System.out.println(x.getNom() + " contre " + y.getNom() + ":" + x.getNom() + " Remporte le combat");
		}
		
		else if(x.getPV()<y.getPV()) {
			System.out.println(x.getNom() + " contre " + y.getNom() + ":" + y.getNom() + " Remporte le combat");


			
		}
		else {
			System.out.println(x.getNom() + " contre " + y.getNom() + ": Egalité");
		}
		
	}


public void Combat2(Pokemon y) {
	
	if(this.getPV()>y.getPV()) {
		
		System.out.println(this.getNom() + " contre " + y.getNom() + ":" + this.getNom() + " Remporte le combat");
	}
	
	else if(this.getPV()<y.getPV()) {
		System.out.println(this.getNom() + " contre " + y.getNom() + ":" + y.getNom() + " Remporte le combat");


		
	}
	else {
		System.out.println(this.getNom() + " contre " + y.getNom() + ": Egalité");
	}
	
}





public void Afficher() {
	
	System.out.println("il y a " + nombre + " Pokemons");
	
	
}

}
