package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
	

	 
	    private static List<Persone> personne = new ArrayList<Persone>();
	 
	   
	     
	       
	      
	   
	   
	    
	    @RequestMapping("/home")
		  
		  public String test (Model model) {
	    	   personne.add(new Persone("Bill", "Gates"));
		        personne.add(new Persone("Steve", "Jobs"));
			  
			  model.addAttribute("persons",personne);
			  
			return "index1";
			  
		  }
	    
	    
	 
	   /* @RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	    public String index(Model model) {
	 
	   
	 
	        model.addAttribute("message", persons);
	 
	        return "index1";
	    }*/

}
