package collectionTypeMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TestHashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Hashtable ht = new Hashtable();
	
		
		System.out.println("--------test HashTable--------------------");
		
		ht.put(1, "je");
		ht.put(27, "suis");
		ht.put(63, "une");
		ht.put(19, "hasTable");
		
		
		Enumeration e = ht.elements();
		Enumeration k = ht.keys();
		
	
		
		while(e.hasMoreElements() || k.hasMoreElements()) {
		System.out.println(k.nextElement()  + " " + e.nextElement());
		}
		
		
		HashMap<String, String> map = new HashMap<String, String>();
		System.out.println("");
		System.out.println("--------test HashMap--------------------");
		map.put("1", "je");
		map.put("2", "suis");
		map.put("3", "une");
		map.put("4", "Hashmap");
		
		for(Map.Entry<String, String> s : map.entrySet())
		{
			System.out.println(s.getKey() + " " + s.getValue());
		}


	}

}
