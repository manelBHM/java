import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map <String, String> map = new LinkedHashMap <String, String>();
		
		map.put("1","Data1");
		map.put("2","Data2");
		map.put("4","Data4");
		map.put("3","Data3");
		
		
		/*for(Map.Entry<String, String> m : map.entrySet()) {
			System.out.println(m.getKey()+","+m.getValue());
		}*/
		
		//----on peut afficher avec un iterator
		
		Set set = map.entrySet();//on creer un set car iterator appartient a Set
		Iterator iterator = set.iterator();//creation iterator
		
		while(iterator.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) iterator.next();//on creer une variable Map.Entry pour resevoir le elements, on cast car on va utiliser getKEy et getValu qui eux appartient a Map
			//mapEntry n'accepte que des element de son meme type
			System.out.println(mapEntry.getKey()+" "+mapEntry.getValue());
			}

	}

}
