package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Student;
import com.demo.service.StudentService;

public class StudentController {

	private StudentService sservice;
	
	public ModelAndView getStudents(HttpSession session) {
		List<Student> slist = sservice.getAllStudents();
		return new ModelAndView("displayStudent","slist",slist);
		
	}
}
