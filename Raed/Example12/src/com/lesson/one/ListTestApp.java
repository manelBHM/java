package com.lesson.one;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ListTestApp {

	public static void main(String[] args) {
		

		String[] tableau = {"R","M","B"};
		List<String> str2 = new ArrayList<String>();
		
		System.out.println("\nContenu de la tableau");
		for(String tab: tableau) {
			System.out.print(" "+tab);
		}
 
		str2 = Arrays.asList(tableau);
		

		//System.out.println(str2.toString());
		
		System.out.println("\nContenu de la list");
		for(String st:str2) {
			System.out.print(" "+st);
		}
		
		System.out.println();
		tableau[0] = "tab";
		System.out.println("\nContenu de la tableau");
		for(String tab: tableau) {
			System.out.print(" "+tab);
		}
		
		System.out.println();
		//str2.add("str2"); // evenn if we used aslist method to deal with like a list our tableau stays alwys as table we can't use add method
		//bcoz simply it's not a list eventually 
		System.out.println("\nContenu de la list");
		for(String l: str2) {
			System.out.print(" "+l);
		}
		
		
	}

}
