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
 * Servlet implementation class Test3
 */
@WebServlet("/Test3")
public class Test3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: we are in Test3!").append(request.getContextPath());
		ServletOutputStream out = response.getOutputStream();
		//PrintWriter out = response.getWriter();
		out.print("<html>\n");
		out.print("<head>\n");
		out.print("<title>Servlet projet</title>\n");
		out.print("</head>\n");
		out.print("<body>\n");
		out.print("<p style='font-size: 20px; color:gray; font margin-top:60px; text-align:center'>Bienvenue </p>\n");
		out.print("<h1 style='color:blue; margin:auto; text-align:center'>premier projet</h1>\n");
		out.print("<p style='font-size: 20px; color:red; margin-top:50px; text-align:center'>j'aim coder</p>\n");
		out.print("</body>\n");
		out.print("</html>\n");




	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		
		
	}

}
