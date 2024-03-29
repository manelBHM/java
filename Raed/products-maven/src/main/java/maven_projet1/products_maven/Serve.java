package maven_projet1.products_maven;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serve
 */


@WebServlet("/Serve")
public class Serve extends HttpServlet {
	private static final long serialVersionUID = 1L;
      

	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serve() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	
	private Client client;
	
	private Map<Product, Integer> products = new HashMap<Product, Integer>();
	Facture f = new Facture();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
	
		this.getServletContext().getRequestDispatcher("/WEB-INF/NewFile.jsp").forward(request, response);
	 
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	String st = request.getQueryString();
	
	String p1 = request.getParameter("nom");
	String p2 = request.getParameter("address");
	
	request.setAttribute("query", st);
	
	request.setAttribute("nom", p1);
	request.setAttribute("address", p2);
		
 
	
		

		this.getServletContext().getRequestDispatcher("/WEB-INF/output.jsp").forward(request, response);
		
	}

}
