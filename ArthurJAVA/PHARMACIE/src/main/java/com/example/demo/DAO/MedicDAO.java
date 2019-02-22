package com.example.demo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.example.demo.model.Medic;

public class MedicDAO {

	static String url = "jdbc:mysql://localhost:3306/pharmacie";
	static String login = "root";
	static String pwd = "fraisess";
	static Connection cn = null;
	static Statement st = null;
	ArrayList<Medic> listeSQL = new ArrayList<Medic>();

	public ArrayList<Medic> getProduit() {

		try {
			
			listeSQL.removeAll(listeSQL);

			// Step 1 : Drvier loading
			Class.forName("com.mysql.jdbc.Driver");
			// Step2 : getting connexion
			cn = DriverManager.getConnection(url, login, pwd);
			// Step 3 : Statement creation
			st = cn.createStatement();
			String sql = "SELECT * FROM medicament;";
			// Step 4 : request execution
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {

				String name = rs.getString("name");
				int price = rs.getInt("price");
				Medic medic = new Medic(name, price);				
				listeSQL.add(medic);
			   
			    

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return listeSQL;

	}

}
