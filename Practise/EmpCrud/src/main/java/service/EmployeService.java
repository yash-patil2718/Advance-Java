package service;

import java.util.List;

import model.Employe;

public interface EmployeService {

	List<Employe> getAllEmp();

	void addEmp(Employe e);

	void deleteEmp(int eid);

	Employe getById(int eid);

	void updateEmp(Employe e);

}
