package com.lesson1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test1
 */
public class Test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Test1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
 
		this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//PrintWriter out = response.getWriter();
		//out.println("<html>");
		//out.println("<head>");
		//out.println("<titel>this is my title</title>");
		//out.println("</head>");
		//out.println("<body>");
		//out.println("</body>");
		//out.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
