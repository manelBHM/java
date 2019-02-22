package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	public static List<Personne> personnes = new ArrayList<Personne>();
	
	/*static {
		personnes.add(new Personne("Bill", "Gates"));
		personnes.add(new Personne("Steve", "Jones"));
	}
	
	@RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
	public String index(Model model) {
		String message = "Hello World!";
		model.addAttribute("message", message);
		return "index";
	}
	
	@RequestMapping(value = {"/personneList"}, method = RequestMethod.GET)
	public String vewPersonneList(Model model) {
		model.addAttribute("personnes", personnes);
		return "personneList";
	}*/
	
	@RequestMapping("/ListePersonnesAvecJstl")
    public String afficherListP_AvecJSTL(Model model) {
    	personnes.add(new Personne("Bill", "Gates"));
        personnes.add(new Personne("Steve", "Jobs"));
      
        model.addAttribute("personnes", personnes);
 
        return "ListP_jstl";
    }
}
