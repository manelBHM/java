import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExoMap {

	public static void main(String[] args) {

		
		HashMap ht = new HashMap<>();
		
		ht.put(1, "Data1");
		ht.put(2, "Data2");
		ht.put(4, "Data4");
		ht.put(3, "Data3");
		
		Set set = ht.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.println(mentry.getKey() + ", " + mentry.getValue());
	      }

		
	System.out.println(set);
		
		
		
		
	}

}
