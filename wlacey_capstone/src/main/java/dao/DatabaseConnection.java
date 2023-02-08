package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {
	Connection con;
	PreparedStatement ps = null;
	PreparedStatement ps2 = null;

	String createPackageTable = "CREATE TABLE IF NOT EXISTS packages(trackingID INTEGER PRIMARY KEY AUTOINCREMENT,"
																  + "originHub TEXT,"
																  + "destinationAddress TEXT,"
																  + "recipientName TEXT,"						  									
							  									  + "width DECIMAL(5,2),"
							  									  + "height DECIMAL(5,2),"
							  									  + "length DECIMAL(5,2),"
							  									  + "weight DECIMAL(5,2))";
	
	String createEmployeeTable = "CREATE TABLE IF NOT EXISTS employeeAccounts("
			  + "employeeID INTEGER PRIMARY KEY AUTOINCREMENT,"
			  + "firstName TEXT,"
			  + "lastName TEXT,"						  									
			  + "userName TEXT,"
			  + "password TEXT,"
			  + "hub TEXT)";
	
	String createTestPackage = "INSERT INTO packages VALUES(null, 'chicago','247 main street','mavin markle', 10.2, 10.2, 10.2,10.2)";
	
	
	public Connection getConnection() {
		String url = "jdbc:sqlite:database";
        try {
        	if(con == null || con.isClosed()) {
	        	Class.forName("org.sqlite.JDBC");
				con = DriverManager.getConnection(url);
	            System.out.println("Connection to SQLite has been established.");
	            ps = con.prepareStatement(createPackageTable);
	            ps.execute(); 
	            ps2 = con.prepareStatement(createEmployeeTable);
	            ps2.execute();	
	            //PreparedStatement ps2 = con.prepareStatement(createTestPackage);
	            //ps2.execute();
	            ps.close();
	            ps2.close();
            }
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
        return con;
	}
	
}
