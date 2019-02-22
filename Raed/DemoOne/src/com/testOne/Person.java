package com.testOne;

public class Person {
	
	private String name;
	private Person person;
	
	
	
	public Person(String name) {
		super();
		this.name = name;
	}
 
	
	

	public Person( String name,Person person) {
		super();
		this.name = name;
		this.person = person;
	
	}

	

 



	public void setPerson(Person person) {
		this.person = person;
	}




 
	public String toString() {
		if(person != null) {
			return this.name +" "+"is a friend  with " +person.name;
		}else {
			return this.name +" "+"has no friend";
		}
	 
	}



 
	
	
	
	
	
	
	

}
