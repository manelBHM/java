package com.demo;

public class BaseballCoach implements Coach {

	
	//define a private for the dependency
	private FortuneService fortuneService;
	
	
	//define constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	

	@Override
	public String getDailyWorkOut() {
		return "practing 30 minutes a day";
	}

	@Override
	public String getDailyFortune() {
		// ues my fortuneSerices to get fortune 
		return fortuneService.getFortune();
	}
}
