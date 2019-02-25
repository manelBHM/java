import java.util.Enumeration;
import java.util.Hashtable;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(1, "printemps");
		ht.put(2, "été");
		ht.put(3, "hiver");
		ht.put(4, "aotun");
		
		Enumeration<String> e = ht.elements();
		
		while(e.hasMoreElements())
		System.out .println(e.nextElement());
		
		
		
		
	
		

	}

}
