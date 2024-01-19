package com.demo.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.demo.model.Student;

public class StudentDaoImpl implements StudentDao{

	@Override
	public List<Student> getStudents() {
		return jdbcTemplate.query("select * from student11", (rs,num)->{
			Product p = new Product();
			s.setsid(rs.getInt(1));
			s.setsname(rs.getString(2));
			return p;
			
		});
	}

}

