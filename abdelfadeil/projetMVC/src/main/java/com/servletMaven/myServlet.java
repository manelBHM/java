package com.servletMaven;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Carton;

/**
 * Servlet implementation class myServlet
 */
public class myServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Carton model;
		
		if(request.getAttribute("model") == null) {
		model = new Carton();
		request.setAttribute("model", model);
		}else {
			model = (Carton) request.getAttribute("model");
			model.setNom(request.getParameter("lName"));
			model.setPrenom(request.getParameter("fName"));
			model.setEmail(request.getParameter("email"));
			model.setPassword(Integer.parseInt(request.getParameter("password")));
			
		}
		
		
		request.getRequestDispatcher("index2.jsp").forward(request, response);
	}

}
