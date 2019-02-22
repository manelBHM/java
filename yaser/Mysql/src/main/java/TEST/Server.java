package TEST;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;


public class Server {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		
		String url = ("jdbc:mysql://localhost:3306/promo");
		String login = "root";
		String passwd ="simplonco";
		Connection cn = null;
		Statement st = null;
		
		try {
			
			
		
		Class.forName("com.mysql.jdbc.Driver");
		
		cn = DriverManager.getConnection(url,login,passwd);
		st = cn.createStatement();
		ResultSet rs = st.executeQuery("select * from contry");
        while(rs.next()) {
   
            System.out.println(rs.getString("id")+" "+rs.getString("nom")+" "+rs.getString("prenom")+" "+rs.getString("dateDeNiss")+" "+rs.getString("actif"));
        }
        
     
    
        
        
        
        
        
        
        
        
        
        
        
        System.out.print("Enter the new name: ");
        String nom=  input.next();
        
        System.out.print("Enter the new lastname: ");
        String prenom=  input.next();
        
        System.out.print("Enter the new date: ");
        String dateDeNiss =   input.next();
        
        System.out.print("if you are actife enter 1 if not enter 0 : ");
       String actif=  input.next();
       
         Statement pstmt = cn.createStatement();
       String reqsql="insert into contry (nom,prenom,dateDeNiss,actif) values ('"+nom+"','"+prenom+"','"+dateDeNiss+"','"+actif+"')";
        pstmt.executeUpdate(reqsql);
        
        
        
		}
		catch
			(SQLException e ){
				e.printStackTrace();
		
			}
			
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				cn.close();
				st.close();
			}
			
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
