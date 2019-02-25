package com.simplon;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NomCartoon
 */
public class NomCartoon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor. 
	 */
	public NomCartoon() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());


		//doGet pour afficher sur une page

		String nomCartoon = request.getParameter("nom");



		Cartoon perso2 = new Cartoon("Coyote");//on instansi Cartoon avec un parametre nom

		String nomPerso2 = perso2.getNom();//on met le nom de perso2 grace a getNom

		request.setAttribute("nom2", nomPerso2.toUpperCase());//on le met dans un attribut pour l'envoyer sur la jsp

		//-------test constructeur sans parametre---------

		Cartoon adjectif = new Cartoon();

		adjectif.setAdj("Filoux");

		String adj1 = adjectif.getAdj();
		
		request.setAttribute("adjectif1", adj1);
		
		//--------------------------------------------------
		
		
		
		this.getServletContext().getRequestDispatcher("/cartoon1.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		//doPost si je modifie le doGet

		doGet(request, response);
	}

}
