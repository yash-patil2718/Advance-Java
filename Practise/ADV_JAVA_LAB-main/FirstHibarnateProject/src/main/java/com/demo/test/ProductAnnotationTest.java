package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Product;

public class ProductAnnotationTest {

	public static void main(String[] args) {
		Product p1=new Product("chair11",32,2300);
		Product p2=new Product("table11",16,6000);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(p1);
		session.save(p2);
		tr.commit();
		session.close();
		sf.close();

	}

}