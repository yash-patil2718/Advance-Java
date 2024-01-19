package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.demo.model.Student;

public class StudentDaoImpl implements StudentDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Student> getAllStudents() {
		return jdbcTemplate.query("Select * from student11",(rs,num)->{
			Student s = new Student();
			s.setSid(rs.getInt(1));
			s.setSname(rs.getString(2));
			return s;
		});
	}

}
