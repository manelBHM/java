package com.simplon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test2
 */
@WebServlet("/Test2")
public class Test2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ........").append(request.getContextPath());
		ServletOutputStream out = response.getOutputStream();
		//PrintWriter out=  response.getWriter();
		
	    out.print("<html>\n");  
	    out.print("<head>\n"); 
	    out.print("<h2>adding a head</h2>\n");
	    out.print("</head>\n"); 
	    out.print("<body>\n");
	    out.print("<p>i luv coding </p>\n");
	    out.print("</body>\n");
	    out.print("</html>\n");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	private String name="toto";
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		// Set response content type
	      response.setContentType("text/html");

	      PrintWriter out = response.getWriter();
	 
	  
	    
	     
	      
	}

}
