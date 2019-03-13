package classes.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//"jdbc:mysql://localhost:3306/promo?useSSL=false&serverTimezone=UTC";
		
		String url = "jdbc:mysql://localhost:3306/promo";
		String user = "jdbctest";
		String pass = "jdbctest";
		String driver = "com.mysql.cj.jdbc.Driver";;
		Connection cn = null;
		ResultSet rs = null;
		Statement st = null;
		
try {
			
			Class.forName(driver);
			cn = DriverManager.getConnection(url,user,pass);
			
			rs =  st.executeQuery("select * from products");
			
			while(rs.next()) {
				
				System.out.println(rs.getString("name")+" - "+ rs.getString("description")+" -"+rs.getDouble("price"));
 
		 
				
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
		
		
		
		
		
		
		
		
		

	}

}
