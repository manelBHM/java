package com.projet.inter;
import java.util.Date;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne2 P1 = new Personne2("Dupont ","Philippe ", new Date("06/05/94"), 3000, new Profil2("Directeur General"," DG"));
		P1.calculerSalaire();
		P1.afficher();
		
		Personne2 P2 = new Personne2("Sherif ", "Olivier ", new Date("08/05/94"), 2500, new Profil2("Employer", "EM"));
		P2.calculerSalaire();
		P2.afficher();
	}



}
