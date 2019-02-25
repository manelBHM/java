package testArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class renverser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> l1 = new ArrayList<String>();
		
		l1.add("Red");
		l1.add("Green");
		l1.add("Orange");
		l1.add("White");
		l1.add("Black");
		
		for(String str : l1) {
			System.out.print(str+" ");
		}
		
		System.out.println("");
		
		Collections.reverse(l1);//averser
		
		for(String str : l1) {
			System.out.print(str+" ");
		}

	}

}
