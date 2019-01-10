package collectionTypeMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.Collections;
import java.util.Comparator;


public class ExerciceMap {
	
	int key;
	String str;
	
	public ExerciceMap  (int key, String str)
	{
		this.key = key;
		this.str = str;
	}
	

	public int getKey() {
		return key;
	}


	public String getStr() {
		return str;
	}
	


	
	 public static Comparator<ExerciceMap> keyComparator = new Comparator<ExerciceMap>()
	{

public int compare(ExerciceMap k1, ExerciceMap k2)
{
	int key1 = k1.getKey();
	int key2 = k2.getKey();
	
	return key2-key1;
}
	};
	
	
	
	
	public static void trier(LinkedHashMap <Integer, String> map)
	{ 
	
		/*
      Set set = map.entrySet();
		
		Iterator iterator = set.iterator();
		
		//Collections.sort(set, ExerciceMap.keyComparator);
		
		while(iterator.hasNext())
		{
			Map.Entry mapEntry = (Map.Entry)iterator.next();
			
			System.out.println("Key is: " + mapEntry.getKey() + " & "  + " Value is: " +  mapEntry.getValue());
		}
		*/
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			
		LinkedHashMap <Integer, String> map = new  LinkedHashMap <Integer, String>();
		
		
		
		System.out.println("--------test HashMap---------");
		System.out.println("");
		
		map.put(1, "data1");
		map.put(2, "data2");
		map.put(4, "data4");
		map.put(3, "data3");
		
		
	//	System.out.println(map);
		System.out.println("");
		
	//	trier(map);
		
		System.out.println("--------Map trier par les id ==> ---------");
		
	//	System.out.println(map);
		System.out.println("");
		
		/*
		// declarer la map avec la @variable set de type <SET>  
		
		Set set = map.entrySet();
		
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry mapEntry = (Map.Entry)iterator.next();
			
			System.out.println("Key is: " + mapEntry.getKey() + " & "  + " Value is: " +  mapEntry.getValue());
		}
		
		
		
		/*
		for(Map.Entry<Integer, String> s : map.entrySet())
		{
			System.out.println("Key is: " + s.getKey() + " & "  + " Value is: " +  s.getValue());
		}
*/
		
		
	}

}
