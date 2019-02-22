package com.stage.stagiaire;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

	private static List<Stagiare> stg = new ArrayList<>();

	static {
		stg.add(new Stagiare("Legrand", "Frank", 1234));
		stg.add(new Stagiare("Lepetit", "Marc", 1267));
	}

//	@RequestMapping("/list_stagiare")
//	public String diplayStagiare(Model model) {
//		ListStagiare stagiares = new ListStagiare();
//		List<Stagiare> listStagire = stagiares.getListStagiare();
//		model.addAttribute("stage", listStagire);
//
//		return "createStagiare";
//	}

	@RequestMapping("/list_stagiare")
	public String diplayStagiare(Model model) {

		model.addAttribute("stg", stg);

		return "createStagiare";
	}

	@RequestMapping("/out")
	public String diplayOut(Model model, @RequestParam(value = "nom", required = false) String nom,
			@RequestParam(value = "prenom", required = false) String prenom,
			@RequestParam(value = "matricule", required = false) int matricule) {

		stg.add(new Stagiare(nom, prenom, matricule));
		model.addAttribute("stg", stg);
		return "out";
	}

//	@RequestMapping("/createStagiare")
//	public String getStagiareForm(@ModelAttribute ListStagiare stagiares) {
//		return "stagiare";
//	}

//	@RequestMapping(value = "/createStagiare", method = RequestMethod.POST)
//	public String getStagiare(@ModelAttribute(name = "Stagiare") Stagiare Stagiare, Model model) {
//		String nom = Stagiare.getNom();
//		String prenom = Stagiare.getPrenom();
//		int matricule = Stagiare.getMatricule();
//
//		if ("admin".equals(nom) && "admin".equals(prenom) && "admin".equals(matricule)) {
//			return "show";
//		}
//
//		model.addAttribute("invalideField", true);
//
//		return "createStagiare";
//	}

//	@RequestMapping(value = "/list_stagiare", method = RequestMethod.GET)
//	public String diplayStagiare() {
//		return "createStagiare";
//	}
//

//	@RequestMapping(value = "/createSatagiare", method = RequestMethod.GET)
//	public String read() {
//		return "createSatagiare";
//	}

}
