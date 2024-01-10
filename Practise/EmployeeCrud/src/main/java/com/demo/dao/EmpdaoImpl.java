package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Employee;

public class EmpdaoImpl implements Empdao {
	static Connection conn;
	static PreparedStatement selemp;
	
	static {
		conn = DBUtil.getConnection();
		try {
			selemp = conn.prepareStatement("select * from Employee");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public List<Employee> getallEmployee() {
		List<Employee> elist = new ArrayList();
		
		try {
			ResultSet rs = selemp.executeQuery();
			
			while(rs.next()) {
				Employee e = new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3));
				elist.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return elist;
	}

}
