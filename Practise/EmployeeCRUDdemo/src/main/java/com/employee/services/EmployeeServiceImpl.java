package com.employee.services;

import java.util.List;

import com.emploee.beans.Employee;
import com.employee.dao.EmployeeDao;
import com.employee.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDao edao;
	
	public EmployeeServiceImpl() {
		this.edao = new EmployeeDaoImpl();
	}

	@Override
	public List<Employee> findAllEmployees() {
		return edao.getAllEmployee();
	}

}
