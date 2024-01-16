package com.demo.dao;

import com.demo.model.MyUser;

public interface LoginDao {

	MyUser validUser(String unm, String passwd);

}
