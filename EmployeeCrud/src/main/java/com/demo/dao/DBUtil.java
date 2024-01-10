package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection conn;
	public static Connection getConnection() {
		if(conn==null) {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url = "jdbc:mysql://192.168.10.150:3306/dac9?useSSL=false";
				conn = DriverManager.getConnection(url, "dac9", "welcome");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	public static Connection closeConnection() {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}
}
