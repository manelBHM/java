package validation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.MyConnection;
import connection.sqlContext;

public class Validate extends sqlContext {
      public static boolean checkUser(String email, String pass) {
		boolean st = false;
		try {
		    con = MyConnection.getMyConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE email=? AND pass=?");
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			st = rs.next();
					
		} catch (Exception e) {
			// TODO: handle exception
		}
		return st;
	}
}
