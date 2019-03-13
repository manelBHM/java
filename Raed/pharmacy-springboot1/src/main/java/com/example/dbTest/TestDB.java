package com.example.dbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDB {

	public static void main(String[] args) {
 
		String user ="pharmacy";
		String pass = "pharmacy";
		String url = "jdbc:mysql://localhost:3306/medicine?useSSL=false&serverTimezone=UTC";
		String driver = "com.mysql.jdbc.Driver";
		
		Connection cn = null;
		
		try {
			
			System.out.println("connection to db");
			Class.forName(driver);
			cn = DriverManager.getConnection(url,user,pass);
			System.out.println("connection successful ! ");
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			
			try {
				cn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		

	}

}
