package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;
@Service
public class EmployeeServicesImpl implements EmployeeServices{
	@Autowired
	private EmployeeDao edao;
	
	public List<Employee> getAllEmployee() {
		return edao.getAllLeaves();
	}

}
