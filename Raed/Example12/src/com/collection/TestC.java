package com.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class   TestC {
 
	
	public static HashMap sorted(HashMap mp) {
		
		List ls = new LinkedList(mp.entrySet());
		Collections.sort(ls, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				 
				return((Comparable) ((Map.Entry) (o1)).getValue() ).compareTo(((Map.Entry)(o2)).getValue());
		
	}
	
		
		
 

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> hm1 = new LinkedHashMap<Integer,String>();
		hm1.put(5, "A");
		hm1.put(11, "C");
		hm1.put(4, "Z");
		hm1.put(77, "Y");
		hm1.put(9, "P");
		hm1.put(66, "Q");
		hm1.put(0, "R");
		
		Set set = hm1.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry m = (Map.Entry) it.next();
 			System.out.println(m.getKey()+":"+m.getValue());
		}
		
		System.out.println();
		Map<Integer,String> hm2 = new TreeMap<Integer,String>(hm1);
		System.out.println(hm2);
		Set set2 =hm2.entrySet();
		for(Iterator it2 = set2.iterator();it2.hasNext();) {
			Map.Entry n = (Entry) it2.next();
			System.out.println(n.getKey()+"::::"+n.getValue());
			
		}

	}

}
