package com.Arraylis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class myList {
	
		
	public static void main(String[] args) {
		List<String> colors = new ArrayList<String>();
		colors.add("\"Red\"");
		colors.add("\"Green\"");
		colors.add("\"Orange\"");
		colors.add("\"White\"");
		colors.add("\"Black\"");
		//Collections.sort(colors);

		Collections.reverse(colors);
		System.out.println(colors);
	
		Collections.reverse(colors);
		System.out.println(colors);
		
		List<String> colors1 = colors.subList(0, 3);
		System.out.println(colors1);
		
		ArrayList<String> colors2 = new ArrayList<String>();
		colors2.add("\"Red\"");
		colors2.add("\"Green\"");
		colors2.add("\"Black\"");
		colors2.ensureCapacity(6);
		System.out.println(colors2);

//		colors2.add("");
//		colors2.add("");
//		colors2.add("");
	
		colors2.add(3, "\"White\"");
		colors2.add(4, "\"Pink\"");
		colors2.add(5, "\"Yello\"");
		System.out.println(colors2);
		

	}
}
