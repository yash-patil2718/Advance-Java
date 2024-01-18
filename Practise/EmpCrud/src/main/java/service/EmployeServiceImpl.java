package service;

import java.util.List;


import dao.EmpDao;
import dao.EmpDaoImp;

import model.Employe;

public class EmployeServiceImpl implements EmployeService
{
	private EmpDao edao;
public EmployeServiceImpl()
{
		super();
		this.edao = new EmpDaoImp();
}
	@Override
	public List<Employe> getAllEmp() {
		return edao.findAllEmp();
	
}
	@Override
	public void addEmp(Employe e) {
		edao.addEmp(e);
		
	}
	@Override
	public void deleteEmp(int eid) {
		edao.deleteEmp(eid);
		
	}
	@Override
	public Employe getById(int eid) {
		return edao.getById(eid);
		
	}
	@Override
	public void updateEmp(Employe e) {
		 edao.updateEmp(e);
		
	}
}