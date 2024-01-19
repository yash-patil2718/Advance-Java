package com.demo.service;

import java.util.List;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

public class StudentServiceImpl implements StudentService{
	
	private StudentDao sdao;

	public List<Student> getAllStudents() {
		return sdao.getAllStudents();
	}

}
