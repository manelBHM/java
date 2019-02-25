package test.mybdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Dao {
	
	
	public List display(Boolean b)


	{
		List<Apprenant> listApprenant = new ArrayList<Apprenant>();

		if(b == true)
		{
			String bddDriver = "com.mysql.jdbc.Driver";
			String bddPath = "jdbc:mysql://localhost:3306/promo";
			String bddUser = "lucky";
			String bddpsswd = "";

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection(bddPath, bddUser, bddpsswd);
				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery("SELECT * FROM apprenant");
				while(rs.next()){

				
			Apprenant a = new Apprenant(rs.getString("surnom"));

					listApprenant.add(a);

				} connection.close();

			} catch (Exception e) {e.printStackTrace();}
		}
		else {System.out.println("Ajouter la valeur TRUE a la methode GETBDD pour afficher les elements de la table");}

		return listApprenant;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dao d = new Dao();
		
		System.out.println(d.display(true));
		}
}
