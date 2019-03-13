package com.maps;

import java.util.HashMap;
import java.util.Map;

public class mapTwo {

	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap<String,String>();
		
		hm.put("1", "été");
		hm.put("2", "automne");
		hm.put("3", "hiver");
		hm.put("4", "printemps");
		
		for(String s:hm.values()) {
			System.out.println(s);
		}
		System.out.println(".......");
		for(String s:hm.keySet()) {
			System.out.println(s);
		}
		System.out.println(".......");
		for(Map.Entry<String, String> s:hm.entrySet()) {
			System.out.println(s.getKey()+":"+s.getValue());
		}

	}

}
