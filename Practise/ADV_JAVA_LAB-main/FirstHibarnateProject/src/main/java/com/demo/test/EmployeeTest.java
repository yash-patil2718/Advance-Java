package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Sanyog",34000);
		Employee e2 = new Employee(2,"Sudarshan",40000);
		Employee e3 = new Employee(3,"Ani",30000);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		tr.commit();

		

	}

}
