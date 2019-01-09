import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class ExampleSort {

	public static void main(String[] args) {
		// Sort the List
		
		//System.out.println("Black, Grean, Orange, Red, While");
		//String[] list = {"Red", "Green", "Orange", "White", "Black"};
		
		 System.out.println("Tree Set Example!");
		 System.out.println("\"Red\", \"Green\", \"Orange\", \"White\", \"Black\"\n");

	        TreeSet <String>tree = new TreeSet<String>();
	        tree.add("Red");
	        tree.add("Green");
	        tree.add("Orange");
	        tree.add("White");
	        tree.add("Black");

	        Iterator<String> iterator;
	        iterator = tree.iterator();

	        System.out.println("Tree set data: ");

	        //Displaying the Tree set data
	        while (iterator.hasNext()){
	            System.out.print(iterator.next() + "; ");
	        }
		

	}

}
