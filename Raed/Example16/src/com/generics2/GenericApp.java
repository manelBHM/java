package com.generics2;

public class GenericApp {

	public static void main(String[] args) {
		Generic<Integer,String> gn = new Generic<Integer,String>(1,"String1");
		Integer p1 = gn.getParam1();
		String p2 = gn.getParam2();

		System.out.println(p1);
	}

}
