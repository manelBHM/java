package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.ui.Model;


@Controller
public class HelloWorldController {

	
	List<Personne> liste = new ArrayList<Personne>();

	 @RequestMapping("/ListePersonnes")
	 
	    public String afficherListP_AvecJSTL(Model model) {
	    	liste.add(new Personne("Bill", "Gates"));
	        liste.add(new Personne("Steve", "Jobs"));
	      
	        model.addAttribute("personnes", liste);
	 
	        return "myjsp";
	    }

}
