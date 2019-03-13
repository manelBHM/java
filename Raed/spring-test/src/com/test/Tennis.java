package com.test;

import org.springframework.stereotype.Component;

@Component
public class Tennis implements Sport {

	
	private String name;
	private String email;
	
	private Europe europe;
	
	public Tennis() {
		
	}
	
 
	public void setEurope(Europe europe) {
		this.europe = europe;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
 
	public void setEmail(String email) {
		this.email = email;
	}

 
	@Override
	public String dailyWorkOut() {
		 	return "Winning a tennis match !!";
	}

	@Override
	public String getLeague() {
		
		return europe.getLeague();
	}

}
