package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import model.Product;

public class ProductDao {

   public static Product getById(int id) throws Exception {
	   Product pro = new Product();
	   Connection con = ProductDao.getMyConnection();
		String sql = "SELECT `id`, `name`, `description`, `price` FROM `products` WHERE id=?";
		try {	
					
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
		
				pro.setId(resultSet.getInt(1));
				pro.setName(resultSet.getString(2));
				pro.setDescription(resultSet.getString(3));
				pro.setPrice(resultSet.getDouble(4));

			}
		
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return pro;	
}
    public static void delete(int id) {
	String strDelete = "DELETE FROM products WHERE id=?";
	try {
		Connection con = getMyConnection();
		PreparedStatement st = con.prepareStatement(strDelete);
		st.setInt(1, id);
		st.executeUpdate();
		con.close();
		
		System.out.println("\nDeleted Succussfully With: "+id);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
    public static int update(Product pro) throws Exception {
		
		int st = 0;
		String sql = "UPDATE `products` SET `name`=?,`description`=?,`price`=? WHERE id=?";

		try {
			Connection con = getMyConnection();
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, pro.getName());
			preparedStatement.setString(2, pro.getDescription());
			preparedStatement.setDouble(3, pro.getPrice());
			preparedStatement.setInt(4, pro.getId());
			
			st = preparedStatement.executeUpdate();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return st;	
}
	public static int save(Product p) {
		int num = 0;
		try {
			Connection con = getMyConnection();	
			String strInsert = "INSERT INTO products (`name`, `description`, `price`) VALUES (?,?,?)";
			PreparedStatement preparedStatement = con.prepareStatement(strInsert);
			preparedStatement.setString(1, p.getName());
			preparedStatement.setString(2, p.getDescription());
			preparedStatement.setDouble(3, p.getPrice());
			
			num = preparedStatement.executeUpdate();
			con.close();

			System.out.println("\n Successfully Saved");
		} catch (Exception e) {
			System.out.println("Error"+e);
		}
		return num;
	}
	public static List<Product> getList() throws Exception {
		List<Product> list = new ArrayList<Product>();

		Connection con = getMyConnection();
		String strSelect = "SELECT * FROM products";
		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery(strSelect);
		while (resultSet.next()) {
			
			Product p = new Product();
			p.setId(resultSet.getInt("id"));
			p.setName(resultSet.getString("name"));
			p.setDescription(resultSet.getString("description"));
			p.setPrice(resultSet.getDouble("price"));
			list.add(p);
		}
		return list;
	}
	public static Connection getMyConnection() throws Exception {
		Connection con = null;
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
	
}
