package co.pharma.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.pharma.produit.Produit;

public class ProduitDAO {

	static ArrayList<Produit> liste = new ArrayList<Produit>();

	private static String DBDRIVER = "com.mysql.cj.jdbc.Driver";
	private static String DBPATH = "jdbc:mysql://localhost:3306/Pharmacie?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
	private static String DBUSER = "kevin";
	private static String DBPASSWORD = "";

	public static ArrayList<Produit> getAll() throws ClassNotFoundException, SQLException {
		Class.forName(DBDRIVER);
		Connection connection = DriverManager.getConnection(DBPATH, DBUSER, DBPASSWORD);
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("SELECT * FROM Produit");

		while (rs.next()) {
			Produit produit = new Produit(rs.getString("nom"), rs.getString("description"), rs.getInt("quantite"),
					rs.getDouble("prix"));
			liste.add(produit);
		}

		connection.close();
		return liste;
	}

	
}
