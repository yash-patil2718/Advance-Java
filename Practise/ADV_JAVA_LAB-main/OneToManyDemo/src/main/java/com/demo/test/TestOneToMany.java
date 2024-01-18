package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Department;
import com.demo.model.Employee;

public class TestOneToMany {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee(1,"Sanyog",230032);
		Employee e2 = new Employee(101,"Aniket",265438);
		Employee e3 = new Employee(102,"MSD",32763);
		Employee e4 = new Employee(103,"Jaddu",15218);
		
		Set<Employee> eset1= new HashSet<Employee>();
		eset1.add(e1);
		eset1.add(e2);
		
		
		Set<Employee> eset2=new HashSet<Employee>();
		eset2.add(e3);
		eset2.add(e4);
		
		
		System.out.println("Before ");
		Department dept1= new Department(24,"HR Admin","Pune",eset1);
		Department dept2 = new Department(25," Assistant Manager","Shirwal",eset2);
		System.out.println("After");
		
		e1.setDept(dept1);
		e2.setDept(dept1);
		e3.setDept(dept2);
		e4.setDept(dept2);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		System.out.println("Before dept1");
		session.save(dept1);
		System.out.println("Before dept2");
		session.save(dept2);
		System.out.println("Before dept3");
		
		System.out.println("======================================================");
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		
		System.out.println("===================================================");
		
		tr.commit();
	}

}
