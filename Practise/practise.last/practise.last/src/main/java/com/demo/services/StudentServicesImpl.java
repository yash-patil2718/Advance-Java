package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

public class StudentServicesImpl implements StrudentServices{
	
	@Autowired
	private StudentDao sdao;

	@Override
	public List<Student> getAllStudent() {
		return sdao.getStudents();
	}
	

}
