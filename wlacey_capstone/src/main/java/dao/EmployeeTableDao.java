package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeTableDao {
	DatabaseConnection DB = new DatabaseConnection();
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public void insertEmployee(String firstName, String lastName, String email, String password,
			String hubID) {
		String  sql = "INSERT INTO employeeAccounts VALUES(null,?,?,?,?,?)";
		try {		
			con = DB.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, email);
			ps.setString(4, password);
			ps.setString(5, hubID);
			ps.execute();
			System.out.println("account succesfully created!");
			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public boolean checkEmail(String email) {
		boolean exists = false;
		con = DB.getConnection();
		String  sql = "SELECT * FROM employeeAccounts WHERE userName = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			rs = ps.executeQuery();
			if(rs.next()) {
				exists = true;
			}
			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return exists;
	} 
}
