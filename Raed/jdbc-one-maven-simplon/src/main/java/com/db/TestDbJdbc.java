package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestDbJdbc {

	
	
	public static void saveDB() {
		Scanner sc = new Scanner(System.in);
		System.out.println("What would you do ?- D= display all DB/ A - Add recod ");
		String db = sc.nextLine();
		switch(db){
		case "A":
			System.out.println("you are inserting data inoto database");
			
			
			
			
		}
		
	}

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/promo?useSSL=false&serverTimezone=UTC";
		
		
		//String url = "jdbc:mysql://localhost:3306/promo";
		
		String user = "jdbctest";
		String pass ="jdbctest"	;
		String driver = "com.mysql.cj.jdbc.Driver";
	 
		Connection cn = null;
		Statement st = null;
		
		try {
			
			Class.forName(driver);
			System.out.println("connection to DB........");
			cn = DriverManager.getConnection(url, user, pass);
			System.out.println("connection successful !!......");
			
			//inserting db
			st = cn.createStatement();
			//String sql = "INSERT INTO `apprenant`(`nom`,`prenom`,`data_naissance`,`actif`)"
			
			//st.executeUpdate("INSERT INTO apprenant " + "VALUES (7, 'Bukhary', 'Sahar', '1990-10-10', 1)");
			//System.out.println("insert successful..");
			System.out.println("\n\n");
			
			
			//print out table
			ResultSet  rs = st.executeQuery("select * from apprenant");
			while(rs.next()) {
				System.out.println(rs.getString("id_apprenant")+" - "+ rs.getString("nom")+" -"+rs.getString("prenom")
				+" -"+rs.getString("data_naissance")+" -"+rs.getString("actif"));
			}
			
			//
			System.out.println("\n");
			//ResultSet delete = st.executeQuery("select id_apprenant from apprenant where id_apprenant=6");
			//String dele = delete.getString("delete");
			//System.out.println("dele");
			
			
		 
				System.out.println("deleting db.......");

		        PreparedStatement s = cn.prepareStatement("delete from apprenant where id_apprenant=6"); 
		        s.executeUpdate();
				System.out.println("data has been deleted successfully.......");
	
			
			
		}catch(SQLException e ) {
			e.printStackTrace();
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
			
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
