package compratorHashMap;


import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class myHashMap {
	
	
	
	public static Comparator<Entry<Integer, String>> triage = new Comparator<Map.Entry<Integer,String>>() {
		
		@Override
		public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
			
			return o1.getValue().compareTo(o2.getValue());
		}
	};
	

	public static void main(String[] args) {
	
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(5, "A");
		hmap.put(11, "C");
		hmap.put(14, "Z");
		hmap.put(77, "Y");
		hmap.put(9, "P");
		hmap.put(66, "Q");
		hmap.put(0, "R");
		
		System.out.println();
		for(Map.Entry<Integer, String> s: hmap.entrySet()) {
			System.out.println(s.getKey() + " "+ s.getValue());
		}
		System.out.println("Trier cette Map par clé et par Valeur");
		// Trier cette Map par clé et par Valeur
		 List<Entry<Integer, String>> lMap = new LinkedList<Entry<Integer, String>>(hmap.entrySet());
		
		 Collections.sort(lMap, triage);
		 
		 for (Entry<Integer, String> entry : lMap) {
			System.out.println(entry.getValue()+" "+ entry.getKey());
		}
		 
	}

}
