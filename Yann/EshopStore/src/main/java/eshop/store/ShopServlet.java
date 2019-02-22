package eshop.store;

import java.io.IOException;
import java.util.*;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class ShopServlet
 */
public class ShopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<Product> productList = new ArrayList<Product>();
	Map<String, String> pSelected = new HashMap<String, String>();
	List<String> productSelected = new ArrayList<String>();
	List<String> qSelected = new ArrayList<String>();
	Map<String, String> params = new HashMap<String, String>();
	String allProducts;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShopServlet() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override

	public void init() throws ServletException {

		// TODO Auto-generated method stub

		Product t1 = new Tele ("Television", "Samsumg", 400);

		Product c1 = new Cafetiere ("Cafetiere", "Cafe-Senseo", 50);

		Product m1 = new MicroOnde ("Four", "Multifonction", 80);

		Product f1 = new Frigo ("Refrigerateur", "Whalter", 200);


		Product f = new Frigo ("Frigo", "Whirlpool", 150);

		productList.add(t1);

		productList.add(c1);

		productList.add(m1);

		productList.add(f1);
		productList.add(f);

	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//	response.getWriter().append("Served at: ").append(request.getContextPath());

		allProducts = request.getQueryString();

		if (allProducts == null)
		{
			request.setAttribute("all", allProducts);
			request.setAttribute("produit", productList);

			this.getServletContext().getRequestDispatcher("/myView.jsp").forward(request, response);

		}

		else {
			String[] splitEsper = allProducts.split("&");

			Map<String, String> params = new HashMap<String, String>();

			for (String element : splitEsper) {

				String[] splitEgal = element.split("=");

				if (splitEgal.length == 2)
				{ qSelected.add(splitEgal[0]);

				productSelected.add(splitEgal[1]);
				}

			}



			request.setAttribute("qs", qSelected);
			request.setAttribute("ps", productSelected);
			request.setAttribute("all", allProducts);
			request.setAttribute("produit", productList);

			this.getServletContext().getRequestDispatcher("/myView.jsp").forward(request, response);
		}
	}





	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//	doGet(request, response);

		String choixDelivery = request.getParameter("delivery");
		String fullname = request.getParameter("fullname");
		String address = request.getParameter("address");
		String products = request.getParameter("products");
		int postalcode = Integer.parseInt(request.getParameter("postalcode"));
		String quantity = request.getParameter("quantity");
		Delivery delivery = null;

		request.setAttribute("fullname", fullname);
		request.setAttribute("address", address);
		request.setAttribute("postalcode", postalcode);
		request.setAttribute("delivery", choixDelivery);




		Customer customer = new Customer(fullname, address, postalcode);


		switch (choixDelivery) {
		case "Home":
			delivery = new HomeDelivery();
			break;

		case "Relay":
			delivery = new RelayDelivery(0);
			break;

		case "Express":
			delivery = new  ExpressDelivery(fullname, address, postalcode);
			break;
		default:
			System.out.println("Vous n'avez pas choisis de mode de livraison");
			break;
		}


		Bill facture = new Bill(customer, delivery);


		this.getServletContext().getRequestDispatcher("/myView.jsp").forward(request, response);

	}


}

