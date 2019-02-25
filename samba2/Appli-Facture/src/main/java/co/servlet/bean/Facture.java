package co.servlet.bean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.project.shiop.Bill;
import co.project.shiop.Cafetiere;
import co.project.shiop.Customer;
import co.project.shiop.Delivery;
import co.project.shiop.Frigo;
import co.project.shiop.Product;
import co.project.shiop.Television;

public class Facture extends HttpServlet {
	private static final long serialVersionUID = 1L;

	List<Product> list = new ArrayList<Product>();

	public Facture() {
		// TODO Auto-generated constructor stub
	}

	Delivery deliver = null;
	Product produit = null;

	@Override
	public void init() throws ServletException {
		Product tv = new Television("Samsung", "TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
		Product frigo = new Frigo("BEKO", "BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130,
				false);
		Product cafe = new Cafetiere("Phillps", "Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses",
				79.99);

		list.add(tv);
		list.add(frigo);
		list.add(cafe);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String params = request.getQueryString();

		if (params == null) {
			// this.getServletContext().getRequestDispatcher("/Form.jsp").forward(request,
			// response);
		} else {

			Map<String, String> champ = new HashMap<>();

			String[] param = params.split("&");

			for (String element : param) {
				String[] parametre = element.split("=");

				if (parametre.length == 2) {
					champ.put(parametre[0], parametre[0]);
				}
			}

			String nom = champ.get("nom").replace("+", " ");
			String address = champ.get("address").replace("+", " ");

			Customer client = new Customer(nom, address);
			Bill bill = new Bill(client, null);

			String[] listUrl = champ.get("product").split("%0D%0A");

			for (String elements : listUrl) {
				String[] getParam = elements.split("%3A");
				try {
					Product produit = list.get(Integer.parseInt(getParam[0]) - 1);
					Integer quantity = Integer.parseInt(getParam[1]);
					bill.addProduct(produit, quantity);
				} catch (Exception e) {
					e.getMessage();
				}
			}

			Map<Product, Integer> facture = bill.getProducts();
			StringBuilder produit = bill.afficherFacture(facture);

			request.setAttribute("product", produit);
			request.setAttribute("nom", nom);
			request.setAttribute("address", address);

			// this.getServletContext().getRequestDispatcher("/displayForm.jsp").forward(request,
			// response);

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
