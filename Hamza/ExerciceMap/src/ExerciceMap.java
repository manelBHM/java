import java.util.HashMap;
import java.util.Map;

public class ExerciceMap {
	
	public void afficher() {
		
	}

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("1", "Data1");
		map.put("2", "Data2");
		map.put("3", "Data3");
		map.put("4", "Data4");
		
		System.out.println(map);

		for (Map.Entry<String, String> string : map.entrySet()) {

			System.out.println(string.getKey() + ". " + string.getValue());

		}

	}

}
