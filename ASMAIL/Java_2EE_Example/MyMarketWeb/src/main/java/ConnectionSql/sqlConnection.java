package ConnectionSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class sqlConnection {
	public static Connection con = null;
	public static Statement st = null;
	
    public static Connection getConnection() { 	
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/MarketOnline";
			con = DriverManager.getConnection(url, "", "");
		} catch (Exception e) {
		e.printStackTrace();
		}
    	return con;
    }
}
