package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.MyUser;

public class TestRetrievedata {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		MyUser u1 = session.get(MyUser.class, 101);
		System.out.println("Before");
		System.out.println(u1.getUname());
		System.out.println("After Name");
		System.out.println(u1.getAddr());
		System.out.println("After");

	}

}
