package metier.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entites.apprenant;

public class dao implements Idao<apprenant> {
	String url = "jdbc:mysql://localhost:3306/promo";
	String user= "admin";
    String pw = "beel123";
    Connection connection;
    
    
    
    public Connection getConnection() {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, pw);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		 return connection;
    }
    
    
	public void Create(apprenant s) {
		connection = getConnection();
		try {
			
			Statement st = connection.createStatement();
			String sql= "INSERT INTO `apprenant` (`nom`, `prenom`, `date_naissance`, `active`) VALUES ('"+s.getNom()+"', '"+s.getPrenom()+"','"+s.getDate_naissance()+"','"+s.getActive()+"')";
			st.executeUpdate(sql);
		//	sql= "SELECT MAX(id) FROM `apprenant`";
	//	int id = st.executeUpdate(sql);
	//	s.setId(id);
			st.close();
			connection.close();
		} catch (Exception e) {
              e.printStackTrace();
		}
	
	}

	public void Delete(int id) {
		connection = getConnection();
		try {
			Statement st = connection.createStatement();
			String sql= "DELETE FROM `apprenant` WHERE `apprenant`.`id` = '"+id+"'";
			st.executeUpdate(sql);
			st.close();
			connection.close();
		} 
		catch (Exception e) {
              e.printStackTrace();
		}
		
	}

	public void Update(apprenant a) {
		connection = getConnection();
		try {
			Statement st = connection.createStatement();
			String sql= "INSERT INTO `apprenant` (`nom`, `prenom`, `date_naissance`, `active`) VALUES ('aa', 'SS', 'AA', '1')";
			st.executeUpdate(sql);
			st.close();
			connection.close();
		} 
		catch (Exception e) {
              e.printStackTrace();
		}
		
	}

	public List<apprenant> findByKeyWord(String kw) {
		List<apprenant> etudiants = new ArrayList<apprenant>();
		connection = getConnection();
		try {
			Statement st = connection.createStatement();
			String sql= "SELECT * FROM `apprenant` WHERE nom LIKE '"+"%"+kw+"%"+"'";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				apprenant a = new apprenant();
				a.setId(rs.getInt("id"));
				a.setNom(rs.getString("nom"));
				a.setPrenom(rs.getString("prenom"));
				a.setDate_naissance(rs.getString("date_naissance"));
				a.setActive(rs.getInt("active"));
				etudiants.add(a);
			}
			st.close();
			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return etudiants;
		
	}

	public List<apprenant> findAll() {
		List<apprenant> etudiants = new ArrayList<apprenant>();
		connection = getConnection();
		try {
			Statement st = connection.createStatement();
			String sql= "SELECT * FROM `apprenant` ORDER BY `id` ASC";
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				apprenant a = new apprenant();
				a.setId(rs.getInt("id"));
				a.setNom(rs.getString("nom"));
				a.setPrenom(rs.getString("prenom"));
				a.setDate_naissance(rs.getString("date_naissance"));
				a.setActive(rs.getInt("active"));
				etudiants.add(a);
			}
			st.close();
			connection.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return etudiants;
	}

	@Override
	public apprenant FindById(int id) {
		apprenant a = new apprenant();
		connection = getConnection();
		try {
			Statement st = connection.createStatement();
			String sql= "SELECT  FROM `apprenant` WHERE `id='"+id+"'";
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				a.setId(rs.getInt("id"));
				a.setNom(rs.getString("nom"));
				a.setPrenom(rs.getString("prenom"));
				a.setDate_naissance(rs.getString("date_naissance"));
				a.setActive(rs.getInt("active"));
			}
			st.close();
			connection.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

}

