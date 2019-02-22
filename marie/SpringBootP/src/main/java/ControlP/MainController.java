package ControlP;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ModelP.Personne;

@Controller
public class MainController {

	public static List<Personne> personnes = new ArrayList<Personne>();
	@RequestMapping("/personneList")
    public String afficherList(Model model) {
    	personnes.add(new Personne("Bill", "Gates"));
        personnes.add(new Personne("Steve", "Jones"));
      
        model.addAttribute("personnes", personnes);
 
        return "index";
    }
}
