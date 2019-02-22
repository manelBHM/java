package com.project.inter;

import java.util.Date;

public class Profil {
	public String code;
	public String libelle;

	public Profil(String code, String libelle) {
		this.code = code;
		this.libelle = libelle;
	}

	public static void main(String[] args) {

		Personne p1 = new Personne("King", "Samba", 3000, new Date(), new Profil(" Directeur Generale ", " DG "));
		Personne p2 = new Personne("Princese", "Olga", 2500, new Date(), new Profil(" Employer ", " EM "));

		p1.addPercent();
		p1.showCase();

		p2.addPercent();
		p2.showCase();
	}

}
