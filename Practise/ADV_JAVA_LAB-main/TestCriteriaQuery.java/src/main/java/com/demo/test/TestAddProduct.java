package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Product;

public class TestAddProduct {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Product p=new Product(1,"MAggie",10,50);
		Product p1=new Product(2,"Biscuit",10,80);
		Product p2=new Product(3,"Fanta",10,70);
		session.save(p);
		session.save(p1);
		session.save(p2);
		tr.commit();
		session.close();
		sf.close();
	}

}
