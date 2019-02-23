package appliHashMap;

import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class AppliHashmap {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(5, "A");
		hmap.put(11, "C");
		hmap.put(4, "Z");
		hmap.put(77, "Y");
		hmap.put(9, "P");
		hmap.put(66, "Q");
		hmap.put(0, "R");
		
	
		System.out.println(" ------Affichage Original------ ");
		System.out.println("");
		for(Map.Entry<Integer, String> s : hmap.entrySet())
		{
			System.out.println("|Key is= " + s.getKey() + " ==> Values= " + s.getValue()+"|");
		}
		
		System.out.println("");
		System.out.println(" -------Trié par Keys------- ");
		System.out.println("");
		
		
		Map<Integer, String> map1 = new TreeMap<Integer, String>(hmap);
		
		for(Map.Entry<Integer, String> s : map1.entrySet())
		{
			System.out.println("|Key is ==> " + s.getKey() + " ==> Values ==> " + s.getValue()+"|");
		}
		
		/*
		 * 
		for(Integer s : map1.keySet())
		{
			System.out.println("|Key is ==> " + s + " ==> Values ==> ");
		}
		*/

	}

}
