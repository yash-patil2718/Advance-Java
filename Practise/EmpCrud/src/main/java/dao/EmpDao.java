package dao;

import java.util.List;

import model.Employe;

public interface EmpDao {

	List<Employe> findAllEmp();

	void addEmp(Employe e);

	void deleteEmp(int eid);

	Employe getById(int eid);

	void updateEmp(Employe e);

}
