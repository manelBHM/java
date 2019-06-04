package com.promo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	
	//need a controller to show the initial html form
	@RequestMapping("/showForm")
	public String showForm() {
		
		return "helloworld-form";
	}
	
	
	//need a controller to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "hello-form";
	}

}