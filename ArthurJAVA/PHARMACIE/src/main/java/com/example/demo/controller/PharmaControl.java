package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.DAO.MedicDAO;
import com.example.demo.form.FactureForm;
import com.example.demo.model.Facture;
import com.example.demo.model.Medic;

@Controller
public class PharmaControl {
	
	MedicDAO dao = new MedicDAO();
	
	List<Medic> listeMedic = new ArrayList<Medic>();
	String prix;
	
	
	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
		
		
        return "index";
    }

	@RequestMapping(value = { "/magasin" }, method = RequestMethod.GET)
    public String personList(Model model, HttpServletRequest http) {
		
		
		listeMedic = dao.getProduit();
		
		model.addAttribute("listeMedic", listeMedic);
		
		
        return "magasin";
    }
	
	@RequestMapping(value = {"/facture" })
    public String test(Model model, HttpServletRequest http) {
		
		
		
//		int prixUnitaire = Integer.parseInt(http.getParameter("${medic.name}"));
//		int quantite = Integer.parseInt(http.getParameter("${medic.name}+q"));
//		Integer multi = prixUnitaire*quantite;
//		http.setAttribute("total", multi);
		
		
		
		
        return "facture";
    }
	
	
//	@RequestMapping(value = { "/magasin" }, method = RequestMethod.POST)
//    public String post(Model model, HttpServletRequest http) {
//		
//		
//		listeMedic = dao.getProduit();		
//		model.addAttribute("listeMedic", listeMedic);
//		http.getParameter("test");
//	    
//		
//        return "test";
//    }
	
	
	
//	@RequestMapping(value = { "/facture" }, method = RequestMethod.GET)
//	public String test(Model model, HttpServletRequest http) {
//		
//        listeMedic = dao.getProduit();
//		
//		model.addAttribute("listeMedic", listeMedic);
//		
//		
//		return "facture";
//	}
	
//	@RequestMapping(value = { "/magasin" }, method = RequestMethod.POST)
//    public String savePerson(Model model, HttpServletRequest http) {
//	
//		prix = Integer.parseInt((String) http.getAttribute("quant"));
//		
//		model.addAttribute("att", prix);
//	    
//		
//		return "magasin";
//}
}


