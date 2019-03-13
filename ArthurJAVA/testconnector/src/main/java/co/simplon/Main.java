package co.simplon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	static String url = "jdbc:mysql://localhost:3306/promo";
	static String login = "root";
	static String pwd = "fraisess";
	static Connection cn = null;
	static Statement st = null;

	public static void firstrequest() {

		try {

			// Step 1 : Drvier loading
			Class.forName("com.mysql.jdbc.Driver");
			// Step2 : getting connexion
			cn = DriverManager.getConnection(url, login, pwd);
			// Step 3 : Statement creation
			st = cn.createStatement();
			String sql = "SELECT * FROM apprenant;";
			// Step 4 : request execution
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(" - " + rs.getString("id") + " - " + rs.getString("nom") + " "
						+ rs.getString("prenom") + " - date : " + rs.getString("date"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		
		}
	
	
	

	public static void insert() {
		boolean retour = true;
		Scanner sc = new Scanner(System.in);
		

		try {

			// Step 1 : Drvier loading
			Class.forName("com.mysql.jdbc.Driver");
			// Step2 : getting connexion
			cn = DriverManager.getConnection(url, login, pwd);
			// Step 3 : Statement creation
			st = cn.createStatement();

			do {
				System.out.println("1 : afficher la DB /// 2 : entrer un nouvel eleve");
				int choix = sc.nextInt();
				switch (choix) {

				case 1:
					firstrequest();
					System.out.println("Retour ? // Oui : 1 / Non : 2");
					int var2 = sc.nextInt();
					if (var2 == 2) {
						retour = false;
					}
					break;

				case 2:

					System.out.println("Entrez le nom :");
					String nom = sc.next();					
					System.out.println("Entrez le prenom");
					//Scanner sc2 = new Scanner(System.in);
					String prenom = sc.next();
					System.out.println("Entrez la date YYYYMMDD");
					int date = sc.nextInt();
					System.out.println("Entrez 1 pour présent, 0 pour absent");
					int actif = sc.nextInt();
					String sql = "INSERT INTO apprenant (nom, prenom, date, actif) values ('" + nom + "', '" + prenom
							+ "', '" + date + "', '" + actif + "')";
					st.executeUpdate(sql);
					firstrequest();
					System.out.println("Retour ? // Oui : 1 / Non : 2");
					int var3 = sc.nextInt();
					if (var3 == 2) {
						retour = false;
					}
					break;

				}
			} while (retour);
		}

		catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		finally {
			try {
				// Step 5 : freeing memory ressources
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {

		insert();

	}

}
