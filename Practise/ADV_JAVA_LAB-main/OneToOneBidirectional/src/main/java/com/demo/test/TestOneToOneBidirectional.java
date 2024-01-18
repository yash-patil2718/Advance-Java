package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.MyUser;

public class TestOneToOneBidirectional {

	public static void main(String[] args) {
		
		Address add1 = new Address (1,"Swargate","Pune");
		
		Address add2 = new Address (2,"Katraj","Pune");
		
		MyUser u1 = new MyUser(7,"MSD",add1);
		
		MyUser u2 = new MyUser(8,"JAdeja",add2);
		
		add1.setU(u1);
		add2.setU(u2);
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		
		sess.save(add1);
		sess.save(add2);
		sess.save(u1);
		sess.save(u2);
		
		tr.commit();
		

	}

}
