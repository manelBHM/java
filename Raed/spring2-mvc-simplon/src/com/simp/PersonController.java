package com.simp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {

	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//create person object 
		Person thePerson = new Person();
		
		//add object to the model
		theModel.addAttribute("person", thePerson);
		
		return "person-form";
	}
	
	
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("person") Person thePerson) {
		
		 System.out.println("the Person" +thePerson.getFirstName()+" "+thePerson.getLastName());
		return "person-confirmation";
	}
	
	
	
	
	
}
