package com.projet.inter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {


	public static void main(String[] args) {
	
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
	 
		Personne p1 = new Personne("Ahmed", "Issa", dateFormat.format(new Date("04/10/1982")), 3000, new Profil("Directeur Général", "DG"));
		p1.calculerSalaire();
		p1.affiche();
       Personne p2 = new Personne("Fadeil", "shareif",dateFormat.format(new Date("04/10/1982")), 2500, new Profil("Employé", "EM"));
		
		p2.calculerSalaire();
		p2.affiche();
	}

}