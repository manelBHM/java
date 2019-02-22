package com.lesson.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static java.util.Collections.reverseOrder;

public class MapApp2 {
	
 
	

	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(5,"A");
		hmap.put(11,"c");
		hmap.put(4,"z");
		hmap.put(77,"Y");
		hmap.put(9,"P");
		hmap.put(66,"Q");
		hmap.put(0,"R");
		
		//System.out.println(hmap);
		System.out.println("Before sorting : ");
		for(Map.Entry<Integer, String> s: hmap.entrySet()) {
			System.out.println(s.getKey()+":"+s.getValue());
		}
		
 
		
		
		System.out.println("After sorting : ");
 
		TreeMap<Integer,String> tmp = new TreeMap<Integer, String>(hmap);
	 
		 
	}

}
