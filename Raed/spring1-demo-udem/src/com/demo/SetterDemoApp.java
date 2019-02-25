package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
 
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container
		CricketCoach theCoach = context.getBean("myCricketCoah", CricketCoach.class);
		
		//call the methods on it
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyFortune());
		
		//call our new method to get the literal values
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		//close the container 
		context.close();
		
		
	}

}
