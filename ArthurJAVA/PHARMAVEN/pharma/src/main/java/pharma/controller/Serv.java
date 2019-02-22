package pharma.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pharma.DAO.medicDAO;
import pharma.model.Medic;

/**
 * Servlet implementation class Serv
 */
public class Serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<Medic> listeProd = new ArrayList();


	/**
	 * Default constructor.
	 */
	public Serv() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		if (request.getQueryString() == null) {

	

			this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void init() {
		
		medicDAO dao = new medicDAO();
		listeProd = dao.getProduit();
		
		
	}

}
