package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		

		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
	
		//call the method from the bean
		System.out.println(theCoach.getDailyWorkOut());
		
		//let's call our new method fortune
		System.out.println(theCoach.getDailyFortune());
	 
		//close the container 
		context.close();
		
		
		
		
	}

}
