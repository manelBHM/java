package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.MyConnection;
import connection.sqlContext;
import users.User;

public class UserDao extends sqlContext {
	static Connection con = null;
	static PreparedStatement preparedStatement = null;
	static ResultSet resultSet = null;
	static Statement statement = null;

	public static User getById(int id) throws Exception {
		User u = new User();
		try {
			con = MyConnection.getMyConnection();
			String sql = "SELECT `id`, `name`, `email`, `pass` FROM `users` WHERE id=?";

			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

				u.setId(resultSet.getInt(1));
				u.setName(resultSet.getString(2));
				u.setEmail(resultSet.getString(3));
				u.setPass(resultSet.getString(4));

			}

			MyConnection.closeDb();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return u;
	}

	public static void delete(int id) {
		String strDelete = "DELETE FROM users WHERE id=?";
		try {
			con = getMyConnection();
			preparedStatement = con.prepareStatement(strDelete);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			MyConnection.closeDb();

			System.out.println("\nDeleted Succussfully With: " + id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static int update(User pro) throws Exception {

		int st = 0;
		String sql = "UPDATE `users` SET `name`=?,`email`=?,`pass`=? WHERE id=?";

		try {
			con = getMyConnection();
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, pro.getName());
			preparedStatement.setString(2, pro.getEmail());
			preparedStatement.setString(3, pro.getPass());
			preparedStatement.setInt(4, pro.getId());

			st = preparedStatement.executeUpdate();
			MyConnection.closeDb();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return st;
	}

	public static int save(User p) {
		int num = 0;
		try {
			con = getMyConnection();
			String strInsert = "INSERT INTO users (`name`, `email`, `pass`, `avatar`) VALUES (?,?,?,?)";
			preparedStatement = con.prepareStatement(strInsert);
			preparedStatement.setString(1, p.getName());
			preparedStatement.setString(2, p.getEmail());
			preparedStatement.setString(3, p.getPass());
			preparedStatement.setBlob(4,  p.getAvatar());

			num = preparedStatement.executeUpdate();
			MyConnection.closeDb();

			System.out.println("\n Successfully Saved");
		} catch (Exception e) {
			System.out.println("Error" + e);
		}
		return num;
	}

	public static List<User> getList() throws Exception {
		List<User> list = new ArrayList<User>();

		con = getMyConnection();
		String strSelect = "SELECT * FROM users";
		statement = con.createStatement();
		resultSet = statement.executeQuery(strSelect);

		while (resultSet.next()) {
			User u = new User();
			u.setId(resultSet.getInt("id"));
			u.setName(resultSet.getString("name"));
			u.setEmail(resultSet.getString("email"));
			u.setPass(resultSet.getString("pass"));
			list.add(u);
		}
		return list;

	}

	public static Connection getMyConnection() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String URL = "jdbc:mysql://localhost:3306/markt_online" + "?useUnicode=true&characterEncoding=UTF-8";
			con = DriverManager.getConnection(URL, "", "");
			System.out.println("Connected");

		} catch (Exception e) {
			System.out.println("Unconnected" + e);
		}
		return con;
	}

	public static User getByEmail(String email) throws Exception {
		User u = new User();
		con = MyConnection.getMyConnection();
		String sql = "SELECT * FROM `users` WHERE email=?";
		try {

			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, u.getId());
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

				u.setId(resultSet.getInt(1));
				u.setName(resultSet.getString(2));
				u.setEmail(resultSet.getString(3));
				u.setPass(resultSet.getString(4));

			}

			MyConnection.closeDb();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return u;
	}

}
