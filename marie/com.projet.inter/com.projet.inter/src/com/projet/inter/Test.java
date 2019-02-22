package com.projet.inter;
import java.util.Date;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne p1 = new Personne("Philipe", "Dupont", new Date("11/12/1990"), 3000, new Profil("Directeur Général", "DG"));

		p1.calculerSalaire();

		p1.affiche();

		Personne p2 = new Personne("Olivier", "Sherif", new Date("04/10/1982"), 2500, new Profil("Employé", "EM"));

		p2.calculerSalaire();

		p2.affiche();
	}

}
