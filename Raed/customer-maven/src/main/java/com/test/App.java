package com.test;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String name;
		ItemData ob = new ItemData();
		//ob.get();
		System.out.print ("\n\t Enter item name = ");
		name=in.nextLine();
		ob.cost();
		ob.displyLine(name);

	}

}
