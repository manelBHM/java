package co.maven1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Naming extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Naming() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/WEB-INF/test.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");

		request.setAttribute("nom", nom);
		request.setAttribute("prenom", prenom);

		this.getServletContext().getRequestDispatcher("/WEB-INF/show.jsp").forward(request, response);
	}

}
