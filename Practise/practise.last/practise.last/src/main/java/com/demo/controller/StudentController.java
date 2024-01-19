package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Student;
import com.demo.services.StrudentServices;

public class StudentController {
	
	@Autowired
	private StrudentServices sservice;
	
	public ModelAndView displayStudent(HttpSession session) {
		List<Student> slist = sservice.getAllStudent();
		return new ModelAndView("displaystudent","slist",slist);
	}

}
