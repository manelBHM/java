package com.projet.inter;



import java.util.Date;



public class runSalaire {





	public static void main(String[] args) {

		Personne p1 = new Personne("Ahmed", "Issa", new Date("11/12/1990"), 3000, new Profil("Directeur G�n�ral", "DG"));

		p1.calculerSalaire();

		p1.affiche();

		Personne p2 = new Personne("Fadeil", "shareif", new Date("04/10/1982"), 2500, new Profil("Employ�", "EM"));

		

		

		p2.calculerSalaire();

		p2.affiche();

	}



}