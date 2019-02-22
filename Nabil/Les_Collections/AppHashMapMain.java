import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class AppHashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hmap = new HashMap<Integer, String>();
	
		
		  hmap.put(5, "A");
	      hmap.put(11, "C");
	      hmap.put(4, "Z");
	      hmap.put(77, "Y");
	      hmap.put(9, "P");
	      hmap.put(66, "Q");
	      hmap.put(0, "R");
	      
	      System.out.println("Before Sorting:\n" + " ");
	      for (Entry<Integer, String> s : hmap.entrySet()) {
				System.out.println(s.getKey() + " " +s.getValue() );
				
				
			}
	      System.out.println("\n");

	      System.out.println("After Sorting:\n" + " ");
	      
			TreeMap<Integer,String> hmap2 = new TreeMap<Integer, String>(hmap);

			for (Entry<Integer, String> s : hmap2.entrySet()) {
				System.out.println(s.getKey() + " " +s.getValue() );
				
				
			}
	  		
	  		
			
			
	}

}
