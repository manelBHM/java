package com.annoations1;

import java.util.ArrayList;
import java.util.List;

public class WarningOne {

	public static void main(String[] args) {
		
		List liste = new ArrayList();

		liste.add("1");
		System.out.println(liste);
	}

	
/*	Résultat :
		javac TestSuppresWarning.java
		Note: TestSuppresWarning.java uses unchecked or unsafe operations.
		Note: Recompile with -Xlint:unchecked for details.
		RQ : L'option -Xlint :unchecked permet d'obtenir des détails
		javac -Xlint:unchecked TestSuppres
		Warning.java
		TestSuppresWarning.java:8: warning: [unchecked] unchecked call to
		add(E) as a member of the raw type java.util.List
		donnees.add("valeur1");
		^
		1 warning*/
	
	//see WarningTwo example
}
