package com.test;

import org.springframework.stereotype.Component;

@Component
public class FootBall implements Sport {

	@Override
	public String dailyWorkOut() {
		 	return "Playing 30 minutes a day";
	}

	@Override
	public String getLeague() {
		// TODO Auto-generated method stub
		return null;
	}

}
