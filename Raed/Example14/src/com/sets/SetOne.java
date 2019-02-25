package com.sets;

import java.util.HashSet;
import java.util.Iterator;

public class SetOne {

	public static void main(String[] args) {
		
		//Un Set est une collection qui n'accepte pas les doublons. Par exemple, elle n'accepte qu'une seule fois null,
		//car deux valeurs null sont considérées comme un doublon
		
		HashSet hs = new HashSet();
		hs.add("toto");
		hs.add(10);
		hs.add('A');
	
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		System.out.println("\nParcours avec un tableau d'objet");
		System.out.println("-----------------------------------");
		Object[] ob = hs.toArray();
		for(Object s:ob) {
			System.out.println(s);
		}
		
	
	
	}

}
