package com.lesson1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test2
 */
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
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String p1 = request.getParameter("first_name");
		String p2 = request.getParameter("last_name");
		
		String pp2 = p2.toLowerCase();
		
		//String message = "First name is : "+"\n"+ pramAuteur1 +"the last name is :"+"\n"+ pramAuteur2;
		//request.setAttribute("test", message);
		request.setAttribute("test1", p1);
		request.setAttribute("test2", p2);

		
		this.getServletContext().getRequestDispatcher("/index2.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String p1 = request.getParameter("first_name");
		String p2 = request.getParameter("last_name");
		
		String pp2 = p2.toLowerCase();
		
 
		//request.setAttribute("test", message);
		request.setAttribute("test1", p1);
		request.setAttribute("test2", p2);
	}

}
