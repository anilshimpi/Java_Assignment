package com.yash.jdbc.bankingsystem.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {
	
	static Connection con =null;

	public  static Connection getConnection() {
		try {
		
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbc","root","Yash@123");
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
