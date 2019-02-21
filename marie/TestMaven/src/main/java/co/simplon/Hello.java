package co.simplon;

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
/**
 * Servlet implementation class Hello
 */
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public static final String VUE = "/WEB-INF/test.jsp";

	    public static final String CHAMP_NOM = "nom";
	    public static final String CHAMP_PRENOM = "prenom";
	    public static final String CHAMP_age = "age";
	    public static final String CHAMP_date = "date";
	    public static final String CHAMP_metier = "metier";
	    public static final String CHAMP_startup = "startup";
	
    /**
     * Default constructor. 
     */
    public Hello() {
        // TODO Auto-generated constructor stub
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		/*String paramAuteur = request.getParameter("auteur");
		String message = "transmission de variables: OK ! " + paramAuteur;
		request.setAttribute("test", message);*/
		
		
		/*String nom = "Marie";
		String message = "je m'appelle " + nom;
		request.setAttribute("test", message);
		
		String paramNom = request.getParameter("nom");
		String messages = "JE M'APPELLE ";
		request.setAttribute("test", messages);
		request.setAttribute("nom", paramNom);*/
		
		/*String paramNom = request.getParameter("nom");
		
		String nom = "MARIE";
		String message = "JE M'APPELLE " + nom;
		request.setAttribute("test", message);*/
		
		/*String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		
		request.setAttribute("nom", nom.toUpperCase());
		request.setAttribute("prenom", prenom.toUpperCase());*/
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/test.jsp").forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		request.setCharacterEncoding("UTF-8");
		/*
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		
		request.setAttribute("nom", nom.toUpperCase());
		request.setAttribute("prenom", prenom.toUpperCase());*/
		
		String nom = request.getParameter( CHAMP_NOM);
		String prenom = request.getParameter( CHAMP_PRENOM );
		String age = request.getParameter( CHAMP_age );
		String date = request.getParameter( CHAMP_date );
		String metier = request.getParameter( CHAMP_metier );
		String startup = request.getParameter( CHAMP_startup );
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/test.jsp").forward(request, response);
	}

}


















