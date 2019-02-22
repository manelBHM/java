import java.util.HashMap;
import java.util.Map;

public class ExMap {

	public static void main(String[] args) {
	 
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1,"Data1");
		map.put(2,"Data2");
		map.put(4,"Data4");
		map.put(3,"Data3");
		
		System.out.println(map);   // to afficheir all in one line 
		
		System.out.println("----------------");
		
		for(Map.Entry<Integer, String> s : map.entrySet()) {  // to afficheir eche one in new line 
			System.out .println(s.getKey()+" "+s.getValue());
			
		}

	}

}
