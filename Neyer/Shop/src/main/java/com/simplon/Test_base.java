package com.simplon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.simplon.*;

public class Test_base {

	
	public List<Produit> getAllProduit()
	{
		List<Produit> listProduit = new ArrayList<Produit>();
		
		
		String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
		String BDPATH = "jdbc:mysql://localhost:3306/Shop_base";
		String DBUSER = "root";
		String DBPASSWORD = "simplonco";

		try {	

			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection(BDPATH, DBUSER, DBPASSWORD);

			Statement statement = connection.createStatement();

			ResultSet rs = statement.executeQuery("select * from Produits");//ou statement.update si c pour autre chose
			
			while(rs.next()) {

				String nom = rs.getString("nom");
				double prix = rs.getDouble("prix");
				String description = rs.getString("description");
				String marque = rs.getString("marque");
				
				listProduit.add(new Produit(nom,prix,description,marque));
				
				//System.out.println(rs.getInt("id")+" - "+rs.getString("nom")+" "+rs.getDouble("prix")+" "+rs.getString("description")+" "+rs.getString("marque"));

			}connection.close();}catch (Exception e) {e.printStackTrace();}
		return listProduit;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("");
			
			
			
		
		
		/*List<Produit> listProduct = new ArrayList<Produit>();

		String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
		String BDPATH = "jdbc:mysql://localhost:3306/Shop_base";
		String DBUSER = "root";
		String DBPASSWORD = "simplonco";

		try {	

			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection(BDPATH, DBUSER, DBPASSWORD);

			Statement statement = connection.createStatement();

			ResultSet rs = statement.executeQuery("select * from Produits");
			while(rs.next()) {

				Produit p = new Produit(rs.getString("nom"), rs.getDouble("prix"), rs.getString("description"), rs.getString("marque"));

				System.out.println(rs.getInt("id")+" - "+rs.getString("nom")+" "+rs.getDouble("prix")+" "+rs.getString("description")+" "+rs.getString("marque"));

				listProduct.add(p);

			}connection.close();}catch (Exception e) {e.printStackTrace();}

		return listProduct;*/

	}
}
