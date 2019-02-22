package co.epharma.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.epharma.produit.Produit;

public class EPharmaDao {

	ArrayList<Produit> liste = new ArrayList<Produit>();

	private String DBDRIVER = "com.mysql.jdbc.Driver";
	private String DBPATH = "jdbc:mysql://localhost:3306/EPharma";
	private String DBUSER = "student";
	private String DBPASSWORD = "";

	public EPharmaDao() {
	}

	public ArrayList<Produit> getAll() throws ClassNotFoundException, SQLException {

		liste.removeAll(liste);
		System.out.println(liste);
		Class.forName(DBDRIVER);

		Connection connection = DriverManager.getConnection(DBPATH, DBUSER, DBPASSWORD);

		Statement statement = connection.createStatement();

		ResultSet rs = statement.executeQuery("SELECT * FROM produit");

		while (rs.next()) {

			Produit produit = new Produit(rs.getString("nom"), rs.getString("description"), rs.getInt("prix"));

			liste.add(produit);

		}

		connection.close();
		System.out.println(liste);
		return liste;
		

	}

}
