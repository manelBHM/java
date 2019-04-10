package org.imdrmas.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.imdrmas.dao.IAutentificationAdmin;
import org.imdrmas.dao.IAutentificationClient;
import org.imdrmas.dao.ProduitPannier;
import org.imdrmas.dao.ProduitRepository;
import org.imdrmas.entities.Produits;
import org.imdrmas.service.Facture;
import org.imdrmas.users.Adminstrateur;
import org.imdrmas.users.Client;
import org.imdrmas.vente.ProduitsPannier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProduitController {

	 Client client;
	 Facture facture;
	 Adminstrateur admin;
	@Autowired
	private ProduitRepository produitRepository;
	
	  @Autowired private IAutentificationClient autentificationClient;
	  @Autowired private IAutentificationAdmin autentificationAdmin;
	  @Autowired private  ProduitPannier produitPannierDao;
	  
	
	  @RequestMapping(value="/clientlogin", method=RequestMethod.POST) public
	  String clientlogin(Model model,
	  
	  @RequestParam(name="email", required = false) String email,
	  
	  @RequestParam(name="password", required = false) String password, HttpSession
	  session) {
	  
	  client =autentificationClient.findByEmail(email); try { if(client !=
	  null) { if (client.getPassword().equals(password)) {
	  session.setAttribute("client", client);
	  model.addAttribute("client", client);
	  return "redirect:/user/accueil"; }
	  else { return "login2"; } } else { return "login2"; }
	  
	  
	  }catch(Exception e) { return "login2"; } }
	 
	 
	//  
	  @RequestMapping(value = "/user/pannier", method = RequestMethod.GET)
	  public String produitsPannier(Model model, @RequestParam(name = "page", defaultValue
	  = "0") int p,
	  
	  @RequestParam(name = "size", defaultValue = "5") int s,
	  
	  @RequestParam(name = "mc", defaultValue = "") String mc) {
	  
	  Page<Produits> pageProduits = produitRepository.chercher("%" + mc + "%", new
	  PageRequest(p, s));
	  
	  model.addAttribute("listProduits", pageProduits.getContent()); 
	  int[] pages = new int[pageProduits.getTotalPages()]; 
	  model.addAttribute("pages", pages);
	  model.addAttribute("size", s);
	  model.addAttribute("pageCourante", p);
	  model.addAttribute("mc", mc); 
	  List<ProduitsPannier> produitspan =produitPannierDao.findAll();
		model.addAttribute("produitspan", produitspan);
		  model.addAttribute("client", client);
	  return "/pannier";
	  }
	  
	  
	
	  //}
	  
	  @RequestMapping("/signup") public String signup() { return "signup"; }
	  
	  @RequestMapping(value = "/login") public String login() { return "login2"; }
	 
	
	
	  @RequestMapping(value="/adminLogin", method=RequestMethod.POST) public String
	  loginAdmin(Model model,
	  
	  @RequestParam(name="email", required = false) String email,
	  
	  @RequestParam(name="password", required = false) String password, HttpSession
	  session) {
	  
	   admin = autentificationAdmin.findByEmail(email);
	  
	  try { if(admin != null) { if (admin.getPassword().equals(password)) {
	  session.setAttribute("admin", admin); 
	  model.addAttribute("admin", admin);
	  return "redirect:/admin/accueil"; 
	  } else
	  { return "loginAdmin"; } } else { return "loginAdmin"; }
	  
	  
	  }catch(Exception e) { return "loginAdmin"; } }
	 
	
	  
	  @RequestMapping("/signupAdmin") public String signupAdmin() { return
	  "signupAdmin"; }
	  
	  
	  
	  @RequestMapping(value="/loginAdmin", method=RequestMethod.GET) public String
	  Adminlogin(Model model) { autentificationClient.findAll(); return
	  "loginAdmin"; }
	  
	  
	  
	  @RequestMapping("/createClient") public String createClient(Model model,
	  
	  @RequestParam(name="nom", required = false) String nom,
	  
	  @RequestParam(name="prenom", required = false) String prenom,
	  
	  @RequestParam(name="email", required = false) String email,
	  
	  @RequestParam(name="password", required = false) String password) { Client
	  client = new Client(prenom, nom, email, password);
	  autentificationClient.save(client); return "login2"; }
	  
	  
	  @RequestMapping("/createAdmin") public String createAdmin(Model model,
	  
	  @RequestParam(name="nom", required = false) String nom,
	  
	  @RequestParam(name="prenom", required = false) String prenom,
	  
	  @RequestParam(name="email", required = false) String email,
	  
	  @RequestParam(name="password", required = false) String password) {
	  Adminstrateur admin = new Adminstrateur(prenom, nom, email, password);
	  autentificationAdmin.save(admin); return "loginAdmin"; }
	 
	
	
	@RequestMapping(value = ("/admin/index"), method = RequestMethod.GET)
	public String index(Model model, @RequestParam(name = "page", defaultValue = "0") int p,
			@RequestParam(name = "size", defaultValue = "5") int s,
			@RequestParam(name = "mc", defaultValue = "") String mc) {

		Page<Produits> pageProduits = produitRepository.chercher("%" + mc + "%", new PageRequest(p, s));

		model.addAttribute("listProduits", pageProduits.getContent());
		int[] pages = new int[pageProduits.getTotalPages()];
		model.addAttribute("pages", pages);
		model.addAttribute("size", s);
		model.addAttribute("pageCourante", p);
		model.addAttribute("mc", mc);
		model.addAttribute("admin", admin);
		return "accueil";
	}

	
	  @RequestMapping(value = "/admin/supprimer", method = RequestMethod.GET)
	  public String delete(Model model, @RequestParam(name="id") Long id, 
			  @RequestParam(name = "size", defaultValue = "5") int size, 
			  @RequestParam(name = "mc", defaultValue = "") String mc,@RequestParam(name = "page", defaultValue = "0") int page) {
	  produitRepository.delete(id);
	  model.addAttribute("admin", admin);
	  return "redirect:/admin/index?page=" + page +
	  "&size=" + size + "&mc" + mc;
	  
	  }
	  
	  
	  
	  @RequestMapping(value = "/user/accueil", method = RequestMethod.GET)
	  public String acheterProduit2(Model model, @RequestParam(name = "page", defaultValue
	  = "0") int p,
	  
	  @RequestParam(name = "size", defaultValue = "5") int s,
	  
	  @RequestParam(name = "mc", defaultValue = "") String mc) {
	  
	  Page<Produits> pageProduits = produitRepository.chercher("%" + mc + "%", new
	  PageRequest(p, s));
	  
	  model.addAttribute("listProduits", pageProduits.getContent()); int[] pages =
	  new int[pageProduits.getTotalPages()]; model.addAttribute("pages", pages);
	  model.addAttribute("size", s); model.addAttribute("pageCourante", p);
	  model.addAttribute("mc", mc); 
	  model.addAttribute("client", client);
	  return "accueil2";
	  }
	  
	  
	  @RequestMapping(value = "/admin/form", method = RequestMethod.GET) public
	  String formProduit(Model model) { model.addAttribute("produit", new
	  Produits()); return "formProduit"; }
	  
	  @RequestMapping(value = "/admin/accueil", method = RequestMethod.GET)
	  public String acheterProduit(Model model, @RequestParam(name = "page", defaultValue
	  = "0") int p,
	  
	  @RequestParam(name = "size", defaultValue = "5") int s,
	  
	  @RequestParam(name = "mc", defaultValue = "") String mc) {
	  
	  Page<Produits> pageProduits = produitRepository.chercher("%" + mc + "%", new
	  PageRequest(p, s));
	  
	  model.addAttribute("listProduits", pageProduits.getContent()); int[] pages =
	  new int[pageProduits.getTotalPages()]; model.addAttribute("pages", pages);
	  model.addAttribute("size", s); model.addAttribute("pageCourante", p);
	  model.addAttribute("mc", mc); 
	  model.addAttribute("admin", admin);
	  return "accueil";
	  }
	  
	  @RequestMapping(value = "/admin/edider", method = RequestMethod.GET)
	  public String edit(Model model, @RequestParam(name="id") Long id) {
		  
		  //Produits produit = produitRepository.findOne(id); 
		  Produits p = produitRepository.findOne(id);
		  model.addAttribute("p", p); 
		  model.addAttribute("admin", admin);
		  return "editProduit"; 
		  }
	  
	  @RequestMapping(value = "/admin/save")
	  public String save(Model model, 
			  @RequestParam(name="designation", required = false) String designation,
			  @RequestParam(name="quantite", required = false) Integer quantite,
			  @RequestParam(name="prix", required = false) Double prix) {
		  
		  Produits produit = new Produits(designation, quantite, prix);
		  produitRepository.save(produit);
		  model.addAttribute("produit", produit);
		  model.addAttribute("admin", admin);
		  return "/confirmation";
			  }
	  
	  @RequestMapping(value = "/save", method= RequestMethod.POST)
	  public String saveEdit(Model model, 
			  @RequestParam(name="id", required = false) Long id,
			  @RequestParam(name="designation", required = false) String designation,
			  @RequestParam(name="quantite", required = false) Integer quantite,
			  @RequestParam(name="prix", required = false) Double prix) {
		  
		  Produits produit = new Produits(id, designation, quantite, prix);
		  produitRepository.save(produit);
		  model.addAttribute("produit", produit);
		  model.addAttribute("admin", admin);
		  return "/confirmation";
			  }
	  
	  @RequestMapping(value = "/") public String home() { return
	  "redirect:/user/accueil"; }
	  
	  @RequestMapping(value = "/404") public String accessDneied() { return "404";
	  }
	  
	  @RequestMapping(value="/user/ajouter", method=RequestMethod.GET)
	  public String ajouterPannier(Model model, HttpSession
			  session ,@RequestParam(name="idclient", required = false) Long id_client,
			  @RequestParam(name="id", required = false) Long id) {
		try {
			
			Produits p= produitRepository.findOne(id);
		    ProduitsPannier	p1 =produitPannierDao.findOne(id);
		if(p1!=null) {
			ProduitsPannier	p2 =produitPannierDao.findOne(id);
			int q = p2.getQuantite();
			p2.setQuantite(q+1);
		    produitPannierDao.save(p1);
		}else {
			
				p1 = new ProduitsPannier(p.getId(), p.getDesignation(), 1, p.getPrix());
			    p1.setClient(client);
			    produitPannierDao.save(p1);
			
		}
		
		} catch (Exception e) {
			
		}
		
		  
		  return "redirect:/user/accueil";
	  }
	  // supprimer un produit du pannier du client
	  @RequestMapping(value="/user/supprmier", method=RequestMethod.GET)
	  public String supprimerPannier(Model model, HttpSession
			  session ,@RequestParam(name="idclient", required = false) Long id_client,
			  @RequestParam(name="id", required = false) Long id) {
		try {
		produitPannierDao.delete(id);
		
		} catch (Exception e) {
			e.getMessage();
		}
		  return "redirect:/user/pannier";
	  }
	  
	  @RequestMapping(value="user/commande", method=RequestMethod.POST)
	  public String passerComande(Model model, @RequestParam(name="livraison", required = false) String livraison, @RequestParam(name="id_client", required = false) Long id_client) {
		  List<ProduitsPannier> produitspan =produitPannierDao.chercherParClient(id_client);
		  Map<ProduitsPannier, Integer> mapProdP = new HashMap<>();
		  for(int i=0; i<produitspan.size(); i++) {
			 
			  ProduitsPannier p =  produitspan.get(i);
		      Integer q= p.getQuantite();
			  mapProdP.put(p, q);
		  }
		
		  double total =0; for(Map.Entry<ProduitsPannier, Integer> e:
		  mapProdP.entrySet()) { total += (e.getKey().getPrix()* e.getValue()); }
		 
		  model.addAttribute("livraison", livraison);
		  model.addAttribute("total", total);
		  model.addAttribute("produitspan", produitspan);
		  model.addAttribute("client", client);
		  return "/pannier";
	  }
	  
	 
}

