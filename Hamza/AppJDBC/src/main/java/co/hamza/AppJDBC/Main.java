package co.hamza.AppJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		String DBDRIVER = "com.mysql.jdbc.Driver";
		String DBPATH = "jdbc:mysql://localhost:3306/promo";
		String DBUSER = "student";
		String DBPASSWORD = "";
		Scanner sc = new Scanner(System.in);

		try {
			// chargement du driver de la base de données
			Class.forName(DBDRIVER);

			// créer le connexion JDBC
			Connection connection = DriverManager.getConnection(DBPATH, DBUSER, DBPASSWORD);
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM apprenant");

			System.out.println("Quelle action souhaitez-vous effectuer ? ");
			System.out.println("A - Afficher tous les éléments de la base de données.");
			System.out.println("B - Ajouter une nouvelle donnée.");

			String saisie = sc.nextLine();

			if (saisie.equalsIgnoreCase("A")) {
				System.out.println("Liste actuelle des apprenants : ");
				while (rs.next()) {
					System.out.println(" - " + rs.getString("id_apprenant") + " : " + rs.getString("prenom") + " "
							+ rs.getString("nom"));

				}

			} else if (saisie.equalsIgnoreCase("B")) {
				System.out.println("Saisissez le nom souhaité : ");
				String nom = sc.next();
				System.out.println("Vous avez saisi : " + nom);
				System.out.println("Saisissez le prénom souhaité : ");
				String prenom = sc.next();
				System.out.println("Vous avez saisi : " + prenom);
				String requete = "INSERT INTO apprenant (prenom, nom) VALUES ('" + prenom + "', '" + nom + "')";

				statement.execute(requete);
				System.out.println("Enregistrement effectué");

			}

			connection.close();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
