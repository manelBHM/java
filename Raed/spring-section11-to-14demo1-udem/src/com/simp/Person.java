package com.simp;

import java.util.LinkedHashMap;

public class Person {
	
	private String firstName;
	private String lastName;
	
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	private String favariteLanguage;
	
	private String[] operatyingSystem;
	
	public Person() {
		//populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("SUD", "SUDAN");
		countryOptions.put("TCH", "TCHAT");
		countryOptions.put("GER", "GERMAN");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavariteLanguage() {
		return favariteLanguage;
	}

	public void setFavariteLanguage(String favariteLanguage) {
		this.favariteLanguage = favariteLanguage;
	}

	public String[] getOperatyingSystem() {
		return operatyingSystem;
	}

	public void setOperatyingSystem(String[] operatyingSystem) {
		this.operatyingSystem = operatyingSystem;
	}

 
	
	
}
