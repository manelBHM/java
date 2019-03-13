package com.test;

import java.util.Scanner;

public class ItemData {

	Scanner in = new Scanner(System.in);
	int number;
	double quantity, price, tcost = 0;

	void get() {
		System.out.print("\n\t Enter item number = ");
		number = in.nextInt();
	}

	void cost() {
		System.out.print("\n\t Enter item quantity = ");
		quantity = in.nextDouble();
		System.out.print("\n\t Enter item price per unit = ");
		price = in.nextDouble();
		tcost = quantity * price;
	}

	void displyLine(String name) {
		System.out.println("\n\t Item number = " + number);
		System.out.println("\n\t Item nume = " + name);
		System.out.println("\n\t Item quantity = " + quantity);
		System.out.println("\n\t Item price per unit = " + price);
		System.out.println("\n\t Total cost = " + tcost);
	}

}
