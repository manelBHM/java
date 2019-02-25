package com.demo1;

public class Person {
	
	
	private Name personName;
	private static  int personneCouuter;
	

	public Person(Name personName) {
		super();
		this.personName = personName;
	}
	
	

/*	
	public Person() {
		
		//empy constructor
		
	}
	*/
	
	public Person() {
		personneCouuter++;
	}
 


	public int hello(int name) {
		 
		return 4;
	}
	
	
	public static int countP() {
		return personneCouuter;
		
	}
	
 
	
	
}
