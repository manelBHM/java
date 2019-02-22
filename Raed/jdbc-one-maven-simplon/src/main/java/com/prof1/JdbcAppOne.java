package com.prof1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcAppOne {

	
	
	
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String url = "jdbc:mysql://localhost:3306/promo";
		String user = "jdbctest";
		String pass = "jdbctest";

		Connection cn =null;
		ResultSet rs = null;
		PreparedStatement ps = null;
 
 
		
		
		
		
		
		  try {
		  
		  System.out.println("connection successd !!!!");
			 
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(url,user,pass);
			
			System.out.println("accept cookies to continue  Y/N");
			String input = "";
			while(!input.equals("N")) {
				System.out.println("choose your option...\n");
				System.out.println("- D to display the table ...");
				System.out.println("- A to insert into the table ...");
				input = scan.nextLine();
				
				switch(input) {
				case "A":
					String nom = "";
					String prenom = "";
					String date = "";
					String actif = "";
					while(nom.isEmpty() || prenom.isEmpty() || date.isEmpty() || actif.isEmpty()) {
						System.out.println("name must be inserted..");
						nom = scan.nextLine();
						System.out.println("prenom must be inserted..");
						prenom = scan.nextLine();
						System.out.println("date must be inserted..");
						date = scan.nextLine();
						System.out.println("actif must be inserted..");
						actif = scan.nextLine();
						
					}
					insertingData(nom,prenom,date,actif);
					break;
				case "D":
					displayData();
					break;
				default:
					System.out.println("you have made none of these options ");
					break;
				
				}
				
			
				
				
			}
		  
			 cn.close();
		  
		  
		  
		  }catch(SQLException e) { e.printStackTrace();
		  
		  }catch(ClassNotFoundException cfd) { cfd.printStackTrace(); }finally {
		  
		  }
		  
		 
		
		
		
		
		
	}

	private static void displayData() {
		 
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			rs = ps.executeQuery("select * from apprenant");
			
			while(rs.next()) {
				System.out.println(rs.getString("id_apprenant")+" - "+ rs.getString("nom")+" -"+rs.getString("prenom")
				+" -"+rs.getString("data_naissance")+" -"+rs.getString("actif"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	

	//insert data into  a  table 
	private static void insertingData(String nom, String prenom, String date, String actif) {
		
		Statement st  = null;
		ResultSet rs = null;
		Connection cn = null;
		String query = "INSERT INTO apprenant " + "VALUES ('"+nom+"', '"+prenom+"', '"+date+"', '"+actif+"')";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
