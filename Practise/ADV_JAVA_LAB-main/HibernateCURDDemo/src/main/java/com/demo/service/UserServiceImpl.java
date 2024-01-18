package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;
import com.demo.model.Address;
import com.demo.model.MyUser;

public class UserServiceImpl implements UserService {
	
	private UserDao udao;
	

	public UserServiceImpl() {
	
		udao = new UserDaoImpl();
	}

	public void addNewUser() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr user id");
		int uid=sc.nextInt();
		System.out.println("enetr user name");
		String uname=sc.next();
		System.out.println("enetr address id");
		int aid=sc.nextInt();
		System.out.println("enetr street");
		String street=sc.next();
		System.out.println("enetr city");
		String city=sc.next();
		
		MyUser u = new MyUser(uid,uname,(new Address(aid,street,city)));
		
		
		udao.addNewUser(u);
		
	}

	@Override
	public List<MyUser> DisaplayAll() {
		List<MyUser> ulist = udao.DisaplayAll();
		return ulist;
	}

	@Override
	public MyUser getById(int uid) {
		
		MyUser u = udao.getById(uid);
		return u;
	}

	@Override
	public boolean DeleteById(int uid) {
		
		return udao.DeleteById(uid);
	}

	@Override
	public boolean UpdateById(int uid, String unm, String street) {
		
		return udao.updateById(uid,unm,street);
	}

	@Override
	public List<MyUser> sortById() {
		
		return udao.sortById();
	}

}
