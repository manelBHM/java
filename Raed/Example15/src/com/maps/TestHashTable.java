package com.maps;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class TestHashTable {

	public static void main(String[] args) {
		 
		Hashtable ht=new Hashtable();
		ht.put(1, "printemps");
		ht.put(10, "été");
		ht.put(12, "automne");
		ht.put(45, "hiver");
		
	 
		Enumeration e =ht.elements();  //Enumeration is for list with keys and values
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
