package com.Spring.Boot.gestionPersonnes.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Spring.Boot.gestionPersonnes.dao.personneRepository;
import com.Spring.Boot.gestionPersonnes.entities.Personne;

@Controller
public class personnesController {
	
	@Autowired
	private personneRepository pdao;
	
	
	
	
	@RequestMapping("/")
	public String index(Model model) {
	Collection<Personne> listPersonnes = pdao.findAll();
	
	model.addAttribute("listPersonnes", listPersonnes);
		return "redirect:/accueil";
	}
	
	@RequestMapping("/accueil")
	public String accueil(Model model) {
	Collection<Personne> listPersonnes = pdao.findAll();
	
	model.addAttribute("listPersonnes", listPersonnes);
		return "redirect:/accueil";
	}
	
	@RequestMapping(value="/accueil", method = RequestMethod.GET)
	public String chercherParNom(Model model,
			@RequestParam(name="page", defaultValue ="0") int page, 
			@RequestParam(name="size", defaultValue= "5") int size,
			@RequestParam(name= "mc", defaultValue="") String mc) {
	
		Page<Personne> personnes = pdao.chercherParNom("%"+mc+"%", new PageRequest(page, size));
	    model.addAttribute("listPersonnes", personnes.getContent());
	    int [] pages = new int [personnes.getTotalPages()];
	    model.addAttribute("pages", pages);
		  model.addAttribute("size", size);
		  model.addAttribute("pageCourante", page);
		  model.addAttribute("mc", mc); 
		return "accueil";
	}
	
	
	 @RequestMapping(value="/pageAjouter", method = RequestMethod.GET) 
	public String pageAjouter() 
	 {
		 return "ajouter"; 
	 }
	 
	 @RequestMapping(value= "/ajouter", method = RequestMethod.POST) 
		public String ajouter(
				Model model,
				@RequestParam(name="nom", required = false) String nom,
				@RequestParam(name="prenom", required = false) String prenom,
				@RequestParam(name="dateDaissance", required = false) String dateNissance,
				@RequestParam(name="marie", required = false) String marie,
				@RequestParam(name="version", required = false) int version,
				@RequestParam(name="nbEnfants", required = false) int nbEnfants
				) 
		 {
		 Personne p = new Personne(nom, prenom, dateNissance, marie, nbEnfants, version);
		    pdao.save(p);
		    List<Personne>	listPersonnes = pdao.findAll();
			model.addAttribute("listPersonnes", listPersonnes);
			 return "redirect:/accueil"; 
		 }
	 
	 //supprimer
	 @RequestMapping(value= "/supprimer", method = RequestMethod.GET) 
		public String supprimer(
				Model model, @RequestParam(name="id", required = false) Long id
				) 
		 {
		                pdao.deleteById(id);
		                List<Personne>	listPersonnes = pdao.findAll();
		    			model.addAttribute("listPersonnes", listPersonnes);
		    			 return "redirect:/accueil"; 
		 }
	 
	 //edider
	 @RequestMapping(value= "/edider", method = RequestMethod.GET)
	 public String edider(Model model, @RequestParam(name="id")Long id) {
	Personne p = pdao.findById(id).get();
	model.addAttribute("p", p);
		 return "update";
	 }
	 ///update 
	 @RequestMapping(value= "/update", method = RequestMethod.POST)
	 public String update(Model model,
			    @RequestParam(name="id", required = false) Long id,
			    @RequestParam(name="nom", required = false) String nom,
				@RequestParam(name="prenom", required = false) String prenom,
				@RequestParam(name="dateDaissance", required = false) String dateNissance,
				@RequestParam(name="marie", required = false) String marie,
				@RequestParam(name="version", required = false) int version,
				@RequestParam(name="nbEnfants", required = false) int nbEnfants) {
		 Personne p = new Personne(id, nom, prenom, dateNissance, marie, nbEnfants, version);
		    pdao.save(p);
		    List<Personne>	listPersonnes = pdao.findAll();
			model.addAttribute("listPersonnes", listPersonnes);
		 return "redirect:/accueil";
	 }

}
