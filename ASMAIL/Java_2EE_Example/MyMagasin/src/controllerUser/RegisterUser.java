package controllerUser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection.MyConnection;

public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String avatar = request.getParameter("avatar");

		Connection con = null;
		FileInputStream fis = null;
		PreparedStatement statement = null;
		try {
			con = MyConnection.getMyConnection();
			File img = new File(avatar);
			String sql = "INSERT INTO users (`name`, `email`, `pass`, `avatar` ) VALUES(?,?,?,?";
			statement = con.prepareStatement(sql);
			statement.setString(1, name);
			statement.setString(2, email);
			statement.setString(4, pass);
			fis = new FileInputStream(avatar);
			statement.setBinaryStream(3, (InputStream) fis, (int) (img.length()));

			int row = statement.executeUpdate();
			if (row > 0) {
				out.print("Upload succefully");
				MyConnection.closeDb();
				getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
			} else {
				out.print("Not succefully");
				MyConnection.closeDb();
				getServletContext().getRequestDispatcher("/register.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.getMessage();
		}
	
	}

}
