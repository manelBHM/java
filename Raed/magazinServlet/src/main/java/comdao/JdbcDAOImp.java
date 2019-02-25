package comdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import classes.demo.Product;

public class JdbcDAOImp implements Jdbc{
	//Product product;
	
	
	
 
 

	@Override
	public List<Product> getAll() {
	List<Product> products = new ArrayList<Product>();
		
		String url = "jdbc:mysql://localhost:3306/promo?useSSL=false&serverTimezone=UTC";
		String user = "jdbctest";
		String pass = "jdbctest";
		String driver = "com.mysql.cj.jdbc.Driver";;
		Connection cn = null;
		ResultSet rs = null;
		Statement st = null;
		 
		try {
			
			Class.forName(driver);
			cn = DriverManager.getConnection(url, user, pass);
			st = cn.createStatement();
			rs = st.executeQuery("select * from products");
		 
			
			while(rs.next()) {
				
			
				
				  String name = rs.getString("name");  
				  String description = rs.getString("description"); 
				  double price = rs.getDouble("price");
				  //System.out.println("\t  "+rs.getString("name")+"\t"+ rs.getString("description")+"\t"+rs.getDouble("price"));
				
				products.add( new Product(name,description,price));
				

				
				
				
				//Product p = new Product();
				//p.setName(rs.getString("name"));
				//p.setDescription(rs.getString("description"));
				//p.Double.parseDouble(rs.getDouble("price"));
				
				//another method to do it 
				//Product pr = new Product();
				//pr.setName(rs.getString("name"));
				//pr.setDescription(rs.getString("description"));
				//pr.setPrice(rs.getDouble("price"));
				
				
			}
			
			
		}catch(SQLException ec) {
			
			ec.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				cn.close();
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return products;
		
		}
	}
	

			
			
			
	 
		
		
 
 
	

