package com.lesson.one;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet2App {
	
	
	public static void afficher(final Set<String> set) {
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.print(element);
			if(iterator.hasNext()) {
				System.out.print(",");
			}else {
				System.out.print("");
			}
		}
	}


	public static void main(String[] args) {
		

		NavigableSet<String> set = new TreeSet<String>();
		for(int i =0;i< 10;i++) {
			set.add(""+i);
		}
		
		System.out.println("higher(5)"+set.higher("5"));
		System.out.println("higher(5)"+set.lower("5"));
		afficher(set.descendingSet());
	
	}

}
