package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class sqlContext {
	protected static Connection con = null;
	protected static PreparedStatement preparedStatement = null;
	protected static ResultSet resultSet = null;
	protected static Statement statement = null;
}
