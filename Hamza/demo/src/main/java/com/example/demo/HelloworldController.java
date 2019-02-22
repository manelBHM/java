package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloworldController {
	
//	@RequestMapping("/hello")
//	@ResponseBody
//	public String Hello() {
//		return "Wesh le monde ! " ;
//	}
	
	@RequestMapping("/accueil")
	@ResponseBody
	public List Accueil() {
		
		List<Personne> personnes = new ArrayList<Personne>();
		
		personnes.add(new Personne("Hamid", "Elwest"));
		personnes.add(new Personne("Tony", "Truand"));
		
		return personnes  ;
	}
	
	@RequestMapping("/")
	public String home() {
		return "listPerson.jsp";
	}
		
	
	
}
