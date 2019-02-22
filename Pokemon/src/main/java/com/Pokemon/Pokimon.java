package com.Pokemon;

public class Pokimon {
	// private int numbOfPokemon = 0;
	private String nom;
	private int pointVie;
	private Attaque attaque1;
	private Attaque attaque2;

	public Pokimon(String nom, int pointVie, Attaque attaque1, Attaque attaque2) {
		this.nom = nom;
		this.pointVie = pointVie;
		this.attaque1 = attaque1;
		this.attaque2 = attaque2;
		// numbOfPokemon++;

	}

	public Attaque getAttaque1() {
		return attaque1;
	}

	public void setAttaque1(Attaque attaque1) {
		this.attaque1 = attaque1;
	}

	public Attaque getAttaque2() {
		return attaque2;
	}

	public void setAttaque2(Attaque attaque2) {
		this.attaque2 = attaque2;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPointVie() {
		return pointVie;
	}

	public void setPointVie(int pointVie) {
		this.pointVie = pointVie;
	}

	// public static Comparator<Pokimon> idCompare = new Comparator<Pokimon>() {
	//
	// public int compare(Pokimon s1, Pokimon s2) {
	// int id1 = s1.getPointVie();
	// int id2 = s2.getPointVie();
	//
	// return id1 - id2;
	// }
	// };
	//
	// public void combat(Pokimon a) {
	// if (this.pointVie < a.getPointVie()) {
	// System.out.println("Je m'appel " + this.nom);
	// System.out.println("J'ai " + this.pointVie + " point de vie");
	// System.out.println("Je suis " + this.nom + " je suis plus fort que " +
	// a.nom);
	//
	// } else if (this.pointVie > a.getPointVie()) {
	// System.out.println("Je m'appel " + this.nom);
	// System.out.println("J'ai " + this.pointVie + " point de vie");
	// System.out.println("Je suis " + this.nom + "suis plus faible que " +
	// a.nom);
	// } else {
	// System.out.println("Les deux adversaire sont egaux ");
	// }
}
