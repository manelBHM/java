package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {
	
	
	@RequestMapping("hello")
	public String showPage(Model theModel) {
		
		return "input.jsp";
	}
	
	
	
	

}
