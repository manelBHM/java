import java.util.HashMap;
import java.util.Map;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("1","été");
		map.put("2","automne");
		map.put("3","hiver");
		map.put("4","printemps");
		
		for(String s : map.keySet()) {
			System.out.println(s+" ");
		}
		
		for(String s : map.values()) {
			System.out.println(s+" ");
		}
		
		System.out.println("");
		
		for(Map.Entry<String, String> s: map.entrySet()) {
			//parcourt toutes les entrees de la map, s est un element (cle + valeur) : il prend les elemens de map
			
			System.out.println(s.getKey()+" "+s.getValue());
		}

	}

}
