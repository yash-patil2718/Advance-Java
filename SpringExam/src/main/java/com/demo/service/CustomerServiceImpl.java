package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.CustomerDao;
import com.demo.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerDao cd;

	public List<Customer> getAllCustomers() {
		return cd.findAllCust();
	}

}
