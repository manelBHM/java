package com.lesson10Tow;

import java.util.Date;

public class runPersonnApp {

	public static void main(String[] args) {
	 
 
	 Personne p1 = new Personne("Bukhary","Rafy" , new Date("10/10/1999"),2000, new Profil("Directeur Général", "DG"));
	 Personne p2 = new Personne("Mohamed","Mona", new Date("10/10/1999"),1500, new Profil("Employé", "EM"));
	 
	 p2.afficher();
	 
	 p1.afficher();
 
	 Personne.affichNombrePersonne();
		
	 
		
		
		
		
		
		
		
		
		
	}

}
