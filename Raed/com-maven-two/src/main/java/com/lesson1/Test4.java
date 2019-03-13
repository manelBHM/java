package com.lesson1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test4
 */
public class Test4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
 
		
		this.getServletContext().getRequestDispatcher("/test42.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String Nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String message = "Transmission de variables : OK ";
		
		
		request.setAttribute("request", message);
		request.setAttribute("nom", Nom.toUpperCase());
		request.setAttribute("prenom", prenom.toUpperCase());
		
		this.getServletContext().getRequestDispatcher("/test41.jsp").forward(request, response);
	}

}
