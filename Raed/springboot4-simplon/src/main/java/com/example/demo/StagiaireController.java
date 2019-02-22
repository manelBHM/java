package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("/home")
public class StagiaireController {
	
	
	@Autowired
	private SaveAndAdd saveAndAdd;
	
	@RequestMapping("/stag")
	public String home(Model theModel) {
		
		List<Stagiaire> st = new ArrayList<Stagiaire>();
 
		String salut = "Bienvenu dans l'annauaire des stagiaire";
		
		st.add( new Stagiaire("RAed","Bukhary","G3333"));
		
		List<Stagiaire> list = saveAndAdd.showList();
		
		
		theModel.addAttribute("list", list);
		
		theModel.addAttribute("welcome", salut);
		
		
		return "home";
	}
	
	
	
	
	
	

}
