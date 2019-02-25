import java.util.TreeSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class testMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("1", "Data1");
		map.put("2", "Data2");
		map.put("4", "Data4");
		map.put("3", "Data3");
		
		Set<Entry<String, String>> setMap = map.entrySet();
        Iterator<Entry<String, String>> it = setMap.iterator();
          while(it.hasNext()){
          Entry<String, String> e = it.next();

	      System.out.println(e.getKey() + " , " + e.getValue());
	}

}}
