package com.lesson.one;

import java.util.HashMap;
import java.util.Map;
 

public class MapApp1 {

	public static void main(String[] args) {
	 
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("2", "Data1");
		map.put("1", "Data2");
		map.put("4", "Data3");
		map.put("3", "Data4");
		
		//for(String s: map.values()) {
			//System.out.println(s);
		//}

		System.out.println(map); //it's printing a dictionary as it contains keys and values 
		System.out.println();
		for(Map.Entry<String, String> s: map.entrySet()) {
			System.out.println("the key is : " +s.getKey()  +" "+"the value is : "+s.getValue());
		}
	}

}
