package test.mybdd;
import java.sql.*;
import java.util.Scanner;

public class RunMyBDD {
	
	public static void saveInBDD(String nom, String prenom, String date_de_naissance, Integer actif)
	{
		
	String url = "jdbc:mysql://localhost:3306/PROMO";
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
	
	
	
	// ma methode pour supprimer dans ma base de donnée
	
	public static void deleteInBDD(Integer id)
	{
		
	String url = "jdbc:mysql://localhost:3306/PROMO";
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
	
	public static void updateInBDD(Integer id, String nom, String prenom, String date_de_naissance, Integer actif)
	{
		
	String url = "jdbc:mysql://localhost:3306/PROMO";
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
		String sql = "UPDATE `apprenant` SET id='"+id+"', nom='"+nom+"', prenom='"+prenom+"', date_de_naissance='"+date_de_naissance+"', actif='"+actif+"' WHERE id='"+id+"'"; 
	 
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
         String bddpsswd = "root";

         try {
       	  Class.forName("com.mysql.jdbc.Driver");
       	  Connection connection = DriverManager.getConnection(bddPath, bddUser, bddpsswd);
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery("SELECT * FROM apprenant");
             while(rs.next()){
         System.out.println(rs.getString("id") + " : " + rs.getString("nom") + " " + rs.getString("prenom") + " " + rs.getString("date_de_naissance") +" " +rs.getString("actif"));
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
		System.out.println("Pour ajouter voila comment remplir : nom + prenom + date_de_naissance(YYMMDD) + actif(1 ou 2)");
		String nom = "";
		String prenom = "";
		String date = "";
		Integer actif = null;
		while((nom.isEmpty()) || (prenom.isEmpty()) || ((date.isEmpty())) || (actif==null))
				{
			System.out.println("nom : "); nom = sc.nextLine();
			System.out.println("prenom : "); prenom = sc.nextLine();
			System.out.println("date : "); date = sc.nextLine();
			System.out.println("actif : "); actif = scan.nextInt();
				}
		saveInBDD(nom, prenom, date, actif);
		GetBDD(true);
		break;
	case "U":
	
     Integer id2 = scan.nextInt();
		updateInBDD(id2, str, str, str, id2);
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
