import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapEx {
	
	/*
	
	public int getKey() {
		
	}
	
	
	public static Comparator<HashMap<Integer, String>> keyComparator = new Comparator<HashMap<Integer, String>>() {
		public int compare(HashMap<Integer, String> h1, HashMap<Integer, String> h2) {
			// TODO Auto-generated method stub
			
			int key1 = h1.
			int key2 = h2
			return key1 - key2;
					
		}
	};
	
	*/
	
	

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(5, "A");
		hmap.put(11, "C");
		hmap.put(4, "Z");
		hmap.put(77, "Y");
		hmap.put(9, "P");
		hmap.put(66, "Q");
		hmap.put(0, "R");
		
		
		for(Entry<Integer, String> x : hmap.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}
		
		System.out.println();

		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.println(mentry.getKey() + ", " + mentry.getValue());
		}

		
		System.out.println();
		
		Map keySort = new TreeMap(hmap);

	      Set set2 = keySort.entrySet();
	      Iterator iterator2 = set2.iterator();
	      System.out.println("Après le tri: ");
	      while(iterator2.hasNext()) {
	         Map.Entry me2 = (Map.Entry)iterator2.next();
	         
	         System.out.println(me2.getKey() + ": " + me2.getValue());
	      }
		
		
	      Map valuesSort = sortByValues(hmap);
		
	}

	private static HashMap sortByValues(HashMap<Integer, String> hmap) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

}
