package co.pharma.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.pharma.client.Client;
import co.pharma.dao.ProduitDAO;
import co.pharma.facture.Facture;
import co.pharma.produit.Produit;


public class PharmacieServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	ArrayList<Produit> liste = new ArrayList<Produit>();
	StringBuilder afficherListe;
	ProduitDAO pdao = new ProduitDAO();
	StringBuilder str = new StringBuilder();
	
	@Override
	public void init() throws ServletException {
		try {
			liste = pdao.getAll();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public StringBuilder afficherListe(ArrayList<Produit> liste) {
		int i = 1;
		for (Produit element : this.liste) {
			str.append(i + " - " + element.getNom() + " : " + element.getPrix() + " Euros<br>"
					+ element.getDescription() + " | Il nous reste : " + element.getQuantite() +
					" unité(s) en stock.<br><br>");
			i++;
		}
		System.out.println("");
		return str;
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String chaineUrl = request.getQueryString();
		
		if (chaineUrl == null) {
			StringBuilder afficherProduits = afficherListe(liste);
			request.setAttribute("afficherProduits", afficherProduits);
			this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			liste.removeAll(liste);

		} else {
			
			String[] splitEsper = chaineUrl.split("&");
			
			Map<String, String> params = new HashMap<String, String>();
			
			for(String element : splitEsper) {
				String[] splitEgal =  element.split("=");
				if (splitEgal.length == 2) {
					params.put(splitEgal[0], splitEgal[1]);
				}
			}
			
			String nom = params.get("nom").replace('+', ' ');
			String prenom = params.get("prenom").replace('+', ' ');
			
			Client client = new Client (nom, prenom);
			
			Facture facture = new Facture(client);
			
			String[] produitsUrl =  params.get("panier").split("%0D%0A");
			
			for (String element : produitsUrl) {
				String[] produitQuantite = element.split("%3A");
				
				Produit produit = liste.get(Integer.parseInt(produitQuantite[0]) - 1);
				Integer quantite = Integer.parseInt(produitQuantite[1]);
				facture.addProduit(produit, quantite);
			}
			
			Map<Produit, Integer> listeProduits = facture.getProduits();
			
			StringBuilder afficher = facture.afficherFacture(listeProduits);
			request.setAttribute("afficher", afficher);
			this.getServletContext().getRequestDispatcher("/facture.jsp").forward(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
