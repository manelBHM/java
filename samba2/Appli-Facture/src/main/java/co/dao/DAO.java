package co.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mysql://localhost:3306/Product";
		String user = "student";
		String pass = "";
		String driver = "com.mysql.cj.jdbc.Driver";

		try {
			Class.forName(driver);

			Connection connection = DriverManager.getConnection(url, user, pass);
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM Product.produit");

			while (rs.next()) {
				System.out.println(rs.getString("id") + " - " + rs.getString("nom") + " - " + rs.getString("marque")
						+ " - " + rs.getString("descriptions") + " - " + rs.getString("prix"));
			}

			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
