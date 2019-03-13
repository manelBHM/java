package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//call method on it
		System.out.println(theCoach.getDailyWorkOut());
		
		//call the method to our dailyfortune
		System.out.println(theCoach.getDailyFortune());
		
		//close context
		context.close();
	}

}
