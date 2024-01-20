package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Employee;
import com.demo.services.EmployeeServices;

@Controller
@RequestMapping("/leave")
public class EmployeeController {
	@Autowired
	private EmployeeServices eservice;
	
	@GetMapping("/leaves")
	public ModelAndView getLeaveDetails(HttpSession session) {
		List<Employee> elist = eservice.getAllEmployee();
		return new ModelAndView("employeeleave.jsp","elist",elist);
	}
	
	
}
