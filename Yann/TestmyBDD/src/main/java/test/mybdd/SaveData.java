package test.mybdd;

import java.sql.*;


public class SaveData {

public static void saveInBDD(String nom, String prenom, String date_de_naissance, Integer actif)
	{
	String url = "jdbc:mysql://localhost:3306/PROMO";;
	String login = "root";
	String psswd = "root";
	Connection cn = null;
	Statement st = null;
	
	try {
		// etape 1 chargement du DRIVER
		Class.forName("com.mysql.jdbc.Driver");
		
		// etape 2 recuperation de la connexion
		cn = DriverManager.getConnection(url, login, psswd);
		
		// etape 3 Creation d'un statement
		st = cn.createStatement();
		String sql = "INSERT INTO `apprenant` (`nom`, `prenom`, `date_de_naissance`, `actif`) VALUES ('"+nom+"','"+prenom+"', '"+date_de_naissance+"', '"+actif+"')";
		
		// etape 4 excution de la connexion
		st.executeUpdate(sql);
		
	}catch(SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} finally {
			
		try {
			cn.close();
			st.close();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub

	saveInBDD("shiptest", "prtest", "19930503", 1);
}
}
