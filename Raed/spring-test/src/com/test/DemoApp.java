package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {

	public static void main(String[] args) {
		
		
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container 
		Tennis theSport = context.getBean("mySport", Tennis.class);
		
		//call method 
		System.out.println(theSport.dailyWorkOut());
		
		System.out.println(theSport.getLeague());
		
		System.out.println(theSport.getEmail());
		
		
		System.out.println(theSport.getName());
		
		//close contxt 
		context.close();
		
	}

}
