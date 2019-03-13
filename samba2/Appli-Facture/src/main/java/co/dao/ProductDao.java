package co.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.project.shiop.Product;

public class ProductDao {

	public List<Product> retrieveDataBase() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/Product";
		String user = "student";
		String pass = "";
		String driver = "com.mysql.cj.jdbc.Driver";

		List<Product> produits = new ArrayList<>();

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Connection connection = DriverManager.getConnection(url, user, pass);
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("SELECT * FROM Product.produit");

		while (rs.next()) {
			String nom = rs.getString("nom");
			String marque = rs.getString("marque");
			String descriptions = rs.getString("descriptions");
			double prix = rs.getDouble("prix");
			produits.add(new Product(nom, marque, descriptions, prix));
		}

		connection.close();
		return produits;
	}
}
