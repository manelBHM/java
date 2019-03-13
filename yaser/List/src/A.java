import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class A {

	public static void main(String[] args) {
		
		/*to add the lest */
		
		ArrayList<String> name = new ArrayList<String>();
		

		ArrayList<String> name1 = new ArrayList<String>();
		
		name.add("yaser");
		name.add("abbas");
		name.add("taleb");
		
		/*to add the lest */
		
		
		
		System.out.println(name);   //to print the list
		
		System.out.println(name.get(0)); // to print the index
		
		name.remove(1);   // to remove
		System.out.println(name);  
		
		
		Collections.sort(name);  // to make the trre
		System.out.println(name);
		
		
		
		name1.add("yaser");
		name1.add("abbas");
		name1.add("taleb");
		
		
		List<String> sub=name1.subList(0,3);  // to add list insid the list 
		System.out.println(sub);	
		sub.add("ahmad");
		sub.add("ali");
		sub.add("taleb");
		
		System.out.println(sub);	
		
		Collections.reverse(sub); // to print the list on reverse 
		System.out.println(sub);	

	}

}
