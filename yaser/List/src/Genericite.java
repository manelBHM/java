
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Genericite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list= new ArrayList<String>();
String valuer= null;
 
for (int i=0; i<10; i++) {
	valuer = ""+i;
	
	list.add(valuer);
	
	
}
for(Iterator<String> iter = list.iterator(); iter.hasNext();) {
	
	System.out .println(iter.next().toUpperCase());
}
	}

}
