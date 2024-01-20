package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	 @Autowired
	   private JdbcTemplate jdbcTemplate;

	 public List<Employee> getAllLeaves() {
		return jdbcTemplate.query("select * from employee12", (rs,num)->{
			Employee p=new Employee();
			p.setEmpno(rs.getInt(1));
			p.setStartdate(rs.getDate(2));
			p.setEnddate(rs.getDate(3));
			p.setLeavetype(rs.getString(4));
			p.setReason(rs.getString(5));
			return p;
		});
	}
}
