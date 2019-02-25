package co.epharma.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.epharma.client.Client;
import co.epharma.client.Historique;
import co.epharma.dao.EPharmaDao;
import co.epharma.facture.Facture;
import co.epharma.livraison.Domicile;
import co.epharma.livraison.Express;
import co.epharma.livraison.Livraison;
import co.epharma.livraison.Relais;
import co.epharma.produit.Produit;

public class EPharmaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<Produit> liste = new ArrayList<Produit>();
	ArrayList<Historique> listeHistorique = new ArrayList<Historique>();
	ArrayList<Historique> listeHistorique2 = new ArrayList<Historique>();
	StringBuilder afficherListe;
	StringBuilder enregistrerHistorique;
	EPharmaDao epharmadao = new EPharmaDao();
	StringBuilder str;

	public EPharmaServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		try {

			liste = epharmadao.getProduit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		super.init();
	}

	public StringBuilder afficherListe(ArrayList<Produit> liste) {
		str = new StringBuilder("");

		int i = 1;
		for (Produit element : this.liste) {

			str.append(i + "- " + " " + element.getNom() + " " + element.getDescription() + " " + element.getPrix()
					+ " euros <br>");
			i++;
		}

		System.out.println("");
		return str;
	}

	public StringBuilder afficherHistorique(ArrayList<Historique> liste) {
		str = new StringBuilder("");
		
		
		for (Historique element : this.listeHistorique) {

			str.append(element.getDate()).append(" : ").append(element.getHistorique() + " <br>");
			
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

			this.getServletContext().getRequestDispatcher("/ParaMedoc.jsp").forward(request, response);

		} else {

			String[] splitEsper = chaineUrl.split("&");

			Map<String, String> params = new HashMap<String, String>();

			for (String element : splitEsper) {

				String[] splitEgal = element.split("=");
				if (splitEgal.length == 2)
					params.put(splitEgal[0], splitEgal[1]);
			}

			String nom = params.get("nom").replace('+', ' ');
			String adresse = params.get("adresse").replace('+', ' ');

			Client client = new Client(nom, adresse);

			Livraison livraison = null;

			switch (params.get("livraison")) {

			case "domicile":
				livraison = new Domicile();
				break;
			case "express":
				livraison = new Express();
				break;
			case "relais":
				livraison = new Relais();
				break;
			}

			Facture facture = new Facture(client, livraison);

			String[] produitsUrl = params.get("produits").split("%0D%0A");

			for (String element : produitsUrl) {
				String[] produitQuantite = element.split("%3A");

				Produit produit = liste.get(Integer.parseInt(produitQuantite[0]) - 1);
				Integer quantite = Integer.parseInt(produitQuantite[1]);
				facture.addProduit(produit, quantite);
			}

			Map<Produit, Integer> listeProduits = facture.getProduits();

			StringBuilder afficher = facture.afficherFacture(listeProduits);
			request.setAttribute("afficher", afficher);

			StringBuilder afficherHistorique = facture.remplirHistorique(listeProduits);
			request.setAttribute("afficherHistorique", afficherHistorique);

			try {

				listeHistorique = epharmadao.setHistorique(client, afficherHistorique);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}

		try {
			listeHistorique2 = epharmadao.getHistorique(client);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StringBuilder afficherHistor = afficherHistorique(listeHistorique2);
			
		
		request.setAttribute("afficherHistor", afficherHistor);
		
		

			this.getServletContext().getRequestDispatcher("/Panier2.jsp").forward(request, response);

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
