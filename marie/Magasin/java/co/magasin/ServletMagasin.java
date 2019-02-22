package co.magasin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.livraison.AEmporter;
import co.livraison.Delivery;
import co.livraison.Domicile;
import co.livraison.Express;
import co.livraison.Relais;


public class ServletMagasin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ArrayList<Produit> liste = new ArrayList<Produit>();
	
    public ServletMagasin() {	
    }
    
    @Override
	public void init() throws ServletException {
    	
    	Produit Televiseur = new Produit("Panasonic - UTHDWOW", "Avec ce televiseur vous pourrez regarder les plus belles emissions tel que 'TPMP' ou 'Les Anges de la Teleralite' ...", 499.90);
		Produit Aspirateur = new Produit("Dyson - Typhon", "Ce model aspire comme jaja ! Il parait même qu'il aspire les âmes.", 299.90);
		Produit Micro_onde = new Produit("LG - TheAtomicOne", "Parfait pour votre cuisine, ce micro onde cuit de tout a�la perfection, il suffit de choisir le bon mode !", 149.90);
		Produit Ordinateur = new Produit("MacBook Pro", "WOW ! C'est l'ultime ordinateur par Apple ! (Jusqu'a ce qu'ils en sortent un nouveau dans 6 mois ...)", 2999.90);
		Produit Telephone = new Produit("iPhone", "WOW ! C'est l'ultime telephone par Apple ! (Jusqu'a ce qu'ils en sortent un nouveau dans 6 mois ...)", 1999.90);
		Produit Lave_linge = new Produit("Whirlpool", "Ce lave linge, lave plus blanc que blanc !", 390.90);
		Produit Refregirateur  = new Produit("LG - Groenland", "Economique et efficace, le frigo qu'il vous faut.", 149.90);
    	
		liste.add(Televiseur);
		liste.add(Aspirateur);
		liste.add(Micro_onde);
		liste.add(Ordinateur);
		liste.add(Telephone);
		liste.add(Lave_linge);
		liste.add(Refregirateur);
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getQueryString() == null) {
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/viewFormulaire.jsp").forward(request, response);
		
		} else {	
			
			String infos = request.getQueryString();
			request.setAttribute("infos", infos);
			
			/****************************************/
			
			Delivery del = null;
			String livraison = request.getParameter("livraison");
			
			switch(livraison) {
			case "domicile":
				del = new Domicile();
				del.getInfo();
				break;
			case "express":
				del = new Express();
				break;
			case "ptrelais":
				del = new Relais();
				break;
			case "aretirer":
				del = new AEmporter();
				break;
			}
			
			String infosL = request.getParameter("infosL");
			String panier = request.getParameter("panier");
			
			String [] splitEspr = infos.split("&");
			
			HashMap <String, String> valeur = new HashMap <String, String>();
			
			for (String element : splitEspr) {
				String [] splitEquals = element.split("=");
				
				if(splitEquals.length == 2) {
				valeur.put(splitEquals[0], splitEquals[1]);	
				}
				
			}
			
			String nom = valeur.get("prenomNom").replace('+', ' ');
			String adresse = valeur.get("adresse").replace('+', ' ');
			String infoL = valeur.get("infosL").replace('+', ' ');
			
			Client client = new Client(nom,adresse);
			Facture facture = new Facture(client, del);
			
			try {
				String [] splitEnter = valeur.get("panier").split("%0D%0A");
				
				for(String element : splitEnter) {
					String [] listeProduit = element.split("%3A");
					
					Produit produit = liste.get(Integer.parseInt(listeProduit[0]) -1);
					Integer quantite = Integer.parseInt(listeProduit[1]);
					facture.addProduit(produit, quantite);
				}
			}catch (Exception e) {
				e.getMessage();
			}
			
			
			
			Map<Produit, Integer> finalfacture = facture.getProducts();
			
			StringBuilder afficher = facture.afficherFacture(finalfacture);
			request.setAttribute("afficher", afficher);
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/viewFacture.jsp").forward(request, response);
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		
	}

}
