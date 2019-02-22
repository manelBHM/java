package co.hamza;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MaMavenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public MaMavenServlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String message = "Transmission de variables : OK ";
		
		
		request.setAttribute("message", message);
		request.setAttribute("nom", Nom.toUpperCase());
		request.setAttribute("prenom", prenom.toUpperCase());
		
		this.getServletContext().getRequestDispatcher("/MaMavenJsp.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String message = "Transmission de variables : OK ";
		
		
		request.setAttribute("message", message);
		request.setAttribute("nom", Nom.toUpperCase());
		request.setAttribute("prenom", prenom.toUpperCase());
		
		this.getServletContext().getRequestDispatcher("/MaMavenJsp.jsp").forward(request, response);
	}

}
