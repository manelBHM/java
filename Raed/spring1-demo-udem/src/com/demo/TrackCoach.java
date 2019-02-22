package com.demo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	TrackCoach(){
		
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}




	@Override
	public String getDailyWorkOut() {
 
		return "Run hard 5k";
	}




	@Override
	public String getDailyFortune() {
 		return "Do it baby"+fortuneService.getFortune();
	}
	
	//add an init method
	public void doInitMethod() {
		System.out.println("TrackCoach inside : doInitMethod");
	}
	
	//add a destroy method
	public void doDestroyMethod() {
		System.out.println("TrackCoach inside : doDestroyMethod");
	}
}
