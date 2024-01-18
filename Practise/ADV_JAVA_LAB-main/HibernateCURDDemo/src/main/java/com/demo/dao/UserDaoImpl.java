package com.demo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.model.MyUser;

public class UserDaoImpl implements UserDao {
	
	static SessionFactory  sf;
	
	static {
		
		sf = HibernateUtil.getMySessionFactory();
		
	}

	public void addNewUser(MyUser u) {
		
		Session sess = sf.openSession();
		
		Transaction tr = sess.beginTransaction();
		
		sess.save(u);
		
		tr.commit();
		
		sess.close();
		
	}

	@Override
	public List<MyUser> DisaplayAll() {
		
		Session sess = sf.openSession();
		
		Transaction tr = sess.beginTransaction();
		
		Query query = sess.createQuery("from MyUser");
		
		List <MyUser> ulist = query.list();
		tr.commit();
		
		sess.close();
		
		return ulist;
	}

	@Override
	public MyUser getById(int uid) {
		 
		Session sess = sf.openSession();
		
		Transaction tr = sess.beginTransaction();
		
		MyUser u = sess.get(MyUser.class, uid);
		
		tr.commit();
		
		sess.close();
		return u ;
	}

	@Override
	public boolean DeleteById(int uid) {
		
		Session sess = sf.openSession();
		
		Transaction tr = sess.beginTransaction();
		
		MyUser u = sess.get(MyUser.class, uid);
		
		if(u!=null)
		{
			sess.delete(u);
			tr.commit();
			sess.close();
			return true;
		}
		sess.close();
		return false;
	}

	@Override
	public boolean updateById(int uid, String unm, String street) {
	
		Session sess = sf.openSession();
		
		Transaction tr = sess.beginTransaction();
		
		MyUser u = sess.get(MyUser.class, uid);
		
		if(u!=null)
		{
			u.setUname(unm);
			u.getAddr().setStreet(street);
			sess.update(u);
			tr.commit();
			sess.close();
			return true;
		}
		sess.close();
		return false;
	}

	@Override
	public List<MyUser> sortById() {
		
		Session sess = sf.openSession();
		
		Transaction tr = sess.beginTransaction();
		
		Query query = sess.createQuery("from MyUser u order by u.uid desc");
		
		List <MyUser> ulist = query.list();
		
		tr.commit();
		
		sess.close();
		return ulist;
	}
	
}
