package co.hamza.darty.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import co.hamza.darty.produit.Produit;

public class ProduitsDAO {

	ArrayList<Produit> liste = new ArrayList<Produit>();

	private String DBDRIVER = "com.mysql.jdbc.Driver";
	private String DBPATH = "jdbc:mysql://localhost:3306/Darty";
	private String DBUSER = "student";
	private String DBPASSWORD = "";

	public ProduitsDAO() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Produit> getAll() throws ClassNotFoundException, SQLException {

		Class.forName(DBDRIVER);

		Connection connection = DriverManager.getConnection(DBPATH, DBUSER, DBPASSWORD);

		Statement statement = connection.createStatement();

		ResultSet rs = statement.executeQuery("SELECT * FROM produits");

		while (rs.next()) {

			Produit produit = new Produit(rs.getString("nom"), rs.getString("description"), rs.getDouble("prix"));

			liste.add(produit);

		}

		connection.close();

		return liste;

	}

}
