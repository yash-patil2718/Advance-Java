package com.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.model.Customer;

@Repository
public class CustomerdaoImpl implements CustomerDao{
	
	@Autowired
	JdbcTemplate jd;

		public List<Customer> findAllCust() {
			return jd.query("select * from customer111",(rs,num) ->{
					Customer c =new Customer();
					c.setCustomerId(rs.getString(1));
					c.setAddPack(rs.getString(2));
					c.setBasePack(rs.getString(3));
					return c;
				
			});
		}
}

	
