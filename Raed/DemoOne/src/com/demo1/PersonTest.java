package com.demo1;
import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;

public class PersonTest {
	
	
	final private String[] STRING_ARRAY = {"STRING1","STRING1","STRING1","STRING1"};
	// as final key protects only the variable not the values , let's not give the user the access of all values
	// instead, let's give the user only the copy of these values with a method 
	public String[] copy() {
		return Arrays.copyOf(STRING_ARRAY, STRING_ARRAY.length);
	}
	
	@Test
	public void shouldReturnNumberOfPerson() {
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		assertEquals(4, Person.countP());
		
	}

	//trying to return the number of peron infor loop
	public void shouldReturnNumberOfPersonInLoop() {
		Person persons;
		for(int i =0;i< 4;i++) {
			persons = new Person();	
		}
		assertEquals(4, Person.countP());
	}

	//trying to return the number of peron in whileloop
	public void shouldReturnNumberOfPersonInWhileLoop() {
		int i= 0;
		Person persons;
		while(i < 4) {
			persons = new Person();
		}
		assertEquals(4, Person.countP());
	}
	
	
	@Test
	public void  demonstrationArray() {
		Person[] persons = new Person[4];
		for(int i =0;i<4;i++) {
			persons[i] = new Person();
			
			//persons[i].hello(i); ///can even print out some method if we want 
		}	
	}
	
	
	 
	
	@Test
	public void shouldReturnRaed() {
		Person myp2 = new Person();
	}
	
	
	
/*	@Test
	public void showNumberPerson() {
		Person p1 = new Person();
		Person p2 = new Person();
		
		assertEquals(2,Person.countP());
	}
	
	*/
	
}
	
	

