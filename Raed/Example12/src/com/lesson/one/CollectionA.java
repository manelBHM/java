package com.lesson.one;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionA {

	public static void main(String[] args) {
 
		ArrayList<String> str = new ArrayList<String>();
		List<String> str2 = new ArrayList<String>();
		
		str.add("Red");
		str.add("Green");
		str.add("Orange");
		str.add("White");
		str.add("Black");
		
		System.out.println("\nbefore sorting");
		Iterator it = str.iterator();
		while(it.hasNext()) {
			System.out.print(" "+it.next());
		}
		
		System.out.println();
		Collections.sort(str);
		System.out.println("\nafter sorting ");
		for(String s: str) {
			System.out.print(" "+s);
		}
		
		
		System.out.println();
		System.out.println("\nreversing elements ");
		Collections.reverse(str);
		System.out.println(str.toString());

		
		
		
		
		//coping elements from 1 to 3 from ArrayList str to str2 and printing value out :
		System.out.println();
		str2= str.subList(0, 3);
		
		System.out.println(str2);
		 
		
		//adding elements to my str2 list
		System.out.println("\nadding elements to my str2 list");
		str2.add("White");
		str2.add("Pink");
		str2.add("Yellow");
		//System.out.println(str2); // we can print list only with printout method  but it's like a list 
		Iterator ite1 = str2.iterator();
		while(ite1.hasNext()) {
			System.out.print(" "+ite1.next());
		}
		
		
		
		
	}
	

}
