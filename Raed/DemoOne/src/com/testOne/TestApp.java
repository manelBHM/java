package com.testOne;

import java.util.*;

 

public class TestApp {
 
 
    
    
    

	public static void main(String[] args) {
 
		Person lonely = new Person("Mohamed");
 
 
		
		Person friend1 = new Person("Raed");
		Person friend2 = new Person("Ahmed",friend1);
		friend1.setPerson(friend2);
		
		
		System.out.println(lonely.toString());
		System.out.println(friend2.toString());
		System.out.println(friend1.toString());
		
		
		
 

}}