package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		 
		//load spring configuration file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container 
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphtheCoach = context.getBean("tennisCoach", Coach.class);
		
		
		boolean result = (theCoach==alphtheCoach);
		
		//print results
		System.out.println("\nPointing to the same object : "+result);
		
		System.out.println("\nMemory location :"+theCoach);
		
		System.out.println("\nMemory location :"+alphtheCoach);
		
		//close contxt
		context.close();

		
		
	}

}