package com.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericOne {

	public static void main(String[] args) {
		
		List liste = new ArrayList();
		String value = null ;
		
		for(int i =0;i<10;i++) {
			liste.add(""+i);
		}
		
		
	
		for(	Iterator it = liste.iterator(); it.hasNext();) {
			value =  (String) it.next();
			System.out.println(value.toUpperCase());

		}
		System.out.println("................");
		
		for(Iterator<String> it = liste.iterator();it.hasNext();) {
			value = it.next();
			System.out.println(value.toUpperCase());
		}
		
		System.out.println("...............");
		Iterator it = liste.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		

	}

}
