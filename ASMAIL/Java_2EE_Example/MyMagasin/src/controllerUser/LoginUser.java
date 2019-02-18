package controllerUser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import validation.Validate;

public class LoginUser extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public LoginUser() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		try {

			String email = request.getParameter("email");
			String pass = request.getParameter("pass");

			if (Validate.checkUser(email, pass)) {

				// creating a session
				// HttpSession session = request.getSession();

				Cookie ck = new Cookie("email", email);
				response.addCookie(ck);

				request.setAttribute("email", email);
				request.setAttribute("pass", pass);

				RequestDispatcher rs = request.getRequestDispatcher("profile.jsp");
				rs.forward(request, response);

			} else {
				out.println("Username or Password incorrect");
				RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
				rs.include(request, response);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
