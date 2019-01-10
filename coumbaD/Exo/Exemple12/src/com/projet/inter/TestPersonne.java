package com.projet.inter;

import java.util.Date;

public class TestPersonne {

	public static void main(String[] args) {
	
	      Personne p1 = new Personne (0,"José","Quentin", new Date(), 3700, null);
	      Personne p2 = new Personne (0, "Marie","José", new Date(), 2800, null);
	      
	      p1.afficher();
	      p2.afficher();

	}

}
