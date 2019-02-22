package classes.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.mysql.cj.xdevapi.Statement;

import comdao.JdbcDAOImp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	    String url = "jdbc:mysql://localhost:3306/promo";
    		String login ="jdbctest";
    		String pwd="jdbctest";
    		Connection connexion = null;
    		Statement st = null ;
    	
    	     
    	        List<Product> list = new ArrayList<Product>();
    	        try {
    	            connexion = DriverManager.getConnection(url);
    	            st = (Statement) connexion.prepareStatement("select * from products");
    	            ResultSet rs = ((PreparedStatement) st).executeQuery();
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
    	
    	
    	
    	
    	
    	
    	