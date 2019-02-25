import java.util.HashMap;
import java.util.Map;

public class Map2 {

	public static void main(String[] args) {
		
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("1","été");
		map.put("2","automne");
		map.put("3","hiver");
		map.put("4","printemps");
		
		for(String s :map.keySet()) {
			System.out .println(s+" ");
		}
		
		for(String s :map.values()) {
			System.out .println(s+" ");
		}
		
		System.out .println("");
		
		for(Map.Entry<String, String> s : map.entrySet()) {
			System.out .println(s.getKey()+" "+s.getValue() );
		}
			

	}

}
