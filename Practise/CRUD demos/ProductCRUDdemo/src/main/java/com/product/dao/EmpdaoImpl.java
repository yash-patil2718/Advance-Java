package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.products.model.Product;

public class EmpdaoImpl implements Empdao {
	static Connection conn;
	static PreparedStatement selpro;
		
	static {
		conn = DBUtil.getConnection();
		try {
			selpro = conn.prepareStatement("select * from product");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	public List<Product> getAllProducts() {
		List<Product> plist = new ArrayList<>();
		try {
			ResultSet rs = selpro.executeQuery();
			while(rs.next()) {
				Product p = new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4));
				plist.add(p);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return plist;
	}

}
