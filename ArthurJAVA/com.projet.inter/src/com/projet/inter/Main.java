package com.projet.inter;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		//Profil dg = new Profil("Directeur");
		Profil emp = new Profil ("EMP");
		Date ab =new Date("03/02/1991");
		
		Personne dir = new Personne("Jean", "Bon",ab, 10000, new Profil("Directeur"));
		Personne emp1 = new Personne("Eric", "Cantona", new Date("12/12/1212"), 5000, emp);
		Personne emp2 = new Personne("Amidou", "Amidon", new Date("13/12/1212"), 5000, emp);

		
		dir.calculerSalaire();
	    dir.affiche();
        		
		
	    emp2.calculerSalaire();
	    emp2.affiche();
	    
	}

}
