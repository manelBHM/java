package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	
	 private static List<Person> list = new ArrayList<Person>();
	 
	    static {
	        list.add(new Person("Ahmed", "Ali"));
	        list.add(new Person("OmSarah", "Taha"));
	    }
	 
	    @RequestMapping(value = { "/", "/input" }, method = RequestMethod.GET)
	    
	    public String index(Model model) {
	 
	        String message = "welcome to our best promo";
	 
	        model.addAttribute("message", message);
	 
	        return "input";
	    }
	 
	    @RequestMapping(value = { "/output" }, method = RequestMethod.GET)
	    public String viewPersonList(Model model) {
	 
	        model.addAttribute("list", list);
	 
	        return "output";
	    }
	
	

}