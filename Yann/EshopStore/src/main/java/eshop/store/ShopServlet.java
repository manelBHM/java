package eshop.store;


import java.io.IOException;
import java.sql.SQLException;
import java.util.*;


import DAO.*;


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

		//DataConnection.deleteProductInMyBDD(null);

		//  DataConnection.saveProductInMyBDD("name", "description", price);

		//   DataConnection.updateProdutcInMyBDD(4, "Aspirateur", "Dyson, Noir", 150);


		DataConnection d = new DataConnection();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			productList = d.getAllProducts();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//	response.getWriter().append("Served at: ").append(request.getContextPath());

		String allProducts = request.getQueryString();

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

				{ 
					params.put(splitEgal[0], splitEgal[1]);
				}
			}


			String nom = params.get("fullname").replace('+', ' ');
			String adresse = params.get("address").replace('+', ' ');
			String post = params.get("postalcode").replace('+', ' ');

			String p = request.getParameter("products");

			Delivery delivery = null;

			Customer customer= new Customer(nom, adresse, Integer.parseInt(post));



			switch (params.get("delivery")) {

			case "domicile":
				delivery = new HomeDelivery();
				break;
			case "express":
				delivery = new ExpressDelivery(nom, adresse, Integer.parseInt(post));
				break;
			case "relais":
				delivery = new RelayDelivery(0);
				break;
			}







			String[] produitsUrl = allProducts.split("products=");

			Map<String, String> param = new HashMap<String, String>();
			List<String> l = new ArrayList<String>();

			for (String element : produitsUrl) {

				String[] produitQuantite = element.split("&");

				if (produitQuantite.length == 2)

				{ 
					l.add(produitQuantite[0]);
					l.add(produitQuantite[1]);
					param.put(produitQuantite[0], produitQuantite[1]);
				}

			}








			//	double price = Double.parseDouble(params.get("products"));


			//	Product p = new Product(params.get("products"), " ", price);

			Bill bill = new Bill(customer, delivery);

			/*
			bill.addProducts(p, qte);

			bill.calcuTotal();

			bill.getProducts();

			System.out.println(bill);
			 */

			request.setAttribute("nom", nom);
			request.setAttribute("adress", adresse);
			request.setAttribute("postalcode", post);
			request.setAttribute("produit", productList);


			this.getServletContext().getRequestDispatcher("/myView.jsp").forward(request, response);
		}
	}





	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		//	this.getServletContext().getRequestDispatcher("/myView.jsp").forward(request, response);

	}


}

