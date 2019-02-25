package co.hamza;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CartoonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CartoonServlet() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nomP = request.getParameter("nom");

		CartoonClass cartoon = new CartoonClass("Nicky Larson");

		String nomA = cartoon.getNom();

		request.setAttribute("nom", nomA);

		this.getServletContext().getRequestDispatcher("/CartoonJsp.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

		this.getServletContext().getRequestDispatcher("/CartoonJsp.jsp").forward(request, response);

	}

}
