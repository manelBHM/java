package testArrayList;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.Collections;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet <String> set = new TreeSet<String>();
		
		set.add("D");
		set.add("X");
		set.add("C");
		set.add("A");
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("higher : " + set.higher("D"));
		System.out.println("lower : " + set.lower("D"));
		//System.out.println("lower : " + );

	}

}