package com.product.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection conn;
	static Connection getConnection() {
	if(conn==null) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url = "jdbc:mysql://localhost:3306/dac_practise?useSSL=false";
			conn = DriverManager.getConnection(url, "root", "system");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
		return conn;
	}
	
	static Connection closeMyConnection() {
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
