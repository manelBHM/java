package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.ui.Model;




@Controller
public class StgController {
	public static List<Stagier> list = new ArrayList<Stagier>();
	static {
		list.add(new Stagier("Yann", "Rock", "G2002E"));
		list.add(new Stagier("Ships", "Haq", "H2002E"));
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("list", list);
		return "index";
	}
	
	@GetMapping("/addStagier")
	public String addStagier() {
		return "addStagier";
	}
	
	
	
	@PostMapping("/addStagier")
	public String postStagier(Model m, @RequestParam(name="prenom", required = false) String prenom, @RequestParam(name = "nom", required = false) String nom, 
			@RequestParam(name = "matricule", required = false) String matricule) {
		list.add(new Stagier(prenom, nom, matricule));
		m.addAttribute("list", list);
		return "index";
	}
	

}
