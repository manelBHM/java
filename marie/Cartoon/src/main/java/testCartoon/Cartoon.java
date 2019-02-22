package testCartoon;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cartoon extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public static final String VUE = "/WEB-INF/test.jsp";

	 Cartoon1 car = new Cartoon1("wille E.","coyote");
	
    public Cartoon() {
		// TODO Auto-generated constructor stub
	}
	/**
     * Default constructor. 
     */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		String nom=request.getParameter("nom");
		String message="Parametre transmis: OK";
		
		String message1="Parametre transmis: OK";
		request.setAttribute("nom", message);
		
		request.setAttribute("attribute", car.toString());
			
		this.getServletContext().getRequestDispatcher("/WEB-INF/test.jsp").forward(request, response);
	}
	


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		request.setCharacterEncoding("UTF-8");
	
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/test.jsp").forward(request, response);
	}

}


















