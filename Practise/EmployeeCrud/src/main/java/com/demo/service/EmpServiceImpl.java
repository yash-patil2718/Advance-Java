package com.demo.service;

import java.util.List;

import com.demo.dao.Empdao;
import com.demo.dao.EmpdaoImpl;
import com.demo.model.Employee;

public class EmpServiceImpl implements EmpService{
	
	private Empdao edao;
	public EmpServiceImpl() {
		this.edao = new EmpdaoImpl();
	}
	
	@Override
	public List<Employee> findallEmployees() {
		return edao.getallEmployee();
	}

}
