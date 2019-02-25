package com.demo;

public class CricketCoach implements Coach {
	
	
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside const CricketCoach");
	}


	
	private FortuneService fortuneService;
	
	//define our new filed for emails and team;
	private String emailAddress;
	private String team;
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method..");
		this.fortuneService = fortuneService;
	}

	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method..setEmailAddress");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method..ssetTeam");
		this.team = team;
	}


	@Override
	public String getDailyWorkOut() {
		return "pratic fast bowling for 16minutes a day";
	}

	@Override
	public String getDailyFortune() {
 		return fortuneService.getFortune();
	}

}
