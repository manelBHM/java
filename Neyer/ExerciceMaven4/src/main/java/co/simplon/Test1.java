package co.simplon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/promo";
		String login = "root";
		String passwd = "simplonco";
		Connection cn = null;
		Statement st = null;
		Scanner sc = new Scanner(System.in);

		try {
			//----------------------------------------------------------------------------------------------------------
			//Etape 1 : chargement du driver

			Class.forName("com.mysql.jdbc.Driver");

			//Etape 2 : récupération de la connexion

			cn = DriverManager.getConnection(url, login, passwd);

			//Etape 3 : Création d'un statement

			st = cn.createStatement();

			String sql2 ="SELECT * FROM apprenant";
			//Etape 4 : exécution requête 

			ResultSet rs= st.executeQuery(sql2);


			System.out.println("Bonjour"+"\n");
			System.out.println("1 - afficher votre tab");
			System.out.println("2 - ajouter un apprenant dans votre tab ");

			int choix = sc.nextInt();

			if(choix == 1) {

				while(rs.next()) {
					System.out.println("ID : "+rs.getInt("id_apprenant") +" - "+rs.getString("nom")+" "+rs.getString("prenom")+
							" "+rs.getString("date_naissance")+" "+rs.getBoolean("actif"));
				}
				
				
			}else if(choix == 2) {
				String nom ="", prenom ="",date="";
				
				Integer actif=null;
				System.out.println("remplir le tableau");
				while(nom.isEmpty() || prenom.isEmpty() || date.isEmpty() || actif==null) {
					

				
					System.out.println("entrer le nom :");
					nom = sc.nextLine();//bizard
					//String z = sc.nextLine();
					
					System.out.println("Entrer le prenom : ");
					prenom = sc.nextLine();
					System.out.println("sa date de naissance : ");
					date = sc.nextLine();
//					System.out.println("Est t'il actif ? : 0 - non : 1 - oui");
//					boolean actif = sc.nextBoolean();
					
				}
				
				
				
				String ajout = "INSERT INTO apprenant (nom, prenom, date_naissance) VALUES ('"+nom+"','"+prenom+"','"+date+"')";
				st.executeUpdate(ajout);
				
				System.out.println("ID : "+rs.getInt("id_apprenant") +" - "+rs.getString("nom")+" "+rs.getString("prenom")+
						" "+rs.getString("date_naissance")+" "+rs.getBoolean("actif"));
				cn.close();
			}
			//st.executeUpdate(sql);





			//------------------------------------------------------------------------------------------------------------------------
		}catch(SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				
				st.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}


		//		ajoutApprenant("Sherlosk", "HOLMES", "13/03/1995", true);
		//		affiche();

	}
}
/*
	static public void ajoutApprenant(String nom,String prenom,String date,boolean actif) {
		// TODO Auto-generated method stub

		try {




			//Etape 1 : chargement du driver

			Class.forName("com.mysql.jdbc.Driver");

			//Etape 2 : récupération de la connexion

			cn = DriverManager.getConnection(url, login, passwd);

			//Etape 3 : Création d'un statement

			st = cn.createStatement();

			String sql = "INSERT INTO 'apprenant' ('nom','prenom','date_naissance','actif')VALUES('"+nom+"','"+prenom+"','"+date+"','"+actif+"')";

			//Etape 4 : exécution requête 

			st.executeUpdate(sql);





		}catch(SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				cn.close();
				st.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static void affiche() {


		String url = "jdbc:mysql://localhost:3306/promo";
		String login = "root";
		String passwd = "simplonco";
		Connection cn = null;
		Statement st = null;





	}
}
 */