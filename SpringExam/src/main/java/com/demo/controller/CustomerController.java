package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Customer;
import com.demo.service.CustomerService;

@Controller
@RequestMapping("/home")
public class CustomerController {
	
	@Autowired
	CustomerService cs;
	
	@GetMapping("/")
	public String displayHomePage()
	{
		return "Home";
	}
	
	@GetMapping("/allCustomer")
	public ModelAndView displayAllCust()
	{
		List<Customer> lc =cs.getAllCustomers();
		
		return new ModelAndView("AllCustomer","cList",lc);
	}

}
