import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestListeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(5, "A");
        hmap.put(11, "C");
        hmap.put(4, "Z");
        hmap.put(77, "Y");
        hmap.put(9, "P");
        hmap.put(66, "Q");
        hmap.put(0, "R");


        System.out.println(hmap);
        
        System.out.println("");
        
        for(Map.Entry<Integer, String> str : hmap.entrySet()) {
        	
        	System.out.println(str.getKey()+" "+str.getValue());
        	
        }
        
        
        
	}

}
