package MysqlMaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PromoMaven {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
		String BDPATH = "jdbc:mysql://localhost:3306/promo";
		String DBUSER = "root";
		String DBPASSWORD = "simplon";
		Scanner sc = new Scanner(System.in);
         
         
         try {
        	 // chargement du driver de la base de données
        	 Class.forName(DATABASE_DRIVER);
        	 
        	 //créer le connexion JDBC
        	 Connection connection = DriverManager.getConnection(BDPATH, DBUSER, DBPASSWORD);
        	 Statement statement = connection.createStatement();
        	 ResultSet rs = statement.executeQuery("SELECT * FROM apprenant");
        	 
        	 System.out.println("Quelle action souhaitez-vous effectuer ? ");
        	 System.out.println("A - Afficher tous les éléments de la base de données.");
        	 System.out.println("B - Ajouter une nouvelle donnée.");
        	 
        	 String saisie = sc.nextLine();
        	 
        	 if(saisie.equalsIgnoreCase("A")) {
        		System.out.println("Liste actuelle des apprenants : ");
        		 while (rs.next()) {
            		 System.out.println(" - " + rs.getString("id_apprenant") + " : " + rs.getString("nom") + " " + rs.getString("prenom") + " " + rs.getString("date_naissance"));
            	 
             } connection.close(); 
        		
        	 } else if(saisie.equalsIgnoreCase("B")) {
        		 System.out.println("Saisissez le nom souhaité : ");
        		 String nom = sc.next();
        		 System.out.println("Vous avez saisi : " + nom);
        		 System.out.println("Saisissez le prénom souhaité : ");
        		 String prenom = sc.next();
        		 System.out.println("Vous avez saisi : " + prenom);
        		 System.out.println("Saisissez la date de naissance souhaité : ");
        		 String date_naissance = sc.next();
        		 String requete ="INSERT INTO apprenant (nom, prenom, date_naissance) VALUES ('" +nom+"', '"+prenom+"','" + date_naissance + "')";

        		 statement.execute(requete);
        		 System.out.println("Enregistrement effectué");
        		 
        	 }
        
        	
        	
    } catch (Exception e) {e.printStackTrace();
        
    }

	}}

		
				










