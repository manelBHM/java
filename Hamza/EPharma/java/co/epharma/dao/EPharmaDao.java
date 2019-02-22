package co.epharma.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;

import co.epharma.client.Client;
import co.epharma.client.Historique;
import co.epharma.produit.Produit;

public class EPharmaDao {

	ArrayList<Produit> liste = new ArrayList<Produit>();
//	ArrayList<String> listeHistorique = new ArrayList<String>();
	ArrayList<Historique> listeHistorique = new ArrayList<Historique>();
	ArrayList<Client> listeClient = new ArrayList<Client>();
	int id;

	private String DBDRIVER = "com.mysql.jdbc.Driver";
	private String DBPATH = "jdbc:mysql://localhost:3306/EPharma";
	private String DBUSER = "student";
	private String DBPASSWORD = "";

	public EPharmaDao() {
	}

	public ArrayList<Produit> getProduit() throws ClassNotFoundException, SQLException {

		Class.forName(DBDRIVER);

		Connection connection = DriverManager.getConnection(DBPATH, DBUSER, DBPASSWORD);

		Statement statement = connection.createStatement();

		ResultSet rs = statement.executeQuery("SELECT * FROM produit");

		while (rs.next()) {

			Produit produit = new Produit(rs.getString("nom"), rs.getString("description"), rs.getInt("prix"));

			liste.add(produit);

		}

		connection.close();
		return liste;

	}

	public ArrayList<Client> getClient() throws ClassNotFoundException, SQLException {

		Class.forName(DBDRIVER);

		Connection connection = DriverManager.getConnection(DBPATH, DBUSER, DBPASSWORD);

		Statement statement = connection.createStatement();

		ResultSet rs = statement.executeQuery("SELECT * FROM Client");

		while (rs.next()) {

			Client client = new Client(rs.getInt("idClient"), rs.getNString("nomClient"),
					rs.getString("adresseClient"));

			listeClient.add(client);

		}

		connection.close();
		return listeClient;

	}

	public ArrayList<Historique> getHistorique(Client client) throws ClassNotFoundException, SQLException {

		Class.forName(DBDRIVER);

		Connection connection = DriverManager.getConnection(DBPATH, DBUSER, DBPASSWORD);

		Statement statement = connection.createStatement();


		ResultSet rs = statement.executeQuery("SELECT * FROM Client WHERE nomClient = '" + client.getNom() + "'");
		
		if (rs.next()) {
			id = rs.getInt("idClient");
		}
		
		System.out.println(rs.getInt("idClient"));
		
		ResultSet rsa = statement.executeQuery("SELECT * FROM historique_client WHERE Client_id = " + id);
		
//		while (rsa.next()) {
//			System.out.println(rsa.getString("date") + " " + rsa.getString("historique") + "\n");
//			listeHistorique.add(rsa.getString("date") + " " + rsa.getString("historique") );
//		}
		
		
		while (rsa.next()) {

			Historique historique = new Historique(rsa.getString("historique"), rsa.getString("date"));
				

			listeHistorique.add(historique);
			

		}
		
		


		connection.close();
		
		return listeHistorique;

	}

	public ArrayList<Historique> setHistorique(Client client, StringBuilder str)
			throws ClassNotFoundException, SQLException {

		Class.forName(DBDRIVER);

		Connection connection = DriverManager.getConnection(DBPATH, DBUSER, DBPASSWORD);

		Statement statement = connection.createStatement();

		ResultSet rs = statement.executeQuery("SELECT * FROM Client WHERE nomClient = '" + client.getNom() + "'");

		if (rs.next()) {
			id = rs.getInt("idClient");
		}

		

		String requete = "INSERT INTO historique_client (historique, Client_id) VALUES ('" + str + "'," + id + ")";

		statement.execute(requete);

		connection.close();
		return listeHistorique ;
		

	}

}
