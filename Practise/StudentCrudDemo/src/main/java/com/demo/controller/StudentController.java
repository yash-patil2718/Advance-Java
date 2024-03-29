package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Student;
import com.demo.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService sservice;
	
	@GetMapping("/getstudents")
	public ModelAndView getStudents(HttpSession session) {
		List<Student> slist = sservice.getAllStudents();
		return new ModelAndView("displaystudent","slist",slist);	
	}
}
