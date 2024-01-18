package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;
import com.demo.model.Project;

public class TestEmployeeProject {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Sanyog");
		Employee e2 = new Employee(2,"Aniket");
		Employee e3 = new Employee(3,"Sudarshan");
		Employee e4 = new Employee(4,"Ram");
		
		Set<Employee> eset=new HashSet<Employee>();
		eset.add(e1);
		eset.add(e2);
		eset.add(e3);
		eset.add(e4);
		
		
		
		Project p1 = new Project(1,"pro1");
		Project p2 = new Project(2,"pro2");
		Project p3 = new Project(3,"Pro3");
		Project p4 = new Project(4,"pro4");
	
		Set<Project> pset1 = new HashSet<Project>();
		pset1.add(p1);
		pset1.add(p2);		
		
		Set<Project> pset2 = new HashSet<Project>();
		pset2.add(p3);
		pset2.add(p4);		
		
		e1.setPset(pset1);
		e2.setPset(pset1);
		e3.setPset(pset2);
		e4.setPset(pset2);
		
		
		p1.setEset(eset);
		p2.setEset(eset);
		p3.setEset(eset);
		p4.setEset(eset);
		
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);

		tr.commit();
	}
	

}
