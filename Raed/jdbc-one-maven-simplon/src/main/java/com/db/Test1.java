package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test1 {
	
	private static void printUserData(String id, String nom,String prenom,String date,int actif) {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "INSERT INTO apprenant " + "VALUES ('"+id+"', '"+nom+"', '"+prenom+"', '"+date+"', '"+actif+"')";
		
		 
		try {
			
			rs = ps.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getString("id_apprenant")+" - "+ rs.getString("nom")+" -"+rs.getString("prenom")
				+" -"+rs.getString("data_naissance")+" -"+rs.getString("actif"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

	public static void main(String[] args) {
 
		
	String url = "jdbc:mysql://localhost:3306/promo?useSSL=false&serverTimezone=UTC";
		
		
		//String url = "jdbc:mysql://localhost:3306/promo";
		
		String user = "jdbctest";
		String pass ="jdbctest"	;
		String driver = "com.mysql.cj.jdbc.Driver";
	 
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		// 0. read user input from command line: last name, first name and email
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your last name: ");
		String idapprenant = scanner.nextLine();

		System.out.print("Enter your last name: ");
		String lastName = scanner.nextLine();

		System.out.print("Enter your first name: ");
		String firstName = scanner.nextLine();

		System.out.print("Enter your date: ");
		String date = scanner.nextLine();
		
		System.out.print("Enter your date: ");
		int actif = scanner.nextInt();
		
		
	 

		 
		
	}

}
