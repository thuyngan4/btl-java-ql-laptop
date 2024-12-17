package quanlydienthoai.Controller;

import static quanlydienthoai.Connect.ConnectDB.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import quanlydienthoai.Connect.ConnectDB;
import quanlydienthoai.Models.Phone;

public class PhoneController {

	public static List<Phone> getAllPhone() {
		List<Phone> list = new ArrayList<Phone>();

		try {
			Connection conn = ConnectDB.getConnection();
			String sql = "SELECT * FROM PHONES;";
			Statement stmt = conn.createStatement();
			ResultSet p = stmt.executeQuery(sql);
			while (p.next()) {
				Phone lap = new Phone(p.getInt(1), p.getString(2), p.getString(3), p.getInt(4), p.getInt(5));

				list.add(lap);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public static List<Phone> getAllPhoneByName(String name) {
		List<Phone> list = new ArrayList<Phone>();
		String sql = "select * from PHONES where name LIKE '%" + name + "%'";

		name.trim();
		while (name.indexOf("  ") != -1) {
			name = name.replace("  ", " ");
		}
		name.toLowerCase();

		try {
			Connection conn = getConnection();
			Statement stmt = conn.createStatement();
			ResultSet p = stmt.executeQuery(sql);
			while (p.next()) {
				Phone lap = new Phone(p.getInt(1), p.getString(2), p.getString(3), p.getInt(4), p.getInt(5));

				list.add(lap);
			}
		} catch (SQLException e) {
			System.out.println("Error get all account: " + e.getMessage());
		}

		return list;
	}

	public static Phone getPhoneById(int idPhone) {
		Phone lap = null;
		String sql = "select * from PHONES where id = '" + idPhone + "';";
		try {
			Connection conn = getConnection();
			Statement stmt = conn.createStatement();
			ResultSet p = stmt.executeQuery(sql);
			if (p.next()) {
				lap = new Phone(p.getInt(1), p.getString(2), p.getString(3), p.getInt(4), p.getInt(5));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return lap;
	}

	public static boolean CreateNewPhone(Phone Phone) {
		String sql = "INSERT INTO PHONES (name, manufacturer, quantity, price) VALUES (?,?,?,?)";
		try {
			Connection conn = getConnection();
			PreparedStatement p = conn.prepareStatement(sql);
			p.setString(1, Phone.getName());
			p.setString(2, Phone.getManufacturer());
			p.setInt(3, Phone.getQuantity());
			p.setInt(4, Phone.getPrice());
			p.execute();
			p.close();
			conn.close();
			System.out.println("Create new account success!");
			return true;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public static boolean updatePhone(Phone Phone) {
		String sql = "UPDATE PHONES SET name = ?, manufacturer = ?, quantity = ?, price = ? WHERE id = ?";
		try {

			Connection conn = ConnectDB.getConnection();
			PreparedStatement p = conn.prepareStatement(sql);

			p.setString(1, Phone.getName());
			p.setString(2, Phone.getManufacturer());
			p.setInt(3, Phone.getQuantity());
			p.setInt(4, Phone.getPrice());
			p.setInt(5, Phone.getId());
			p.executeUpdate();
			p.close();
			conn.close();
			System.out.println("Update account success!");
			return true;

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public static boolean deletePhone(int idPhone) {
		String sqlDeleteUser = "DELETE FROM PHONES WHERE id = '" + idPhone + "';";
		try {

			Connection conn = ConnectDB.getConnection();
			PreparedStatement p = conn.prepareStatement(sqlDeleteUser);

			p.execute();
			p.close();
			conn.close();
			return true;

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

}
