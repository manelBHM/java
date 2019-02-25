package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller
public class Personne {

	String firstName;
	String lastName;
	
	public Personne(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
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

	@Override
	public String toString() {
		return "Personne [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
