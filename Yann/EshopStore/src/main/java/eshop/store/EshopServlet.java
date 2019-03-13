package eshop.store;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import eshop.store.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class EshopServlet
 */
public class EshopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String prodSelected;
	double prodPrice;
	double total;
	String livraisonSelected, x;
	double selectedLivraisonPrice;
	int codePostale;
	List<Product> productList = new ArrayList<Product>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EshopServlet() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		Product t1 = new Tele ("Télévision", "Samsumg UE49MU6292", 400);
		Product c1 = new Cafetiere ("Cafétière", "Cafe Senseo", 50);
		Product m1 = new MicroOnde ("Four", "Multifonction", 80);
		Product f1 = new Frigo ("Réfrigerateur", "Whalter", 200);
		
		productList.add(t1);
		productList.add(c1);
		productList.add(m1);
		productList.add(f1);
		
	
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(final HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//	response.getWriter().append("Served at: ").append(request.getContextPath());

		String allProducts = request.getQueryString();
		if(allProducts == null)
		{	
			request.setAttribute("produit", productList);	
		
			this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}


		else
		{	
			//request.setAttribute("produit", productName);

			this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String fullName = request.getParameter("fullName");
		String address = request.getParameter("address");
		String livraison = request.getParameter("livraison");
		String code = request.getParameter("code");

	    
		//checking delivery -

	   

		
	/*	
		//checking delivery -
		switch(livraison) {
		
		case "home": livraisonSelected = "Home";
						selectedLivraisonPrice = home.getPrice();
						
						break;
		
		case "express": livraisonSelected = "Express";
		      selectedLivraisonPrice = express.getPrice();
		break;
		
		
		case "relais": livraisonSelected = "Relais";
						selectedLivraisonPrice = relais.getPrice();
						break;
						
						
		case "retire": livraisonSelected = "Retire";
						selectedLivraisonPrice = 0;
						break;
		}

		//checking products -

*/

		String prod1 = request.getParameter("prod1");
		String prod2 = request.getParameter("prod2");
		request.setAttribute("livraison", livraison);
		request.setAttribute("selectedLivraisonPrice", selectedLivraisonPrice);
		request.setAttribute("fullName", fullName);
		request.setAttribute("address", address);
		request.setAttribute("code", code);
		request.setAttribute("prod1", prod1);
		request.setAttribute("prod2", prod2);

		this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
