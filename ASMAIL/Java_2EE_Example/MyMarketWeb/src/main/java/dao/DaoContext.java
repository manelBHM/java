package dao;

import javax.servlet.ServletContext;

public class DaoContext {
   protected static String dbURL;
   protected static String dbName;
   protected static String dbPass;
   
   public static void init(ServletContext context) {
	try {
		Class.forName(context.getInitParameter("com.mysql.jdbc.Driver"));
		dbURL = context.getInitParameter("jdbc:mysql://localhost:3306/markt_online?useUnicode=true&characterEncoding=UTF-8");
		dbName = context.getInitParameter("");
		dbPass = context.getInitParameter("");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
