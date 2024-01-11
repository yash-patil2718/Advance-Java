package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.models.Address;
import com.demo.models.User;


public class TestUser {

	public static void main(String[] args) {
		Address a1 = new Address(1, "gokhalenagar", "pune");
		Address a2 = new Address(2, "Palk Street", "Roha");
		User u1 = new User(1, "prashant", a1);
		User u2 = new User(2, "yash", a2);
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		//session.save(a1);
		//session.save(a2);
		session.save(u1);
		session.save(u2);
		tr.commit();
		session.close();
			
		
	}
}
