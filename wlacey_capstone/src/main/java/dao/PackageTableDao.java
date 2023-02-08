package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.Package;

public class PackageTableDao {
	DatabaseConnection DB = new DatabaseConnection();
	Connection con = null;
	PreparedStatement ps = null;;
	ResultSet rs;
	
	public Package getPackage(int trackingID) {
		String sql = "SELECT * FROM packages WHERE trackingID = ?";
		con = DB.getConnection();
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, trackingID);
			rs = ps.executeQuery();
			if(rs.next()) {
				Package pack = new Package(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getDouble(6), rs.getDouble(7), rs.getDouble(8));
				System.out.println(pack.getHeight());
				ps.close();
				rs.close();
				con.close();
				return pack;
			}
			else {
				ps.close();
				rs.close();
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int insertPackage(String originHub, String destinationAddress,
			String recipientName, double width, double height, double length, double weight) {
		String  sql = "INSERT INTO packages VALUES(null,?,?,?,?,?,?,?)";
		int result = 0;
		con = DB.getConnection();
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, originHub);
			ps.setString(2, destinationAddress);
			ps.setString(3, recipientName);
			ps.setDouble(4, width);
			ps.setDouble(5, height);
			ps.setDouble(6, length);
			ps.setDouble(7, weight);
			result = ps.executeUpdate();
			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}return result;
	}
}
