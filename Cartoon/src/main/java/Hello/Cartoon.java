package Hello;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class Cartoon
 */
public class Cartoon extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	

	Cartoone1 car = new Cartoone1("wille E.","coyote");
	
	

    /**
     * Default constructor. 
     */
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String name = request.getParameter("nom");
		String message = "parametre trasmis  : ok ! ";
		
		String message1 = "parametre trasmis  : ok ! ";
		request.setAttribute("nom", message);
		
		request.setAttribute("attribute",car.toString());
	
		
		
		this.getServletContext().getRequestDispatcher("/index1.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
