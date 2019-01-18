package com.apps;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myServlet
 */
public class myServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public myServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String auteur = request.getParameter("auteur");
		String textNom = "Transmission de variables : OK ! " + auteur;
		request.setAttribute("textNom", textNom);

		String _nom = request.getParameter("nom");
		String _prenom = request.getParameter("prenom");

		request.setAttribute("lName", _nom.toUpperCase());
		request.setAttribute("fName", _prenom.toUpperCase());
		request.getRequestDispatcher("index.jsp").forward(request, response);

		// ServletOutputStream out = response.getOutputStream();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName =  request.getParameter("lastName");
		
		request.setAttribute("firstName", firstName);
		request.setAttribute("lastName", lastName);
		request.getRequestDispatcher("index2.jsp").forward(request, response);

		
	}

}
