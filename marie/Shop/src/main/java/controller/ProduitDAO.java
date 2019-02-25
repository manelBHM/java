package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import simplon.Produit;

public class ProduitDAO {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
		String BDPATH = "jdbc:mysql://localhost:3306/myMagasin";
		String DBUSER = "root";
		String DBPASSWORD = "simplon";
		
		try {
       	
       	 Class.forName(DATABASE_DRIVER);
       	 
       	 
       	 Connection connection = DriverManager.getConnection(BDPATH, DBUSER, DBPASSWORD);
       	 Statement statement = connection.createStatement();
       	 ResultSet rs = statement.executeQuery("SELECT * FROM produits");
       	 while (rs.next()) {
         System.out.println(" - " + rs.getString("nom") + " : " + rs.getString("description") + " " + rs.getString("prix"));
         } connection.close();
		 } catch (Exception e) {e.printStackTrace();
	     }
	}
	
	

	public ArrayList<Produit> getAll() {
		ArrayList<Produit> listeP = new ArrayList<Produit>();
		String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
		String BDPATH = "jdbc:mysql://localhost:3306/myMagasin";
		String DBUSER = "root";
		String DBPASSWORD = "simplon";
		
		try {
       	
       	 Class.forName(DATABASE_DRIVER);
       	 
       	 
       	 Connection connection = DriverManager.getConnection(BDPATH, DBUSER, DBPASSWORD);
       	 Statement statement = connection.createStatement();
       	 ResultSet rs = statement.executeQuery("SELECT * FROM produit");
       	 while (rs.next()) {
         System.out.println(" - " + rs.getString("nom") + " : " + rs.getString("description") + " " + rs.getString("prix"));
         Produit p = new Produit(rs.getString("nom"), rs.getString("description"), rs.getDouble("prix"));
         listeP.add(p);
         } connection.close();
		 } catch (Exception e) {e.printStackTrace();
	     }
		return listeP;
	}
}
