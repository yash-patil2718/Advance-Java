package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.MyUser;

public class TestMyuserAddress {

	public static void main(String[] args) {

		Address a1 = new Address(1,"Swargate","Pune");
		Address a2 = new Address(2,"Sambhajinager","Sambhajinage");
		MyUser u1 = new MyUser(11,"Ram",a1);
		MyUser u2 = new MyUser(12,"Shyam",a2);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		session.save(a1);
		session.save(a2);
		session.save(u1);
		session.save(u2);
		
		tr.commit();
		

	}

}
