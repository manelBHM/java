package maven_projet1.maven_test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serv1
 */
@WebServlet("/Serv1")
public class Serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Cartoon c = new Cartoon("football");
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
 
 

		
		this.getServletContext().getRequestDispatcher("/WEB-INF/serv1.jsp").forward(request, response);

		
	}

	/**
	 * @see HttpServlet#doPost(HthtpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		
		String fn = request.getParameter("fname");
		String ln = request.getParameter("lname");
 
		
		String message = "Transmission de variable : Ok\n";
		
		request.setAttribute("message", message);
		request.setAttribute("firstn", fn);
		request.setAttribute("lastn", ln.toUpperCase());
		request.setAttribute("cart", c.getNom());


		
		this.getServletContext().getRequestDispatcher("/WEB-INF/serv2.jsp").forward(request, response);
		
		
		

	}

}
