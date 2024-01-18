package com.demo.service;

import java.util.List;

import com.demo.dao.EmpDao;
import com.demo.dao.EmpDaoImpl;
import com.demo.model.Employee;

public class EmpServiceImpl implements EmpService{
	
	private EmpDao edao;
	
	
	public EmpServiceImpl()
	{
		edao = new EmpDaoImpl();
	}
	@Override
	public List<Employee> findAllEmployees() {
		
		List<Employee> elist = edao.getAllEmployees();
	
//		elist.forEach(System.out::println);
		return elist;
		
	}
	@Override
	public void addnewemp(Employee e) {
		
		edao.insertnewEmp(e);
		
	}
	@Override
	public Employee getById(int eid) {
		// TODO Auto-generated method stub
		Employee e = edao.findById(eid);
		return e;
		
	}
	@Override
	public void UpdateEmp(Employee e) {
		
		edao.UpdateById(e);
	}
	@Override
	public void deleteById(int empid) {
		edao.removeById(empid);
		
	}
	
	

}
