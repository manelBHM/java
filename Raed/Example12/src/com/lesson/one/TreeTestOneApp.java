package com.lesson.one;

import java.util.TreeSet;

public class TreeTestOneApp {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		
		
		
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("C");
		
		//even if we enter a table that is not sorted, TreeSet will print it out automatically sorted 
		//set.add("D");
		//set.add("C");
		//set.add("B");
		//set.add("A");
		
		System.out.println(set+"\n");
		//System.out.println("higher than :"+set.higher("B"));
		//System.out.println("lower than :"+set.lower("D"));
	 

	}

}
