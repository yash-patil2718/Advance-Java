package com.demo.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="dept11")

public class Department {
	
	@Id
	private int dpetno;
	private String dname;
	private String dloc;
	
	@OneToMany (mappedBy="dept",cascade=CascadeType.ALL)
	private Set<Employee> eset;

	public Department() {
		super();
	}

	public Department(int dpetno, String dname, String dloc, Set<Employee> eset) {
		super();
		this.dpetno = dpetno;
		this.dname = dname;
		this.dloc = dloc;
		this.eset = eset;
	}

	public int getDpetno() {
		return dpetno;
	}

	public void setDpetno(int dpetno) {
		this.dpetno = dpetno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDloc() {
		return dloc;
	}

	public void setDloc(String dloc) {
		this.dloc = dloc;
	}

	public Set<Employee> getEset() {
		return eset;
	}

	public void setEset(Set<Employee> eset) {
		this.eset = eset;
	}

	@Override
	public String toString() {
		return "Department [dpetno=" + dpetno + ", dname=" + dname + ", dloc=" + dloc + "]";
	}
	
	
	
	
}
