package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.MyUser;

public class TestMyuserAddress {

	public static void main(String[] args) {

		Address a1 = new Address(1,"Baner","Pune");
		Address a2 = new Address(2,"Aundh","Pune");
		MyUser u1 = new MyUser(11,"Aniket",a1);
		MyUser u2 = new MyUser(12,"Sanyog",a2);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();

		session.save(u1);
		session.save(u2);
		
		tr.commit();
		

	}

}
