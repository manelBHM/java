package test.maven;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Testmaven
 */
public class Testmaven extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Testmaven() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	//	request.getRequestDispatcher("index.jsp").forward(request, response);

		/*
		String param = request.getParameter(nom);
		String n = "Mon nom est " + param;
		request.setAttribute("nom", n);
		
		
		String param1 = request.getParameter(prenom);
		String p = "Mon prenom est " + param1;
		request.setAttribute("prenom", p);
		*/
		
		this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
		
		request.setCharacterEncoding("UTF-8");
		
		String param = request.getParameter("nom");
		String n = "Mon nom est " + param;
		request.setAttribute("nom", n);
		
		String param1 = request.getParameter("prenom");
		String p = "Mon prenom est " + param1;
		request.setAttribute("prenom", p);
        
		
		String param2 = request.getParameter("age");
		String a = "Mon age est " + param2 + " ans ";
		request.setAttribute("age", a);
        this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);

	}

}
