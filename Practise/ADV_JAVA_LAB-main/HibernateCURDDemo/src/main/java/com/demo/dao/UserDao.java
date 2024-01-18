package com.demo.dao;

import java.util.List;

import com.demo.model.MyUser;

public interface UserDao {

	void addNewUser(MyUser u);

	List<MyUser> DisaplayAll();

	MyUser getById(int uid);

	boolean DeleteById(int uid);

	boolean updateById(int uid, String unm, String street);

	List<MyUser> sortById();
	

}
