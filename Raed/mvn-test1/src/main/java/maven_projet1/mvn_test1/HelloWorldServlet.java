package maven_projet1.mvn_test1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */

@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	Bills bill;
	Customer customer;
	Product products;
	Television tel;
	Fridge frigo;
	
	
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorldServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
	 
		
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
     

		
		
		request.getRequestDispatcher("input.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
    	Television tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
    	Fridge fridge = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);
		Customer client1 = new Customer("Raed","108 Rue De Montigny");
		
		

		Bills bills = new Bills(client1);
		bills.addProducts(cafe, 3);
		bills.addProducts(tv, 5);
		bills.addProducts(fridge, 2);
		
		
		
		Map<Product,Integer> get = bills.getProducts();
		
		List<Product> list = new ArrayList<Product>();
		for(Product ls : list ) {
			//Product pro = ls.getKey();
			//Integer quantity = ls.getValue();
			String name = ls.getName();
			String desc = ls.getDescription();
			double pri = ls.getPrice();
			
			

			
			request.setAttribute("name", name);
			request.setAttribute("description", desc);

			request.setAttribute("price", pri);
			//request.setAttribute("quantity", quantity);

		}
		
		
		//bills.showAddedProducts(get);
		
		Product pro = new Product();
		
		request.setAttribute("map", get);
		
		
		//getting name and address 
		String name = request.getParameter("fname");
		String address = request.getParameter("faddress");
		request.setAttribute("name", name);
		request.setAttribute("address", address);

		
		
		request.getRequestDispatcher("output.jsp").forward(request, response);
	}


}
