package controllerS;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Stagiaire;

import org.springframework.ui.Model;


@Controller

public class ControllerS {

	
	List<Stagiaire> liste = new ArrayList<Stagiaire>();

	 @RequestMapping("/ListePersonnes")
	 
	    public String afficherListP_AvecJSTL(Model model) {
	    	liste.add(new Stagiaire(1,"Bill", "Gates"));
	        liste.add(new Stagiaire(2 ,"Steve", "Jobs"));
	      
	        model.addAttribute("personnes", liste);
	 
	        return "myjsp";
	    }
	
	
}
