package co.Simplon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */

    public Test() {
        // TODO Auto-generated constructor stub
    	
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/test.jsp").forward(request, response);
		
		//String nom = "Toto";
	    //response.getWriter().println("Bonjour de la part de " + nom + " !");
	    //response.getWriter().println("Bonjour de la part de " + request.getParameter("nom") + " !");
		
		/*response.setContentType("Text/html");
		ServletOutputStream out = response.getOutputStream();
		out.println("<HTML>\n");
		out.println("<HEAD>\n");
		out.println("<TITLE>Bonjour</TITLE>\n");
		out.println("</HEAD>\n");
		out.println("<BODY>\n");
		out.println("<h1>Bonjour de la part de + nom</h1>\n");
		out.println("</BODY>\n");
		out.println("</HTML>\n");*/
		
		/*response.setContentType("Text/html");
		ServletOutputStream out = response.getOutputStream();
		out.println("<HTML>\n");
		out.println("<HEAD>\n");
		out.println("<TITLE>Bonjour</TITLE>\n");
		out.println("<STYLE>h1{font-family: Arial; color:blue; font-size: 60px; text-align: center;}</STYLE>\n");
		out.println("</HEAD>\n");
		out.println("<BODY>\n");
		out.println("<h1>HELLO</h1>\n");
		out.println("</BODY>\n");
		out.println("</HTML>\n");*/
		
		//response.setContentType("Text/html");
		/*PrintWriter out = response.getWriter();
		out.println("<HTML>\n");
		out.println("<HEAD>\n");
		out.println("<meta charset=\"UTF-8\">\n");
		out.println("<TITLE>Bonjour</TITLE>\n");
		out.println("</HEAD>\n");
		out.println("<BODY>\n");
		out.println("<h1 style=color:blue;>Bonjour</h1>\n");
		out.println("</BODY>\n");
		out.println("</HTML>\n");*/
		
		//response.getWriter().println("Hello");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
