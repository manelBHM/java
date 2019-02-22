package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
 
		//load spring configuration  file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrive bean from container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphtheCoach = context.getBean("myCoach", Coach.class);
		
		
		//check if they are the same
		boolean result = (theCoach==alphtheCoach);
		
		//print out the results 
		
		System.out.println("\nPointing to the same object.."+result);
		
		System.out.println("\nMomery location for .."+theCoach);
		
		System.out.println("\nMomery location for.."+alphtheCoach);
		
		//close context 

	}

}
