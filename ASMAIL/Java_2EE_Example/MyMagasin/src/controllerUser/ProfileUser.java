package controllerUser;

import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection.MyConnection;

public class ProfileUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProfileUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		// PrintWriter out = response.getWriter();

		String email = request.getParameter("email");

		Connection con;
		try {
			con = MyConnection.getMyConnection();
			String sql = "SELECT `name`, `email` FROM `users` WHERE email=?";

			PreparedStatement preparedStatement = con.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

				email = resultSet.getString("email");
				String name = resultSet.getString("name");
				request.setAttribute("email", email);
				request.setAttribute("email", name);
				RequestDispatcher rs = request.getRequestDispatcher("profile.jsp");
				rs.forward(request, response);

			}

			con.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
