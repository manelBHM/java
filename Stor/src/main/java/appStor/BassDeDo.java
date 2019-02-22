package appStor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BassDeDo {
static	String url = ("jdbc:mysql://localhost:3306/product");
static	String login = "root";
static	String passwd ="simplonco";
	static Connection cn = null;
	static Statement st = null;
		
	public static List<Product> getAll()  {
		List<Product> brd =new ArrayList<Product>();
		
		try {
			
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
			cn = DriverManager.getConnection(url,login,passwd);
			st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from products");
			 while(rs.next()) {
				 int id =rs.getInt("id");
				 String name = rs.getString("nameProducts");
				 String dec = rs.getString("descripition");
				 double price= rs.getInt("prix");
				 
				 brd.add(new Product(id,name,dec,price));
				// System.out.println(rs.getString("id")+" "+rs.getString("nameProducts")+" "+rs.getString("descripition")+" "+rs.getString("prix"));
	               }
		
		}
		catch
		(Exception e ){
			e.printStackTrace();

		}
		return brd;
		
		
		
	}
	
	
	public static void main(String[] args) {
	
		System.out.println(getAll());
		
	
		
		
		
		

	}

}
