package com.annoations1;

import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("unchecked")
public class WarnigTwo {

	
/*	Pour supprimer cet avertissement, il faut utiliser les
	générics dans la déclaration de la collection ou utiliser
	l'annotation @SuppressWarning.
*/	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		List liste = new ArrayList();

		liste.add("1");
		System.out.println(liste);
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
