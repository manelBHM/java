package co.hamza.darty.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.hamza.darty.client.Client;
import co.hamza.darty.dao.ProduitsDAO;
import co.hamza.darty.facture.Facture;
import co.hamza.darty.produit.Four;
import co.hamza.darty.produit.Frigo;
import co.hamza.darty.produit.Produit;
import co.hamza.darty.produit.Tele;
import co.hamza.livraison.ADomicile;
import co.hamza.livraison.Express;
import co.hamza.livraison.Livraison;
import co.hamza.livraison.Relay;
import co.hamza.livraison.SurPlace;

@WebServlet("/DartyServlet")
public class DartyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<Produit> liste = new ArrayList<Produit>();
	StringBuilder afficherListe;
	ProduitsDAO produitdao = new ProduitsDAO();
	StringBuilder str = new StringBuilder();

	public DartyServlet() {
	}

	@Override
	public void init() throws ServletException {
//		Tele tele = new Tele("Samsung", "Téléviseur LED rond", 900, 40);
//		Four four = new Four("LG", "Four micro-onde à double rotative", 70, 100);
//		Frigo frigo = new Frigo("Siemens", "Frigo qui fait du froid", 200, 'A');
//
//		liste.add(tele);
//		liste.add(four);
//		liste.add(frigo);
			
		try {
			liste = produitdao.getAll();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String chaineUrl = request.getQueryString();

		if (chaineUrl == null) {
			
			StringBuilder afficherProduits = afficherListe(liste);
			request.setAttribute("afficherProduits", afficherProduits);

			this.getServletContext().getRequestDispatcher("/Accueil.jsp").forward(request, response);

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
				livraison = new ADomicile();
				break;
			case "express":
				livraison = new Express();
				break;
			case "relais":
				livraison = new Relay();
				break;
			case "surPlace":
				livraison = new SurPlace();
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

			this.getServletContext().getRequestDispatcher("/Panier.jsp").forward(request, response);

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

}
