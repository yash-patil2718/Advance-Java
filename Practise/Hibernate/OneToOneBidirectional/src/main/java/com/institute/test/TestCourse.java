package com.institute.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.instutitu.models.Course;
import com.instutitu.models.Faculty;

public class TestCourse {

	public static void main(String[] args) {
		Faculty f1 = new Faculty();
		f1.setFid(1);
		f1.setFname("Prashant");
		Course c1 = new Course(1, "history", f1);
		f1.setC(c1);
		
		
		//c1.setF(f1);
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		session.save(f1);
		session.save(c1);
		tr.commit();
		session.close();

	}

}
