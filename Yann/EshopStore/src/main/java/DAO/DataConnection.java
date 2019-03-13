package DAO;
import java.util.*;
import java.sql.*;
import eshop.store.*;


public class DataConnection {

	public List getAllProducts() throws SQLException, ClassNotFoundException
	{
		List<Product> productsLists = new ArrayList<Product>();

	
			String url = "jdbc:mysql://localhost:3306/Magasin", user="lucky", password="";
			
			

				//Class.forName("com.mysql.jdbc.Driver");
				
				
				
				Connection connection = DriverManager.getConnection(url, user, password);
				
				
				
				Statement statement = connection.createStatement();

				ResultSet rs = statement.executeQuery("SELECT * FROM produit");
				while(rs.next()){


					Product p = new Product(rs.getString("name"), rs.getString("description"), rs.getInt("price"));

					productsLists.add(p);

				}
				connection.close();
				
			return productsLists;	
	}
	
}


