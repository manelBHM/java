package controller;
import simplon.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class shopServlet
 */
public class shopServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
	public static final String VUE ="/facture.jsp";
    ArrayList<Produit> liste = new ArrayList<Produit>();
    
    StringBuilder afficherListe;
	ProduitDAO produitdao = new ProduitDAO();
	StringBuilder str = new StringBuilder();
    
    public shopServlet() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException{
		// TODO Auto-generated method stub

		Produit televiseur = new Produit("AppleTV", "4k, full HD, Ecran incurvé, 32 Pouce", 600.0);
		Produit telephone = new Produit("Iphone 8 Plus", "7 Pouce, 200Go ,10MP", 700.0);
		Produit ordinateur = new Produit("Asus", "Windows 10, 17 Pouce, NVIDIA GFORCE", 800.0);
		Produit tablette = new Produit("Ipad", "Full HD, 9 Pouce, 32 Go", 500.0);
		Produit consol = new Produit("Plastation 4", "1T, 8 Coeur, Manette dualschoc", 300.0);
		Produit jeux = new Produit("Red Dead Redemption II", "Jeux PS4, Mode Online, 1 Joueur", 70.0);
		

		/*liste.add(televiseur);
		liste.add(telephone);
		liste.add(ordinateur);
		liste.add(tablette);
		liste.add(consol);
		liste.add(jeux);*/
    	
    	liste = new ProduitDAO().getAll();
    	
	}
    
    
    public StringBuilder afficherListe(ArrayList<Produit> liste) {

		int i = 1;
		for (Produit element : this.liste) {

			str.append(i + "- " + " " + element.getNom() + " " + element.getDescription() + " " + element.getPrix()
					+ " euros <br>");
			i++;
		}

		System.out.println("");
		return str;
	}
    /**
     * 
     */
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		if (request.getQueryString() == null) {
			
			StringBuilder afficherProduit = afficherListe(liste);
			request.setAttribute("afficherProduit", afficherProduit);
			
			this.getServletContext().getRequestDispatcher("/formulaire.jsp").forward(request, response);
		
		} else {	
			String infos = request.getQueryString();
//			request.setAttribute("infos", infos);
			
			String [] splitEspr = infos.split("&");
			
			Map <String, String> valeur = new HashMap <String, String>();
			
			for (String element : splitEspr) {
				String [] splitEquals = element.split("=");
				
				if(splitEquals.length == 2) {
				valeur.put(splitEquals[0], splitEquals[1]);	
				}
			}
			
			
			
			String nom = valeur.get("nom").replace('+', ' ');
			String prenom = valeur.get("prenom").replace('+', ' ');
			String adress = valeur.get("adress").replace('+', ' ');
			//String infoL = valeur.get("infosL").replace('+', ' ');
			
			Client client = new Client(nom, prenom, adress);
			
			Livraison liv = null;
//			String livraison = request.getParameter("livraison");
			
			switch(valeur.get("livraison")) {
			case "standar":
				liv = new Domicile();
				liv.infoLivraison();
				break;
			case "express":
				liv = new Express();
				break;
			case "retrait":
				liv = new Retrait();
				break;
			case "relay":
				liv = new Relay();
				break;
			}
			
			Facture facture = new Facture(client, liv);
			
			
//			String infosL = request.getParameter("infosL");
//			String panier = request.getParameter("panier");
			
			
//			try {
				String [] splitEnter = valeur.get("produits").split("%0D%0A");
				
				for(String element : splitEnter) {
					String [] listProduit = element.split("%3A");
				
				Produit produit = liste.get(Integer.parseInt(listProduit[0]));
				Integer quantite = Integer.parseInt(listProduit[1]);
				facture.addProduit(produit, quantite);
				}
//			}catch (Exception e) {
//			e.getMessage();
//			}
//			
			

			
			
			Map<Produit, Integer> finalfacture = facture.getProduits();
			
			StringBuilder afficher = facture.afficherFacture(finalfacture);
			request.setAttribute("afficher", afficher);
		
			this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
		// TODO Auto-generated method stub
}
}
