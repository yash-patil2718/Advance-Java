package com.demo.service;

import java.util.List;

import com.demo.model.MyUser;

public interface UserService {

	void addNewUser();

	List<MyUser> DisaplayAll();

	MyUser getById(int uid);

	boolean DeleteById(int uid);

	boolean UpdateById(int uid, String unm, String street);

	List<MyUser> sortById();

}
