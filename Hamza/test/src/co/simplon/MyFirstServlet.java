package co.simplon;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyFirstServlet
 */
@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyFirstServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/MyFirstJsp.jsp").forward(request, response);
		
		
//		ServletOutputStream out = response.getOutputStream();
//		out.println("<html>\n");
//		out.println("<head>\n");
//		out.println("<title>Mon site</title>\n");
//		out.println("</head>\n");
//		out.println("<body>\n");
//		out.println("<H1 align = center >Wesh !</H1>\n");
//		out.println("</body>\n");
//		out.println("</html>");
		
/*		String nom = request.getParameter("nom");
		response.getWriter().println("Hey ! Je m'appelle " + nom); */
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

}
