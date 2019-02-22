package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {
	
	private static List <Stagiaires> st = new ArrayList <Stagiaires> ();
	
	static {
		st.add(new Stagiaires("Frank","Grappy","G1234"));
	    st.add(new Stagiaires("Thierry","Legrand","G5678"));
	}
	
	@GetMapping("/index")
	
	public String test (Model model) {
		
		model.addAttribute("st",st);
		
		return "index";
	}
	
@GetMapping("/input")
	
	public String test1 (Model model) {
	
    
		
		return "input";
	}




@GetMapping("/out")

public String test2(Model model, @RequestParam(value="nom", required=false) String nom, @RequestParam(value="prenom", required=false) String prenom,  @RequestParam(value="matricule", required=false) String matricule) 
{

	
		 st.add(new Stagiaires(nom,prenom,matricule));

	
	
 
 model.addAttribute("st",st);
 
 
	return "out";
}
	

}
