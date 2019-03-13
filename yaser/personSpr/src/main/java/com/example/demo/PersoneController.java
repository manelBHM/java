package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersoneController {

	
	private static List<Persone> personne = new ArrayList<Persone>();
	
	  static {
	        personne.add(new Persone("Bill", "Gates"));
	        personne.add(new Persone("Steve", "Jobs"));
	    }
	  
	  @GetMapping("/personne")
	  
	  public String test (Model model) {
		  
		  model.addAttribute("personne",personne);
		  
		return "index";
		  
	  }
	  
	  
}
