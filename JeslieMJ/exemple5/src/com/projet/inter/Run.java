package com.projet.inter;
import java.util.*;

public class Run {

	public Run() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Personne personne1 = new Personne("Jean De La Fontaine",new Date ("11/09/1234"), 1900);
		personne1.affiche();
		
		Personne personne2 = new Personne("Vincent Van Gogh",new Date ("17/02/1810"),1988);
		personne2.affiche();
		
		Personne personne3 = new Personne("Aristote", new Date("08/06/0100"), 2100);
		personne3.affiche();
	}

}
