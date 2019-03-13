package test.mybdd;
import java.sql.*;
import java.util.Scanner;

public class RunMyBDD {
	
	public static void saveInBDD(String nom, String prenom, String date_de_naissance)
	{
		
	String url = "jdbc:mysql://localhost:3306/PROMO";
	String login = "root";
	String psswd = "";
	Connection cn = null;
	Statement st = null;
	
	try {
		// etape 1 chargement du DRIVER
		Class.forName("com.mysql.jdbc.Driver");
		
		// etape 2 recuperation de la connexion
		cn = DriverManager.getConnection(url, login, psswd);
		
		// etape 3 Creation d'un statement
		st = cn.createStatement();
		String sql = "INSERT INTO `apprenant` (`nom`, `prenom`, `date_de_naissance`) VALUES ('"+nom+"','"+prenom+"', '"+date_de_naissance+"')";
	 
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
	
	
	
	// ma methode pour supprimer dans ma base de donnée
	
	public static void deleteInBDD(Integer id)
	{
		
	String url = "jdbc:mysql://localhost:3306/PROMO";
	String login = "root";
	String psswd = "";
	Connection cn = null;
	Statement st = null;
	
	try {
		// etape 1 chargement du DRIVER
		Class.forName("com.mysql.jdbc.Driver");
		
		// etape 2 recuperation de la connexion
		cn = DriverManager.getConnection(url, login, psswd);
		
		// etape 3 Creation d'un statement
		st = cn.createStatement();
		String sql = "DELETE FROM `apprenant` WHERE id='"+id+"'"; 
	 
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
	
	
	
	// ma methode pour MODIFIER dans ma base de donnée
	
	public static void updateInBDD(int id, String nom, String prenom, String date_de_naissance)
	{
		
	String url = "jdbc:mysql://localhost:3306/PROMO";
	String login = "root";
	String psswd = "";
	Connection cn = null;
	Statement st = null;
	
	try {
		// etape 1 chargement du DRIVER
		Class.forName("com.mysql.jdbc.Driver");
		
		// etape 2 recuperation de la connexion
		cn = DriverManager.getConnection(url, login, psswd);
		
		// etape 3 Creation d'un statement
		st = cn.createStatement();
		String sql = "UPDATE `apprenant` SET id='"+id+"', nom='"+nom+"', prenom='"+prenom+"', date_de_naissance='"+date_de_naissance+"' WHERE id='"+id+"'"; 
	 
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
	
	
	
	
	public static void GetBDD(Boolean b)
	
	
	{
		if(b == true)
		{
		 String bddDriver = "com.mysql.jdbc.Driver";
		 String bddPath = "jdbc:mysql://localhost:3306/PROMO";
         String bddUser = "root";
         String bddpsswd = "";

         try {
       	  Class.forName("com.mysql.jdbc.Driver");
       	  Connection connection = DriverManager.getConnection(bddPath, bddUser, bddpsswd);
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery("SELECT * FROM apprenant");
             while(rs.next()){
            	 
         System.out.println(rs.getString("id") + " : " + rs.getString("nom") + " " + rs.getString("prenom") + " " + rs.getString("date_de_naissance"));
         } connection.close();
         
         } catch (Exception e) {e.printStackTrace();}
	}
		else {System.out.println("Ajouter la valeur TRUE a la methode GETBDD pour afficher les elements de la table");}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		
        
		String str = "";
		
	    
		while(!str.equals("exit"))
		{
		System.out.println("What do you want to do ? D - Display all record / A - for Add new elements / U - For UPDATE");
		   str = sc.nextLine();
		   
	   switch (str) {
	case "D":
		GetBDD(true);
		
		break;
	case "A" :
		String nom = "";
		String prenom = "";
		String date = "";
		while((nom.isEmpty()) || (prenom.isEmpty()) || ((date.isEmpty())))
				{
			System.out.println("nom : "); nom = sc.nextLine();
			System.out.println("prenom : "); prenom = sc.nextLine();
			System.out.println("date : "); date = sc.nextLine();
				}
		
		saveInBDD(nom, prenom, date);
		GetBDD(true);
		break;
		
	case "U":
		
		
		String n = "";
		String p = "";
		String d = "";
		
		Integer id2 = null;
		while((n.isEmpty()) || (p.isEmpty()) || ((d.isEmpty())) || ((id2 == null)))
				{
			System.out.println("id : "); id2 = scan.nextInt();
			System.out.println("nom : "); n = sc.nextLine();
			System.out.println("prenom : "); p = sc.nextLine();
			System.out.println("date : "); d = sc.nextLine();
				}
				
		updateInBDD(id2, n, p, d);
		
		break;
		
		
		
	case "R":
		System.out.println("Pour supprimer saisissez l'id que vous souhaitez supprimez");
		Integer id3 = scan.nextInt();
		deleteInBDD(id3);
	default:
		break;
	}
	
		}
		}
}
