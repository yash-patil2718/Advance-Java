package com.demo.model;

import java.util.Date;

public class Employee {
	private int Empno;
	private Date Startdate;
	private Date Enddate;
	private String Leavetype;
	private String Reason;
	public Employee() {
		super();
	}
	public Employee(int empno, Date startdate, Date enddate, String leavetype, String reason) {
		super();
		Empno = empno;
		Startdate = startdate;
		Enddate = enddate;
		Leavetype = leavetype;
		Reason = reason;
	}
	public int getEmpno() {
		return Empno;
	}
	public void setEmpno(int empno) {
		Empno = empno;
	}
	public Date getStartdate() {
		return Startdate;
	}
	public void setStartdate(Date startdate) {
		Startdate = startdate;
	}
	public Date getEnddate() {
		return Enddate;
	}
	public void setEnddate(Date enddate) {
		Enddate = enddate;
	}
	public String getLeavetype() {
		return Leavetype;
	}
	public void setLeavetype(String leavetype) {
		Leavetype = leavetype;
	}
	public String getReason() {
		return Reason;
	}
	public void setReason(String reason) {
		Reason = reason;
	}
	@Override
	public String toString() {
		return "Employee [Empno=" + Empno + ", Startdate=" + Startdate + ", Enddate=" + Enddate + ", Leavetype="
				+ Leavetype + ", Reason=" + Reason + "]";
	}
	
	
}
