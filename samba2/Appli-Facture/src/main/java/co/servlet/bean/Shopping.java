package co.servlet.bean;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dao.ProductDao;
import co.project.shiop.Bill;
import co.project.shiop.Customer;
import co.project.shiop.Delivery;
import co.project.shiop.DirectDelivery;
import co.project.shiop.ExpressDelivery;
import co.project.shiop.Product;
import co.project.shiop.RelayDelivery;
import co.project.shiop.TakeAwayDelivery;

/**
 * Servlet implementation class Shopping
 */
public class Shopping extends HttpServlet {
	private static final long serialVersionUID = 1L;

	List<Product> list = new ArrayList<>();

	public Shopping() {
		super();
	}

	public StringBuilder showList(List<Product> product) {
		int i = 0;
		StringBuilder st = new StringBuilder("");
		for (Product element : product) {
			st.append(i++ + " " + element.getName() + " - " + element.getDescription() + " - " + element.getPrice()
					+ "<br/>");
		}
		System.out.println("");
		return st;
	}

	Product product = null;

	public void init() {
		// Product tv = new Television("Samsung", "TV Samsung UE49MU6292",
		// "Smart TV LED incurvée 49\"", 599, 49, "LED");
		// Product frigo = new Frigo("BEKO", "BEKO TSE 1042 F", "Réfrigérateur
		// BEKO 130L - Classe A+ - blanc", 189, 130,
		// false);
		// Product cafe = new Cafetiere("Phillps", "Philips HD7866/61", "Philips
		// SENSEO Quadrante, Noir - 1 ou 2 tasses",
		// 79.99);
		//
		// list.add(tv);
		// list.add(frigo);
		// list.add(cafe);

		try {
			list = new ProductDao().retrieveDataBase();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String params = request.getQueryString();

		if (params == null) {

			StringBuilder showDataBase = showList(list);
			request.setAttribute("showDataBase", showDataBase);

			this.getServletContext().getRequestDispatcher("/Form.jsp").forward(request, response);
		} else {

			Map<String, String> getchamp = new HashMap<>();
			String[] param = params.split("&");

			for (String paramSplit : param) {
				String[] parameter = paramSplit.split("=");

				if (parameter.length == 2) {
					getchamp.put(parameter[0], parameter[1]);
				}
			}

			Delivery deliver = null;

			String nom = getchamp.get("nom").replace("+", " ");
			String address = getchamp.get("address").replace("+", " ");
			String de = getchamp.get("champ");

			switch (getchamp.get("modeLivrason")) {
			case "direct":
				deliver = new DirectDelivery();
				break;
			case "express":
				deliver = new ExpressDelivery();
				break;
			case "relay":
				deliver = new RelayDelivery();
				break;
			case "takeway":
				deliver = new TakeAwayDelivery();
				break;
			}

			Customer client = new Customer(nom, address);
			Bill bill = new Bill(client, deliver);

			// Map<Product, Integer> products = new HashMap<>();

			String[] paramProduct = getchamp.get("product").split("%0D%0A");

			for (String element : paramProduct) {
				String[] paramprod = element.split("%3A");
				try {
					Product produit = list.get(Integer.parseInt(paramprod[0]));
					Integer quantity = Integer.parseInt(paramprod[1]);
					bill.addProduct(produit, quantity);
				} catch (Exception e) {
					e.getMessage();
				}

			}

			Map<Product, Integer> facture = bill.getProducts();
			StringBuilder affiche = bill.afficherFacture(facture);
			request.setAttribute("product", affiche);

			this.getServletContext().getRequestDispatcher("/displayForm.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
