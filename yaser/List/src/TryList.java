import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TryList {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String> ();
		
		al.add("red");
		al.add("green");
		al.add("orange");
		al.add("white");
		al.add("black");
		
	System.out.println(al);
	
	
	

	Collections.sort(al);
	System.out.println(al);
	
	
	Collections.reverse(al);
	
	System.out.println(al);
	
	List<String> sub=al.subList(0,3);
	System.out .println(sub);
	
	sub.add("yelow");
	sub.add("pinck");
	
	System.out .println(sub);
	

	}

}
