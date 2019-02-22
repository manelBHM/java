package springBoot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import Dao.satgiaireDao;
import entities.Stagiaire;

@Controller
public class stagiairesController {
	List<Stagiaire> liste = new ArrayList<>();
	
	@RequestMapping("/home")
	public String pageHome(Model model) {
		return "index";
	}
	
	private satgiaireDao stdao;
	
	@RequestMapping("/ajouter")
	public String pageAjouter(Model model) {
		
		model.addAttribute("liste", liste);
		//stdao.create(stagiaire);
		return "ajouter";
	}
	
	@PostMapping("/ajouter")
	public String pageAjouter(Model model, @RequestParam(name="nom", required = false) String nom, @RequestParam(name="prenom", required = false) String prenom, @RequestParam(name="matricule", required = false) String matricule) {
		Stagiaire stagiaire = new Stagiaire(nom, prenom, prenom);
		liste.add(stagiaire);
		model.addAttribute("liste", liste);
		//stdao.create(stagiaire);
		return "ajouter";
	}
	
	
	@RequestMapping("liste")
	public String pageList(Model model) {
		model.addAttribute("liste", liste);
		return "index2";
	}
	

}
