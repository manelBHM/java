package com.inter.project;

import java.util.Date;

public class Profil {

	public String code;
	public String libelle;

	public Profil(String code, String libelle) {
		this.code = code;
		this.libelle = libelle;
	}

	public static void main(String[] args) {
		/*
		 * Personne p1 = new Personne("Leon ", "Bruxelle ", new
		 * Date("14/01/2010"), 4000, new Profil(567, "DG")); Personne p2 = new
		 * Personne("Lea", "Brutch", new Date("14/01/2012"), 3000, new
		 * Profil(687, "EM")); p1.affiche(); p2.affiche();
		 */

		Profil[] profil = new Profil[2];
		profil[0] = new Profil("Employer", "EM");
		profil[1] = new Profil("Directeur General", "DG");

		Personne[] person = new Personne[2];
		person[0] = new Personne("Leon", "Debuche", new Date("14/ 01/ 2013"), 10000, profil[1]);
		person[1] = new Personne("Alexia", "Thomas", new Date("16/02/ 2011"), 8000, profil[1]);

		for (Personne run : person) {
			run.affiche();
		}

	}

}
