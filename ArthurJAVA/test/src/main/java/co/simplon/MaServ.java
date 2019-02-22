package co.simplon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MaServ
 */
public class MaServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	List<Produit> listeProd = new ArrayList();
	Map<Produit, Integer> map2 = new HashMap<Produit, Integer>();
	String prod;
	String quantitey;
	Livraison liv;

	public MaServ() {
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String chaineUrl = request.getQueryString();
		
		if (request.getQueryString() == null) {
			
			
			init();
			request.setAttribute("liste", listeProd);
			
			

			this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

		}

		else {
			
			String[] splitEsper = chaineUrl.split("&");

			Map<String, String> params = new HashMap<String, String>();

			for (String element : splitEsper) {

				String[] splitEgal = element.split("=");
				if (splitEgal.length == 2)
					params.put(splitEgal[0], splitEgal[1]);
			}

			String nom = params.get("nom").replace('+', ' ');
			String adresse = params.get("adresse").replace('+', ' ');
			int id = Integer.parseInt(params.get("id").replace('+', ' '));
			
			Client client = new Client(nom, adresse, id);

			Livraison livraison = null;

			switch (params.get("livraison")) {

			case "domicile":
				livraison = new Domicile();
				break;
			case "express":
				livraison = new Express();
				break;
			case "relais":
				livraison = new Relay();
				break;
			case "surPlace":
				livraison = new Takeway();
				break;
			}

			Facture facture = new Facture(client, livraison);

			String[] produitsUrl = params.get("produits").split("%0D%0A");

			for (String element : produitsUrl) {
				String[] produitQuantite = element.split("%3A");

				Produit produit = listeProd.get(Integer.parseInt(produitQuantite[0]) - 1);
				Integer quantite = Integer.parseInt(produitQuantite[1]);
				facture.addProduct(produit, quantite);
			}

			Map<Produit, Integer> listeProduits = facture.getProduits();

			StringBuilder afficher = facture.afficherFacture(listeProduits);
			request.setAttribute("afficher", afficher);

			this.getServletContext().getRequestDispatcher("/output.jsp").forward(request, response);

		}

			
			
			
			
			
			
//			Map<String, String> map = new HashMap<String, String>();
//			Domicile dom = new Domicile();
//			Express exp = new Express();
//			Relay relay = new Relay();
//			Takeway take = new Takeway();
//			String chaine = request.getQueryString();
//			String fullname = request.getParameter("fullname");
//			String adress = request.getParameter("adress");
//			int id = Integer.parseInt(request.getParameter("ID"));
//			Integer.parseInt(request.getParameter("ID"));
//			Client client = new Client(fullname, adress, id);
//			request.setAttribute("client", client);
//
//			switch (request.getParameter("livraison")) {
//
//			case "dom":
//				liv = dom;
//				break;
//
//			case "exp":
//				liv = exp;
//				break;
//
//			case "rel":
//				liv = relay;
//				break;
//
//			case "take":
//				fullname = fullname + " HALLO ";
//				liv = take;
//				String x = take.getInfo();
//				request.setAttribute("info", x);
//
//			}
//
//			Facture bill = new Facture(client, liv);
//
//			String choixProduits = request.getParameter("choixproduit");
//
//			request.setAttribute("test", choixProduits);
//
//			String[] tabProd = choixProduits.split("%0D%0A");
//
//			request.setAttribute("tab", tabProd);
//
//			for (String p : tabProd) {
//				String[] tabProd2 = p.split(":");
//				Produit v1 = listeProd.get(Integer.parseInt(tabProd2[0]));
//				int v2 = Integer.parseInt(tabProd2[1]);
//				map2.put(v1, v2);
//			}
//
//			for (Entry<Produit, Integer> entry : map2.entrySet()) {
//
//				bill.addProduct(entry.getKey(), entry.getValue());
//			}
//
//			double total = bill.totalProduit(map2);
//			request.setAttribute("total", total);
//
//			/*
//			 * Map<String, String> queryMap = getQueryMap(chaine);
//			 * 
//			 * Client client = new Client(queryMap.get("fullname"), queryMap.get("adress"),
//			 * Integer.parseInt(queryMap.get("ID")));
//			 * 
//			 * if( queryMap.get("dom") != null){ Facture facture = new Facture(client, dom);
//			 * } else if (queryMap.get("express") != null) { Facture facture = new
//			 * Facture(client, exp); } else if (queryMap.get("relay") != null) { Facture
//			 * facture = new Facture(client, relay); } else if (queryMap.get("takeway") !=
//			 * null) { Facture facture = new Facture(client, take); }
//			 * 
//			 * //Map<String, String> secondQuery = getProdInQuery(chaine); String[] x =
//			 * chaine.split("&");
//			 * 
//			 */
//
//			// request.setAttribute("secondQuery", x);

			this.getServletContext().getRequestDispatcher("/WEB-INF/output.jsp").forward(request, response);

		}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	public void init() {

		//ProductDAO p = new ProductDAO();
		
		ProductDAO p = new ProductDAO();
		
		listeProd = p.getProduit();

	}

	public Map<String, String> getQueryMap(String query) {
		String[] params = query.split("&");
		Map<String, String> map = new HashMap<String, String>();
		for (String param : params) {
			String name = param.split("=")[0];
			String value = param.split("=")[1];
			map.put(name, value);
		}
		return map;
	}

	public List<String> getQueryMap2(String query) {
		String[] params = query.split("&");
		List<String> liste = new ArrayList<String>();
		for (String param : params) {
			String name = param.split("=")[0];
			String value = param.split("=")[1];

			liste.add(name);
			liste.add(value);

		}
		return liste;
	}

}
