import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TestHash {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		HashMap<Integer,String> la= new HashMap<Integer,String>();
		
		la.put(5, "A");
		la.put(11, "C");
		la.put(4, "Z");
		la.put(77, "Y");
		la.put(9, "P");
		la.put(66, "Q");
		la.put(0, "R");
		
		for (Map.Entry<Integer,String> S : la.entrySet()) {
			System.out.println(S.getKey()+" "+ S.getValue());
		}
		
		System.out.println("------------------------");
		
		
		Collections.sort(l,TestHash,la.entrySet() );
		System.out.println(S.getKey()+" "+ S.getValue());		
		
		}
		System.out.println("------------------------");
		
		
		for (String t : la.values()) {
			System.out.println(t+" ");
		}

	}

}
