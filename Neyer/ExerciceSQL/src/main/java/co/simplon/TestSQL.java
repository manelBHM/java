package co.simplon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
		String BDPATH =  "jdbc:mysql://localhost::3306/promo";
		String DBUSER = "root";
		String DBPASSWORD = "simplonco";

		try {
			
			Connection connection = DriverManager.getConnection(BDPATH, DBUSER, DBPASSWORD);
			
			Statement statement = connection.createStatement();
			
			ResultSet rs = statement.executeQuery("select * from apprenant");
			
			while(rs.next()) {
				System.out.println(" - "+ rs.getString("nom"));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
