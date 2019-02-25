package com.interface1;

public class BMW implements Car, Assert,Loggable,Property{

	public void drive() {
		System.out.println("BMW driving ......");
	}

	public int value() {
		return 80000;
	}
	
	public String owner() {
		return "Mercees";
	}

	public String message() {
		return "I'm the car owner ";
	}

 
}
