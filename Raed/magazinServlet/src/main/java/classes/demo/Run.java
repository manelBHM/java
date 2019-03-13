package classes.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;

public class Run {

	public static void main( String[] args ) throws SQLException
    {
    	    String url = "jdbc:mysql://localhost:3306/promo";
    		String login ="root";
    		String pwd="";
    		Connection connexion = null;
    		java.sql.Statement st = null ;
    	
    	     
    	        List<Product> list = new ArrayList<Product>();
    	        try {
    	            connexion = DriverManager.getConnection(url);
    	            st= connexion.createStatement();
    	            String select="select * from products";
    	            
    	            ResultSet rs = st.executeQuery(select);
    	            while (rs.next()) {
    	                Product p = new Product();
    	                 
    	                p.setDescription(rs.getString("description"));
    	                p.setName(rs.getString("name"));
    	                p.setPrice(rs.getDouble("price"));
    	                list.add(p);
    	            }
    	            rs.close();
    	        } catch (SQLException e) {
    	            e.printStackTrace();
    	        
    	        }
    	         

}}
