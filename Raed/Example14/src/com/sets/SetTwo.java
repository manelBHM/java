package com.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTwo {
	
	
	public static void showSet(final SortedSet<String> sortedSet) {
		
		Iterator<String> i = sortedSet.iterator();
		while(i.hasNext()) {
			String l = i.next();
			System.out.print(l);
			if(i.hasNext()) {
				System.out.print(",");
			}else {
				System.out.print("");
			}
		}
		
	}
	

	public static void main(String[] args) {
		
		NavigableSet<String> hs = new TreeSet<String>();
		
		for(int i =0;i<=10;i++) {
			hs.add(""+i);  //we added "" bcoz it's an integer
		}
		
		showSet(hs);
		
		System.out.println();
		System.out.println(hs);
		System.out.println("higher(5)=" + hs.higher("5"));
		System.out.println();
		System.out.println("lower(5)=" + hs.lower("5"));
		System.out.println();
		System.out.println("Ordre descendant=");
		showSet(hs.descendingSet());
		
		System.out.println();
		System.out.println("...................");
		System.out.print("headSet(5)=");
		showSet(hs.headSet("5"));
		
		System.out.println();
		System.out.println("headSet(5,true)=");
		showSet(hs.headSet("5", true));
		System.out.println("subSet(3,5)=");
		showSet(hs.subSet("3", "5"));
		System.out.println("subSet(3,true,5,true)=");
		showSet(hs.subSet("3", true, "5", true));
		System.out.println("tailSet(5)=");
		showSet(hs.tailSet("5"));
		System.out.println("tailSet(5,true)=");
		showSet(hs.tailSet("5", true));
		System.out.println("pollFirst()=" + hs.pollFirst());
		System.out.println("pollLast()=" + hs.pollLast());
		System.out.println(hs);
		

	}


 

}
