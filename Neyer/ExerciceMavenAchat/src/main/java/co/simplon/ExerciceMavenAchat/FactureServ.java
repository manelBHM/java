package co.simplon.ExerciceMavenAchat;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FactureServ
 */
@WebServlet("/FactureServ")
public class FactureServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FactureServ() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		String allInfo = request.getQueryString();// recupère toutes les données du l'URL dans un String

		HashMap<String, String> listClient = new HashMap<String, String>();

		if (allInfo == null) {// s'il n'y a pas de données il vas à la jsp fenetre
			this.getServletContext().getRequestDispatcher("/fenetre.jsp").forward(request, response);

		} else {// sino il affiche ce qu'il a dans le string getQueryString

			request.setAttribute("info", allInfo); // met les donnes dans un attribu qu'on pour pouvoir l'envoyer a la
													// jsp pour qu'il l'affiche

			listClient = recupereParametre(allInfo);

			for (Map.Entry<String, String> ls : listClient.entrySet()) {

				// System.out.println(ls.keySet()+":"+ls.values());
			}

			this.getServletContext().getRequestDispatcher("/test1.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);

		String nomClient = request.getParameter("nom");
		String adresseClient = request.getParameter("adresse");
		String listProduit = request.getParameter("listPro");

		this.getServletContext().getRequestDispatcher("/test1.jsp").forward(request, response);
	}

	// methode qui isole les données d'un getQueryString et le met dans une list map
	public HashMap<String, String> recupereParametre(String allparam) {

		HashMap<String, String> laListe = new HashMap<String, String>();// création d'une list qui gardera les données
																		// avec comme cle l'identifiant et comme valeur
																		// la réponse

		String[] paireParametre = allparam.split("&");// rempli un tableau des données coupé par &
		String[] leParametre = null;
		for (int i = 0; i < paireParametre.length; i++) {

			leParametre = paireParametre[i].split("=");
		}

		for (int i = 0; i < leParametre.length; i++) {

			laListe.put(leParametre[0], leParametre[1]);

		}
		return laListe;
	}
}
