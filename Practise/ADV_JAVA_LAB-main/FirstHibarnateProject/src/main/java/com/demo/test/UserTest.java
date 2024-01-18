package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.User;

public class UserTest {

	public static void main(String[] args) {
		
		User u1 = new User(1,"Admin1");
		User u2 = new User(2,"Admin2");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		session.save(u1);
		session.save(u2);
		tr.commit();
				
	}

}
