package simplon.co;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServ
 */
public class MyServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServ() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		String paramPrenom = request.getParameter("prenom");
		String paramNom = request.getParameter("nom");
	    
		request.setAttribute("nom", paramNom.toUpperCase());
		request.setAttribute("prenom", paramPrenom.toUpperCase());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/value.jsp").forward(request, response);

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		//this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

	}

}
