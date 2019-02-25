package com.lesson1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test3
 */
public class Test3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
 
		this.getServletContext().getRequestDispatcher("/input.jsp").forward(request, response);
 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//TODO Auto-generated method stub
		doGet(request, response);
		
		
		  String nom = request.getParameter("nom"); String prenom =
		  request.getParameter("prenom");
		  
		  String message = "Transmission de variables : OK ";
		  
		  request.setAttribute("test1", nom); request.setAttribute("test2", prenom);
		  request.setAttribute("attribut", message);
		 
		
		this.getServletContext().getRequestDispatcher("/output.jsp").forward(request, response);
	}

}
