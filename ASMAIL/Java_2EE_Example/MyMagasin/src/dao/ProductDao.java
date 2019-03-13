package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.MyConnection;
import connection.sqlContext;
import model.Product;

public class ProductDao extends sqlContext {

	public static Product getById(int id) throws Exception {
		Product pro = new Product();
		con = MyConnection.getMyConnection();
		String sql = "SELECT `id`, `name`, `description`, `price` FROM `products` WHERE id=?";
		try {

			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				pro.setId(resultSet.getInt(1));
				pro.setName(resultSet.getString(2));
				pro.setDescription(resultSet.getString(3));
				pro.setPrice(resultSet.getDouble(4));

			}
			MyConnection.closeDb();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return pro;
	}

	public static void delete(int id) {
		String strDelete = "DELETE FROM products WHERE id=?";
		try {
		    con = MyConnection.getMyConnection();
			preparedStatement = con.prepareStatement(strDelete);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			MyConnection.closeDb();

			System.out.println("\nDeleted Succussfully With: " + id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static int update(Product pro) throws Exception {

		int st = 0;
		String sql = "UPDATE `products` SET `name`=?,`description`=?,`price`=? WHERE id=?";

		try {
			con = MyConnection.getMyConnection();
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, pro.getName());
			preparedStatement.setString(2, pro.getDescription());
			preparedStatement.setDouble(3, pro.getPrice());
			preparedStatement.setInt(4, pro.getId());

			st = preparedStatement.executeUpdate();
			MyConnection.closeDb();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return st;
	}

	public static int save(Product p) {
		int num = 0;
		try {
		    con = MyConnection.getMyConnection();
			String strInsert = "INSERT INTO products (`name`, `description`, `price`) VALUES (?,?,?)";
			preparedStatement = con.prepareStatement(strInsert);
			preparedStatement.setString(1, p.getName());
			preparedStatement.setString(2, p.getDescription());
			preparedStatement.setDouble(3, p.getPrice());

			num = preparedStatement.executeUpdate();
			MyConnection.closeDb();

			System.out.println("\n Successfully Saved");
		} catch (Exception e) {
			System.out.println("Error" + e);
		}
		return num;
	}

	public static List<Product> getList() throws Exception {
		List<Product> list = new ArrayList<Product>();

		Connection con = MyConnection.getMyConnection();
		String strSelect = "SELECT * FROM products";
		statement = con.createStatement();
		resultSet = statement.executeQuery(strSelect);
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

}
