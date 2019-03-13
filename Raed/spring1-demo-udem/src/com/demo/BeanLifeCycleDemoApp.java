package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
 
		//load spring configuration  file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrive bean from container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
	 
		System.out.println(theCoach.getDailyWorkOut());
		
 
		
		//close context 
		context.close();

	}

}
