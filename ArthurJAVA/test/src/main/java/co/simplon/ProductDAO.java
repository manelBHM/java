package co.simplon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductDAO {
	
	static String url = "jdbc:mysql://localhost:3306/exo_magasin";
	static String login = "root";
	static String pwd = "fraisess";
	static Connection cn = null;
	static Statement st = null;
	ArrayList<Produit> listeSQL = new ArrayList<Produit>();
	
	public ArrayList<Produit> getProduit() {
		
		try {

			// Step 1 : Drvier loading
			Class.forName("com.mysql.jdbc.Driver");
			// Step2 : getting connexion
			cn = DriverManager.getConnection(url, login, pwd);
			// Step 3 : Statement creation
			st = cn.createStatement();
			String sql = "SELECT * FROM produits;";
			// Step 4 : request execution
			ResultSet rs = st.executeQuery(sql);						
			while (rs.next()) {				
				
				String name = rs.getString("name");
				String desc = rs.getString("description");
				int price = rs.getInt("price");
			    listeSQL.add(new Produit(name, desc, price));              								
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("error");
		}
//		finally {
//			try {
//				// Step 5 : freeing memory ressources
//				cn.close();
//				st.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//
//		}
		return listeSQL;

		
		}

	}


