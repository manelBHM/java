package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") if we don't specify the bean id , the default is the same of the class starts with small letter
@Component
public class TennisCoach implements Coach {
	
	//field injection
	//let's use (Autowired annotation in the filed injection )directly in the field without constructor and setter method 
	//and spring will automatically inject it using technology called reflection 
	@Autowired //since FortuneService is bein implemented by more than one class we have to use @Qualifer with 
	//the name of desired class starting with samll letter
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
 
 

	//define a default constructor
	TennisCoach(){
		System.out.println(">>> inside TennisCoach default constructor");
	}
	
	/*
	//injecting our FortuneService with constructor 
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	
	/*
	//define a setter method to inject the FortuneService
	//we give any name we want as long aas @Autowired exist
	//let's change the name of the method from setFortuneService to doMyStuff() and it will works
	@Autowired
	//public void setFortuneService(FortuneService fortuneService)
	public void doMyStuff(FortuneService fortuneService) {
		System.out.println(">>> inside TennisCoach: doMyStuff()");
		this.fortuneService = fortuneService;
	}
	*/
	
	
	
	@Override
	public String getDailyWorkOut() {
		
 		return "practing your backhand  volley";
	}



	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
