package simplon.co.springBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import personne.Personne;

@Controller
public class appThymeleaf {

	@RequestMapping("/")
	public String myApp(Model model) {
		
		model.addAttribute("p1", new Personne("Anne-Marie", "Stephe"));
		model.addAttribute("p2", new Personne("Claud", "Bernard"));
		
		return "index.jsp";
	}
}
