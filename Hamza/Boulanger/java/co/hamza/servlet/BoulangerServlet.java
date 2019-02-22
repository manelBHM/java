package co.hamza.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.hamza.facture.Facture;
import co.hamza.produits.Four;
import co.hamza.produits.Frigo;
import co.hamza.produits.Produits;
import co.hamza.produits.Television;

/**
 * Servlet implementation class BoulangerServlet
 */
public class BoulangerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Produits> liste = null;

	public BoulangerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		Television tele = new Television("LG", "Ecran OLED", 27, 1300);
		Frigo frigo = new Frigo("Samsung", "Double compartiment", 'A', 800);
		Four four = new Four("Panasonic", "Four micro-onde", 200, 80);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String params = request.getQueryString();

		if (params == null) {

			this.getServletContext().getRequestDispatcher("/Accueil.jsp").forward(request, response);
		} else {

			this.getServletContext().getRequestDispatcher("/Panier.jsp").forward(request, response);
		}

	}

	public Map<String, String> splitParameters(String queryString) {

		String[] brutParams = queryString.split("&");

		Map<String, String> params = new HashMap<String, String>();

		for (String brutParam : brutParams) {
			String[] keyAndValue = brutParam.split("=");
			if (keyAndValue.length == 2)
				params.put(keyAndValue[0], keyAndValue[1]);
		}
		return params;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
