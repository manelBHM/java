package com.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	
	//create an array of String 
	String[] data = {
			"it was not easy to code for the first time",
			"python was the first langauge to learn ",
			"my next adventure"
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		//pick a radom array
		int rdm = myRandom.nextInt(data.length);
		String rdmString = data[rdm];
		
		return rdmString;
	}

}
