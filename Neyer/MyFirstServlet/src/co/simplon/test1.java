package co.simplon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test1
 */
@WebServlet("/test1")
public class test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public test1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.setContentType("Text/hml");
		
		//response.getWriter().println("Neyer");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//ServletOutputStream out = response.getOutputStream();
		
		out.println("<HTML>\n");
		out.println("<HEAD>\n");
		out.println("<TITLE> NEYER </TITLE>\n");
		
		out.println("<STYLE> H1 { color:white; font-size:90px; text-align:center;} </STYLE>");
		out.println("</HEAD>\n");
		out.println("<BODY style=background-image:url(http://a54.idata.over-blog.com/2/25/98/74/01-janvier/fond-ecran-espace-copie-1.jpg)>\n");
		out.println("<H1>HOT!!!</H1>\n");
		out.println("</BODY>\n");
		out.println("</HTML>\n");
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
