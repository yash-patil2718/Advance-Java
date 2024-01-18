package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Employee;

public class EmpDaoImpl implements EmpDao{
	
	static Connection conn;
	
	static PreparedStatement selemp,insemp,selbyid,upbyid,delemp;
	
	static {
		
		
		try {
			conn = DBUtil.getMyConnection();
			selemp = conn.prepareStatement("select * from employee");
			insemp = conn.prepareStatement("insert into employee values(?,?,?)");
			selbyid = conn.prepareStatement("select * from employee where empid=?");
			upbyid = conn.prepareStatement("update employee set ename=?, sal=? where empid=?");
			delemp = conn.prepareStatement("delete from employee where empid=?");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		List<Employee> elist = new ArrayList<>();
		
		try {
			ResultSet rs = selemp.executeQuery();
			while(rs.next())
			{
				Employee e = new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3));
				
				elist.add(e);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return elist;
	}

	@Override
	public void insertnewEmp(Employee e) {
		
		try {
			insemp.setInt(1, e.getEmpid());
			insemp.setString(2, e.getEname());
			insemp.setDouble(3, e.getSal());
			insemp.executeUpdate();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
	}

	@Override
	public Employee findById(int eid) {
		
		try {
			selbyid.setInt(1, eid);
			ResultSet  rs = selbyid.executeQuery();
			
			if(rs.next())
			{
				return new  Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	
		
		
	}

	@Override
	public void UpdateById(Employee e) {
		
		try {
			upbyid.setString(1,e.getEname());
			upbyid.setDouble(2, e.getSal());
			upbyid.setInt(3, e.getEmpid());
			upbyid.executeUpdate();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public void removeById(int empid) {
		
		try {
			delemp.setInt(1, empid);
			delemp.executeUpdate();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
			
		
	}

}
